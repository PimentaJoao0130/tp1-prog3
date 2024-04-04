package com.grupo2;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeitorDeArquivo {
  public LeitorDeArquivo(String caminhoData) {

    try {
      BufferedReader buffer = new BufferedReader(new FileReader(caminhoData));
      String linha = buffer.readLine();
      ;
      while ((linha = buffer.readLine()) != null) {
        String[] splitLinha = linha.split(",");
        Video video = new Video(converteStringParaInt(splitLinha[0]), splitLinha[1], converteStringParaInt(splitLinha[2]), converteStringParaInt(splitLinha[3]), splitLinha[4], splitLinha[5], splitLinha[6], converteStringParaInt(splitLinha[7]), converteStringParaInt(splitLinha[8]), converteStringParaInt(splitLinha[9]), converteStringParaInt(splitLinha[10]), converteStringParaInt(splitLinha[11]));
        System.out.println("Trava");
      }
    } catch (Exception e) {
      System.err.println(e);
    }

  }

  public int converteStringParaInt(String texto){
    return Integer.parseInt(texto);
  }
}