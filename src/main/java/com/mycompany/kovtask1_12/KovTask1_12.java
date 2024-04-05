package com.mycompany.KovTask1_12;

import com.mirea.kt.example.Message;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
public class KovTask1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 2 Ковальчук Артем Викторович");
        System.out.print("Введите путь к файлу для десериализации: ");
        String filePath = scanner.nextLine();
        Thread deserializationThread = new Thread(() -> {
            try (FileInputStream fileInputStream = new FileInputStream(filePath);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                Message message = (Message) objectInputStream.readObject();
                System.out.println("ID: " + message.getId());
                System.out.println("Body: " + message.getBody());
                System.out.println("Type: " + message.getType());
                System.out.println("Has Attachments: " + message.isHasAttachments());
                System.out.println("Timestamp: " + message.getTimestamp());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        deserializationThread.start();
    }
}

