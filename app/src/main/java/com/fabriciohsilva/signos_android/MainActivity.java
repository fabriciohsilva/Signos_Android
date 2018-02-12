package com.fabriciohsilva.signos_android;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ViewHolder mViewHolder = new ViewHolder();
    private String[] Signos = {
      "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
      "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aguário", "Peixes" };

    private String[] perfis = {
            "Arianos são animados, independentes, individualistas, dinâmicos, corajosos e aventureiros",
            "Taurinos são positivos, pacientes, determinados, noturnos, leais e românticos",
            "Geminianos são positivos, mutáveis, racionais e bastante voláteis",
            "...","...","...","...","...","...","...","...","...",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.listSignos = (ListView) findViewById(R.id.listSignos);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext()
         ,  android.R.layout.simple_list_item_1
         ,  android.R.id.text1
         ,  Signos );

        this.mViewHolder.listSignos.setAdapter(adaptador);

        this.mViewHolder.listSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), perfis[position], Toast.LENGTH_LONG).show();

            }
        });


    }//end protected void onCreate(Bundle savedInstanceState)

    private static class ViewHolder {
        ListView listSignos;
    }//end private static class mviewHolder

}//end public class MainActivity extends Activity