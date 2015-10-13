package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cesar on 12/10/2015.
 */
public class LenguajeListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] integers;

    public LenguajeListAdapter(Activity context, String[] itemname, Integer[] integers) {
        super(context, R.layout.fila_lista, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.integers=integers;
    }

    public View getView(int posicion,View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_lista,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.texto_principal);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView etxDescripcion = (TextView) rowView.findViewById(R.id.texto_secundario);

        txtTitle.setText(itemname[posicion]);
        imageView.setImageResource(integers[posicion]);
        etxDescripcion.setText("Description "+itemname[posicion]);

        return rowView;
    }


}
