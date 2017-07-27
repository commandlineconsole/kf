package edu;

import java.io.*;

    public class SerializeDemo {

        // Serializable

        public static class Employee implements java.io.Serializable {

            public String name;
            public String address;
            public transient int SSN;  //   public transient int SSN
            public int number;

          /*  public void mailCheck() {
                System.out.println("Mailing a check to " + name + " " + address);
            }*/
        }

        public static void main(String [] args) {

            Employee e = new Employee();

            e.name = "Reyan Ali";
            e.address = "Phokka Kuan, Ambehta Peer";
            e.SSN = 1112;
            e.number = 101;


            try {
                FileOutputStream fileOut =
                        new FileOutputStream("C:\\msg\\kafka\\kf\\kf\\README12.md");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(e);
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in /tmp/employee.ser");
            }catch(IOException i) {
                i.printStackTrace();
            }

//  Deserialized

            Employee e1 = null;
            try {
                FileInputStream fileIn = new FileInputStream("C:\\msg\\kafka\\kf\\kf\\README12.md");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                e1 = (Employee) in.readObject();
                in.close();
                fileIn.close();
            }catch(IOException i) {
                i.printStackTrace();
                return;
            }catch(ClassNotFoundException c) {
                System.out.println("Employee class not found");
                c.printStackTrace();
                return;
            }

            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + e1.name);
            System.out.println("Address: " + e1.address);
            System.out.println("SSN: " + e1.SSN);
            System.out.println("Number: " + e1.number);

        }
    }




