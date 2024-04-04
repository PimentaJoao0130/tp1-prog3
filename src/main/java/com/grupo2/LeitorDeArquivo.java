package com.grupo2;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeitorDeArquivo {
    public LeitorDeArquivo(String caminhoData) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(caminhoData));
            String linha;

            while ((linha = buffer.readLine()) != null) {
                String[] splitLinha = linha.split(",");
                if (splitLinha.length == 12) { // Verifica se há 12 partes na linha
                    Video video = new Video(
                        converteStringParaInt(splitLinha[0]),
                        splitLinha[1],
                        converteStringParaInt(splitLinha[2]),
                        converteStringParaInt(splitLinha[3]),
                        splitLinha[4],
                        splitLinha[5],
                        splitLinha[6],
                        converteStringParaInt(splitLinha[7]),
                        converteStringParaInt(splitLinha[8]),
                        converteStringParaInt(splitLinha[9]),
                        converteStringParaInt(splitLinha[10]),
                        converteStringParaInt(splitLinha[11])
                    );
                    System.out.println("Trava");
                } else {
                    System.out.println("Linha inválida: " + linha);
                }
            }

            buffer.close(); // Fecha o BufferedReader
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public int converteStringParaInt(String texto) {
        return Integer.parseInt(texto);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        LeitorDeArquivo leitor = new LeitorDeArquivo("caminho/do/arquivo.txt");
    }
}

