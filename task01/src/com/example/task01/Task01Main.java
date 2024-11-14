package com.example.task01;

import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        byte[] data = new byte[]{0x33, 0x45, 0x01};
        InputStream InputStream = new java.io.ByteArrayInputStream(data);
        System.out.println(checkSumOfStream(InputStream));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;
        int data;

        if (inputStream == null) {
            throw new IllegalArgumentException("Не верное значение");
        }
        while ((data = inputStream.read()) != -1) {
            checksum = Integer.rotateLeft(checksum, 1) ^ data;
        }
        return checksum;
    }
}
