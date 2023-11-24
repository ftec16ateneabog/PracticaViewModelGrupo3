package com.atenea.practicaviewmodel.Models;

public class Models {
    public static Usuario _usuario = new Usuario("usuarioNombre",25,"12345");
    public static Usuario registrar(Usuario usuario)
    {
        _usuario = usuario;
        return _usuario;
    }
}
