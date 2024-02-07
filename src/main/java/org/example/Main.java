package org.example;

public class Main {
    public static void main(String[] args) {
        //given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //when
        String result = createPhoneNumber(numbers);
        System.out.println(result);
    }

    private static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        //returns "(123) 456-7890"
        sb.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).append(")")
                .append(" ").append(numbers[3]).append(numbers[4]).append(numbers[5]).append("-")
                .append(numbers[6]).append(numbers[7]).append(numbers[8]).append(numbers[9]);

        return sb.toString();
    }
}