package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("==프로그램 시작==");
    Scanner sc = new Scanner(System.in);

    while(true) {

      System.out.println("명령어) ");
      String cmd = sc.nextLine();

      if (cmd.length() == 0) {
        System.out.println("명령어를 입력하세요.");
        continue;
      }


      if (cmd.equals("system exit")) {
        break;

      }
      if (cmd.equals("article wirte")){
        System.out.println("제목 : ");
        System.out.println("내용 : ");
        String body = sc.nextLine();
      }
    }

    sc.close();

    System.out.println("== 프로그램 종료==");

  }
}