package com.arunt.corejava;

public class TestEnumerations {

    enum Season {Summer, winter, fall}

    enum CountryEnum {

        AMERICA("http://www.usa.com"),
        UK("http://www.uk.com");

        private String name;

        CountryEnum(String s) {
            name = s;
            System.out.println(name);
        }


    }


    public static void main(String[] args) {
        System.out.println("Hello");

        Season season = Season.Summer;
        CountryEnum country = CountryEnum.AMERICA;

        switch (season) {
            case Summer:
                System.out.println("I like Summer");
                break;

            case fall:
                System.out.println("I like fall");
                break;
        }

        System.out.println(country.toString());

    }
}
