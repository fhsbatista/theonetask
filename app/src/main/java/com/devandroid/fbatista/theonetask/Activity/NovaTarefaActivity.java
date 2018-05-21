package com.devandroid.fbatista.theonetask.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.devandroid.fbatista.theonetask.R;

import java.lang.reflect.Array;

import fr.ganfra.materialspinner.MaterialSpinner;

public class NovaTarefaActivity extends AppCompatActivity {

    private EditText mDescricaoTarefa;
    private MaterialSpinner mPrioridadeTarefa;
    private MaterialSpinner mCategoriaTarefa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa);

        mDescricaoTarefa = findViewById(R.id.et_descricao_tarefa);
        mPrioridadeTarefa = findViewById(R.id.sp_prioridade);
        mCategoriaTarefa = findViewById(R.id.sp_categoria);

        ArrayAdapter<CharSequence> adapterPrioridade = ArrayAdapter.createFromResource(
                this, R.array.prioridades, android.R.layout.simple_spinner_item);
        adapterPrioridade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mPrioridadeTarefa.setAdapter(adapterPrioridade);

        ArrayAdapter<CharSequence> adapterCategoria = ArrayAdapter.createFromResource(
                this, R.array.categorias, android.R.layout.simple_spinner_item);
        adapterCategoria.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mCategoriaTarefa.setAdapter(adapterCategoria);
    }
}
