package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int previousByte = -1;
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            if (previousByte == 13 && currentByte == 10) {

                System.out.write(10);
                previousByte = -1;
            } else {
                if (previousByte != -1) {
                    System.out.write(previousByte);
                }
                previousByte = currentByte;
            }
        }

        if (previousByte != -1) {
            System.out.write(previousByte);
        }

        System.out.flush();
    }
}
