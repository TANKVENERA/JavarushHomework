package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true)
        {
            String name = bufferedReader.readLine();
            if (!name.equals("сумма")) {
            int a = Integer.parseInt(name);
            sum = sum + a;
        }
        else {
                System.out.println(sum);
                break;
            }
        }

    }
    }


