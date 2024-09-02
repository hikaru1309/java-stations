package com.example.station6;

public class Main {
    public static void main(String[] args) {
        // ここから
        int userA = 23;
        int userB = 36;
        int userC = 31;
        int userD = 48;
        int userE = 58;
        int[] users = new int[5];
        users[0] = userA;
        users[1] = userB;
        users[2] = userC;
        users[3] = userD;
        users[4] = userE;
        int all = users[0] + users[1] + users[2] + users[3] + users[4];
        double dbl = (double) all / 5;
        System.out.println(dbl);
        // ここまで
    }
}
