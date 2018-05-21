package com.devandroid.fbatista.theonetask.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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
    private Toolbar mToolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tarefa);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_novatarefa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_novatarefa_fechar:
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
