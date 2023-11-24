package com.atenea.practicaviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.atenea.practicaviewmodel.Models.Models;
import com.atenea.practicaviewmodel.Models.Usuario;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Usuario> result;
    public MyViewModel()
    {
        result = new MutableLiveData<>();
    }
    public LiveData<Usuario> getResult()
    {
        return result;
    }
    public void registrarV(Usuario usuario)
    {
         result.setValue(Models.registrar(usuario));
    }
}
