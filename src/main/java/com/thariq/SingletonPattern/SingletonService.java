package com.thariq.SingletonPattern;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    public static void main(String[] args) {

       /* this type of object cannot be created for Siingleton class, since the default constructor is made private
       Abc obj  = new Abc();
       */

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

    }
}
class Abc{
        static  Abc obj = new Abc();  /* Static instance of the class */
        private Abc(){  }   /* the default constructor is made private */

    /* static method is created for that class to return instance of that class */
        public static Abc getInstance(){
            return obj;
        }


}