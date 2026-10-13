package com.soquadrinhos.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    LinearLayout layout = new LinearLayout(this);
    layout.setOrientation(LinearLayout.VERTICAL);
    layout.setGravity(Gravity.CENTER);
    layout.setPadding(32, 32, 32, 32);
    layout.setBackgroundColor(Color.rgb(18, 18, 30));

    TextView titulo = new TextView(this);
    titulo.setText("SÓ QUADRINHOS");
    titulo.setTextSize(30);
    titulo.setTextColor(Color.WHITE);
    titulo.setGravity(Gravity.CENTER);

    TextView mensagem = new TextView(this);
    mensagem.setText("Seu universo de histórias começa aqui!");
    mensagem.setTextSize(18);
    mensagem.setTextColor(Color.LTGRAY);
    mensagem.setGravity(Gravity.CENTER);
    mensagem.setPadding(0, 24, 0, 24);

    TextView destaque = new TextView(this);
    destaque.setText("📚 EM BREVE: SEUS QUADRINHOS FAVORITOS");
    destaque.setTextSize(16);
    destaque.setTextColor(Color.YELLOW);
    destaque.setGravity(Gravity.CENTER);

    layout.addView(titulo, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT));

    layout.addView(mensagem, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT));

    layout.addView(destaque, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT));

    setContentView(layout);
}

}
