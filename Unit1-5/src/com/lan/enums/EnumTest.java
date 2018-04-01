package com.lan.enums;

import java.util.Scanner;

/**
 * @version 2018-3-25
 * 枚举类型
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入大小：SMALL,MEDIUM,LARGE,EXTRA_LARGE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);

        System.out.println("size= " + size);
        System.out.println("abbreviation=" + size.getAbbreviation());

        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job");
        }
    }
}

enum Size {
    SMALL("S","s"),MEDIUM("M","m"),LARGE("L","l"), EXTRA_LARGE("XL","xl");

    // 这里会访问枚举类型的缩写,因为每一个类型都带了参数
    Size(String abbreviation,String d) {
        this.abbreviation = abbreviation;
        this.d=d;
    }

    public String getAbbreviation() {
        return abbreviation;//这里返回的是括号里面的
    }
    private String abbreviation;
    private String d;
}
