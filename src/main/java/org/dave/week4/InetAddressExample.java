package org.dave.week4;

import java.net.*;
public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        // Получаем объект InetAddress по имени хоста
        InetAddress address = InetAddress.getByName("www.google.com");
        // Выводим имя хоста
        System.out.println("Host Name: " + address.getHostName());
        // Выводим IP-адрес
        System.out.println("IP Address: " + address.getHostAddress());
    }
}
