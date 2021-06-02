package com.uninassau;

import com.uninassau.classes.HB20;

public class Main {

    public static void main(String[] args) {
        HB20 carro = new HB20();
        StringBuilder builder = new StringBuilder();
        builder.append("Carro: ");
        builder.append(carro.getModelo());
        builder.append(" ");
        builder.append(carro.getTipo());
        builder.append(" ");
        builder.append(carro.getAno());
        builder.append("\n");
        builder.append("Fabricado nacionalmente: ");
        builder.append(carro.isMontagemNacional() ? "Sim" : "Não");
        builder.append("\n");
        builder.append("Motor importado: ");
        builder.append(carro.isMotorNacional() ? "Sim" : "Não");
        builder.append("\n");
        builder.append("Ambiente indicado: ");
        builder.append(carro.getAmbiente());
        builder.append("\n");


        System.out.println(builder.toString());
    }
}
