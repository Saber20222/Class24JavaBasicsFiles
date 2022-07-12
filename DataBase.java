package com.syntax.class24;

import javax.xml.crypto.Data;

public abstract class DataBase {
    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeTheDatabase(){
        System.out.println("Terminate the connection to close it");
    }

}
    class Informix extends DataBase{

        @Override
        void open() {
            System.out.println(" Opening the Informix database");
        }

        @Override
        void readData() {
            System.out.println(" Reading the data from the Informix");
        }

        @Override
        boolean writeData() {

            System.out.println(" Data written successfully");
            return false;

        }
    }

        class mySQLServer extends DataBase{

            @Override
            void open() {
                System.out.println(" Opening the mySQLServer database");
            }

            @Override
            void readData() {
                System.out.println(" Reading the data from the Informix");
            }

            @Override
            boolean writeData() {

                System.out.println(" Data written successfully");
                return false;
            }
        }