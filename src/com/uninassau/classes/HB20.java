package com.uninassau.classes;

import com.uninassau.interfaces.Montagem;
import com.uninassau.interfaces.Motor;
import com.uninassau.interfaces.Categoria;

public class HB20 implements Montagem, Motor, Categoria {
    @Override
    public String getAno() {
        return "2020";
    }

    @Override
    public String getModelo() {
        return "HB20 Stantard";
    }

    @Override
    public boolean isMotorNacional() {
        return false;
    }

    @Override
    public boolean isMontagemNacional() {
        return true;
    }

    @Override
    public String getTipo() {
        return "Sedã";
    }

    @Override
    public String getAmbiente() {
        return "Urbano";
    }
}
