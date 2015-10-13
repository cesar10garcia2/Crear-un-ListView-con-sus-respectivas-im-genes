package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String lenguajeProgramacion[]=new String[]{"Java","PHP","Python","JavaScript","Ruby","C",
            "Go","Perl","Pascal"};

    private Integer[] imgid={
            R.drawable.java,
            R.drawable.php,
            R.drawable.python,
            R.drawable.javascript,
            R.drawable.ruby,
            R.drawable.c,
            R.drawable.go,
            R.drawable.perl,
            R.drawable.pascal
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,lenguajeProgramacion,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
