package com.thariq.SingletonPattern;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    public void main(String[] args) {

        Abc obj  = new Abc();

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

    }
}
class Abc{
        static  Abc obj = new Abc();
        private Abc(){

        }

        public static Abc getInstance(){
            return obj;
        }


}