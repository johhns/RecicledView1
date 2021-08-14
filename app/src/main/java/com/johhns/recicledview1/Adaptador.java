package com.johhns.recicledview1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<Contactos> aContactos ;

    public Adaptador(ArrayList<Contactos> aContactos) {
        this.aContactos = aContactos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_lista,null,false) ;
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.v_nombre.setText( aContactos.get(position).getNombre() );
        holder.v_telefono.setText(aContactos.get(position).getTelefono());
        holder.v_foto.setImageResource(aContactos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return aContactos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView v_foto ;
        TextView v_telefono, v_nombre ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v_foto     = (ImageView) itemView.findViewById(R.id.ivwFoto);
            v_nombre   = (TextView) itemView.findViewById(R.id.txtTitulo);
            v_telefono = (TextView) itemView.findViewById(R.id.txtTelefono);
        }
    }
}
