package edu.miu.cs489.apsdquiz1;

import edu.miu.cs489.apsdquiz1.factory.ContactFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class ApsdQuiz1Application {

    public static void main(String[] args) {
        SpringApplication.run(ApsdQuiz1Application.class, args);

        ContactFactory.init();
        ContactFactory.printJSONFormat();
    }
}
