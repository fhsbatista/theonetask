package com.devandroid.fbatista.theonetask.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.devandroid.fbatista.theonetask.R;

public class NovaTarefaActivity extends AppCompatActivity {

    private EditText mDescricaoTarefa;
    private Spinner mPrioridadeTarefa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa);

        mDescricaoTarefa = findViewById(R.id.et_descricao_tarefa);
        mPrioridadeTarefa = findViewById(R.id.sp_prioridade);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.prioridades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mPrioridadeTarefa.setAdapter(adapter);
    }
}
