package com.ingegachuz.mascotas.presentador;

import android.content.Context;

import com.ingegachuz.mascotas.adapter.MascotaAdaptador;
import com.ingegachuz.mascotas.db.ConstructorMascotas;
import com.ingegachuz.mascotas.fragment.IRecyclerViewFragmentView;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Ing_Gachuz on 12/06/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }


    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
