package com.company;

import com.company.model.Curriculo;
import com.company.model.Endereco;
import com.company.model.LivroPdf;
import com.company.model.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> habilidades = new ArrayList<>();
        habilidades.add("Programadora Java");
        habilidades.add("Fluente em Espanhol");
        habilidades.add("Programadora Front-end");

        Curriculo curriculo = new Curriculo("Carol", "15", new Endereco("Rua das Rosas", 34, "37570-000"), habilidades);
        curriculo.imprimir();

        LivroPdf livro = new LivroPdf(30, "Alberto Caeiro", "O guardador de rebanhos", "Poesia");
        livro.imprimir();

        Relatorio relatorio = new Relatorio(20, 50, "José Siqueira", "Ana Luiza");
        relatorio.imprimir();
    }
}