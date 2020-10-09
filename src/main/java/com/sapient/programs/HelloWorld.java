package com.sapient.programs;

import com.sapient.service.GreetingService;

public class HelloWorld {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        String msg = service.greet("Vinod", "Bangalore");
        System.out.println("********************************************");
        System.out.println(msg);
        System.out.println("********************************************");
    }
}
