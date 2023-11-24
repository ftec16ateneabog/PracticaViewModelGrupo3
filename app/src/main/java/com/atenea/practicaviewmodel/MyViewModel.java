package com.atenea.practicaviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.atenea.practicaviewmodel.Models.Models;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> result;
    public MyViewModel()
    {
        result = new MutableLiveData<>();
    }
    public LiveData<Integer> getResult()
    {
        return result;
    }
    public void agregar(int data)
    {
         result.setValue(Models.agregar(data));
    }
}
