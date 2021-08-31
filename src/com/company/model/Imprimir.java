package com.company.model;

import java.util.List;

public abstract class Imprimir {

    public static void imprimir(Object doc) {
        if (doc instanceof Relatorio) {
            Relatorio rel = (Relatorio) doc;
            System.out.println("Imprimindo Relatorio=> Autor:" + rel.getAutor() + " | Revisor:" + rel.getRevisor() + " | Número de páginas:" + rel.getNumPaginas() + " | Comprimento do texto:" + rel.getTextoComprimento());
        } else if (doc instanceof LivroPdf) {
            LivroPdf livro = (LivroPdf) doc;
            System.out.println("Imprimindo livro em PDF=> Autor:" + livro.getNomeAutor() + " | Titulo:" + livro.getTitulo() + " | Genero:" + livro.getGenero() + " | Número de Páginas:" + livro.getNumPaginas());
        } else if (doc instanceof Curriculo) {
            Curriculo curriculo = (Curriculo) doc;
            List<String> items = curriculo.getPessoa().getHabilidades();
            String habilidades = String.join(", ", items);
            System.out.println("Imprimindo Curriculo=> " +
                    "Nome:" + curriculo.getPessoa().getNome() +
                    " | Endereço:" + curriculo.getPessoa().getEndereco().getEndereco() + " " + curriculo.getPessoa().getEndereco().getNumero() +
                    " | Habilidades:" + habilidades);
        }
    }
}