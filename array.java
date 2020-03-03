package com.horstmann.corejava.XO;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[][] field = new int [3][3];
        int value = 0;

        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++){
                value += field[i][j];
                System.out.println("Выберите ячейку");
                Scanner sc = new Scanner(System.in);
                int sc_value = sc.nextInt();

                if (sc_value == 1) {
                    if (field[0][0] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc1 = new Scanner(System.in);
                        String val1 = sc1.nextLine();
                        if (val1.equals("x")) {
                            field[0][0] += 1;
                            if (field[0][0] == 1){
                                if (field[0][1] == 1){
                                    if (field[0][2] == 1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            if (field[0][0] == 1){
                                if (field[1][0] == 1){
                                    if (field[2][0] == 1){
                                        System.out.println("win x");
                                    }
                                }
                            }
                            if (field[0][0] == 1){
                                if (field[1][1] == 1){
                                    if (field[2][2] == 1){
                                        System.out.println("win x");
                                    }
                                }
                            }
                            System.out.println("В ячейке 1 значение Х");
                            System.out.println("Ход O");
                        } else if (val1.equals("o")) {
                            field[0][0] -= 1;
                            if (field[0][0] == -1){
                                if (field[0][1] == -1){
                                    if (field[0][2] == -1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            if (field[0][0] == -1){
                                if (field[1][0] == -1){
                                    if (field[2][0] == -1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            if (field[0][0] == -1){
                                if (field[1][1] == -1){
                                    if (field[2][2] == -1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            System.out.println("В ячейке 1 значение O");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 2){
                    if(field[0][1] == 0){
                        System.out.println("x/o ?");
                        Scanner sc2 = new Scanner(System.in);
                        String val2 = sc2.nextLine();
                        if(val2.equals("x")){
                            field[0][1] += 1;
                            if (field[0][1] == 1){
                                if (field[0][0] == 1){
                                    if (field[0][2] == 1){
                                        System.out.println("win x");
                                    }
                                }
                            }
                            if (field[0][1] == 1){
                                if (field[1][1] == 1){
                                    if (field[2][1] == 1){
                                        System.out.println("win x");
                                    }
                                }
                            }
                            System.out.println("В ячейке 2 значение Х");
                            System.out.println("Ход O");
                        } else if (val2.equals("o")){
                            field[0][1] -= 1;
                            if (field[0][1] == -1){
                                if (field[0][0] == -1){
                                    if (field[0][2] == -1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            if (field[0][1] == -1){
                                if (field[1][1] == -1){
                                    if (field[2][1] == -1){
                                        System.out.println("win o");
                                    }
                                }
                            }
                            System.out.println("В ячейке 2 значение O");
                            System.out.println("Ход X");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 3) {
                    if (field[0][2] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc3 = new Scanner(System.in);
                        String val3 = sc3.nextLine();
                        if (val3.equals("x")) {
                            field[0][2] += 1;
                            if (field[0][2] == 1){
                                if (field[0][1] == 1){
                                    if (field[0][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[0][2] == 1){
                                if (field[1][2] == 1){
                                    if (field[2][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[0][2] == 1){
                                if (field[1][1] == 1){
                                    if (field[2][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 3 значение Х");
                            System.out.println("Ход O");
                        } else if (val3.equals("o")) {
                            field[0][2] -= 1;
                            if (field[0][2] == -1){
                                if (field[0][1] == -1){
                                    if (field[0][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[0][2] == -1){
                                if (field[1][2] == -1){
                                    if (field[2][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[0][2] == -1){
                                if (field[1][1] == -1){
                                    if (field[2][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 3 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 4) {
                    if (field[1][0] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc4 = new Scanner(System.in);
                        String val4 = sc4.nextLine();
                        if (val4.equals("x")) {
                            field[1][0] += 1;
                            if (field[1][0] == 1){
                                if (field[1][1] == 1){
                                    if (field[1][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[1][0] == 1){
                                if (field[0][0] == 1){
                                    if (field[2][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 4 значение Х");
                            System.out.println("Ход O");
                        } else if (val4.equals("o")) {
                            field[1][0] -= 1;
                            if (field[1][0] == -1){
                                if (field[1][1] == -1){
                                    if (field[1][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[1][0] == -1){
                                if (field[0][0] == -1){
                                    if (field[2][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 4 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 5) {
                    if (field[1][1] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc5 = new Scanner(System.in);
                        String val5 = sc5.nextLine();
                        if (val5.equals("x")) {
                            field[1][1] += 1;
                            if (field[1][1] == 1){
                                if (field[1][0] == 1){
                                    if (field[1][3] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[1][1] == 1){
                                if (field[2][1] == 1){
                                    if (field[0][1] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[1][1] == 1){
                                if (field[0][0] == 1){
                                    if (field[2][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[1][1] == 1){
                                if (field[0][2] == 1){
                                    if (field[2][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 5 значение Х");
                            System.out.println("Ход O");
                        } else if (val5.equals("o")) {
                            field[1][1] -= 1;
                            if (field[1][1] == -1){
                                if (field[1][0] == -1){
                                    if (field[1][3] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[1][1] == -1){
                                if (field[2][1] == -1){
                                    if (field[0][1] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[1][1] == -1){
                                if (field[0][0] == -1){
                                    if (field[2][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[1][1] == -1){
                                if (field[0][2] == -1){
                                    if (field[2][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 5 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 6) {
                    if (field[1][2] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc6 = new Scanner(System.in);
                        String val6 = sc6.nextLine();
                        if (val6.equals("x")) {
                            field[1][2] += 1;
                            if (field[1][2] == 1){
                                if (field[1][1] == 1){
                                    if (field[1][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[1][2] == 1){
                                if (field[2][2] == 1){
                                    if (field[0][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 6 значение Х");
                            System.out.println("Ход O");
                        } else if (val6.equals("o")) {
                            field[1][2] -= 1;
                            if (field[1][2] == -1){
                                if (field[1][1] == -1){
                                    if (field[1][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[1][2] == -1){
                                if (field[2][2] == -1){
                                    if (field[0][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 6 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 7) {
                    if (field[2][0] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc7 = new Scanner(System.in);
                        String val7 = sc7.nextLine();
                        if (val7.equals("x")) {
                            field[2][0] += 1;
                            if (field[2][0] == 1){
                                if (field[1][0] == 1){
                                    if (field[0][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][0] == 1){
                                if (field[2][1] == 1){
                                    if (field[2][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][0] == 1){
                                if (field[1][1] == 1){
                                    if (field[0][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 7 значение Х");
                            System.out.println("Ход O");
                        } else if (val7.equals("o")) {
                            field[2][0] -= 1;
                            if (field[2][0] == -1){
                                if (field[1][0] == -1){
                                    if (field[0][0] == -1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][0] == -1){
                                if (field[2][1] == -1){
                                    if (field[2][2] == -1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][0] == -1){
                                if (field[1][1] == -1){
                                    if (field[0][2] == -1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 7 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 8) {
                    if (field[2][1] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc8 = new Scanner(System.in);
                        String val8 = sc8.nextLine();
                        if (val8.equals("x")) {
                            field[2][1] += 1;
                            if (field[2][1] == 1) {
                                if (field[2][0] == 1){
                                    if (field[2][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][1] == 1){
                                if (field[1][1] == 1){
                                    if (field[0][1] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 8 значение Х");
                            System.out.println("Ход O");
                        } else if (val8.equals("o")) {
                            field[2][1] -= 1;
                            if (field[2][1] == -1) {
                                if (field[2][0] == -1){
                                    if (field[2][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[2][1] == -1){
                                if (field[1][1] == -1){
                                    if (field[0][1] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 8 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
                if (sc_value == 9) {
                    if (field[2][2] == 0) {
                        System.out.println("x/o ?");
                        Scanner sc9 = new Scanner(System.in);
                        String val9 = sc9.nextLine();
                        if (val9.equals("x")) {
                            field[2][2] += 1;
                            if (field[2][2] == 1){
                                if (field[2][1] == 1){
                                    if (field[2][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][2] == 1){
                                if (field[1][2] == 1){
                                    if (field[0][2] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            if (field[2][2] == 1){
                                if (field[1][1] == 1){
                                    if (field[0][0] == 1){
                                        System.out.println("x win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 9 значение Х");
                            System.out.println("Ход O");
                        } else if (val9.equals("o")) {
                            field[2][2] -= 1;
                            if (field[2][2] == -1){
                                if (field[2][1] == -1){
                                    if (field[2][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[2][2] == -1){
                                if (field[1][2] == -1){
                                    if (field[0][2] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            if (field[2][2] == -1){
                                if (field[1][1] == -1){
                                    if (field[0][0] == -1){
                                        System.out.println("o win");
                                    }
                                }
                            }
                            System.out.println("В ячейке 9 значение O");
                            System.out.println("Ход Х");
                        } else {
                            System.out.println("Некорректный ввод");
                        }
                    } else {
                        System.out.println("Ячейка занята");
                    }
                }
            }
        }


        }


    }
