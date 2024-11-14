package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null || charset == null) throw new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        char[] buffer = new char[1024];
        int numCharRead;

        try (Reader reader = new InputStreamReader(inputStream, charset)){
            while ((numCharRead = reader.read(buffer)) != -1)
            {
                stringBuilder.append(buffer, 0 ,numCharRead);
            }
        }

        return stringBuilder.toString();
    }
}
