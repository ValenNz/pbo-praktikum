package modul07.Abstract;

public class MainAbstract {
    public static void main(String[] args) {
        // Employee adalah abstract class, TIDAK BISA dibuat objek langsung
        // Employee emp = new Employee("John", "Doe", "123-45-6789"); // ERROR!

        // Membuat objek dari subclass SalariedEmployee
        SalariedEmployee emp1 = new SalariedEmployee(
                "Budi", "Santoso", "111-22-3333", 8000000);

        SalariedEmployee emp2 = new SalariedEmployee(
                "Siti", "Nurhaliza", "444-55-6666", 10000000);

        System.out.println("=== DATA KARYAWAN ===\n");

        // Menampilkan informasi employee menggunakan toString()
        System.out.println(emp1.toString());
        System.out.println("Earnings: Rp " + String.format("%,.2f", emp1.earnings()));
        System.out.println();

        System.out.println(emp2.toString());
        System.out.println("Earnings: Rp " + String.format("%,.2f", emp2.earnings()));
        System.out.println();

        // Polymorphism: reference parent, object child
        Employee emp3 = new SalariedEmployee("Ahmad", "Rizki", "777-88-9999", 7500000);
        System.out.println("Polymorphism Example:");
        System.out.println(emp3.toString());
        System.out.println("Earnings: Rp " + String.format("%,.2f", emp3.earnings()));
    }
}
