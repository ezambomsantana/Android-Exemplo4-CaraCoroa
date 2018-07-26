package com.example.eduardo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {

    ImageView botaoVoltar;
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltar = findViewById(R.id.botaoVoltar);
        imagem = findViewById(R.id.imagem);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });

        Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            System.out.println("$##########################" + extras.getInt("valor"));
            int valor = extras.getInt("valor");
            if (valor == 0) {
                imagem.setImageDrawable(getResources().getDrawable(R.drawable.moeda_cara));
            } else if (valor == 1) {
                imagem.setImageDrawable(getResources().getDrawable(R.drawable.moeda_coroa));
            }
        }

    }
}
