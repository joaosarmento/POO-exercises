package com.meli.javatest.Exception;

public class ValorInvalidoException extends RuntimeException{

    public ValorInvalidoException(double valor){
        super("Valor inválido: "+ valor);
    }
}