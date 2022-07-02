package pers.git.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("hello,git1111");
        System.out.println("hello,git2222");
        System.out.println("hello,git3333——hot_fix");
        System.out.println("push test");
    }

}
