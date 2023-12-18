package com.example.app3.controller;

import com.example.app3.filter.GZIPFilterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GZIPController {
    @Autowired
    private GZIPFilterConfig gzipFilterConfig;


    @GetMapping("/api/data")
    public String getData() {
        // Generate some sample data (replace this with your actual data retrieval logic)
        String data = "mjhjhbjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "kjbjmbjkkkkkkkkkkkkkkkkkkkkkkkkLorem ipsum dolor sit amet,nbvnvhv" +
                "jhjhvjhjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "hjhvhvjhvjhvjhvvhhvh" +
                "jbhvjhvhjv" +
                "nvhvhjvhvvhjvvhv" +
                "" +
                "" +
                "" +
                "hhjvvh" +
                "bjhvhv" +
                " consectetur adipiscing elit.";
        System.out.println( gzipFilterConfig.gzipFilter());

        // Simulate a long response to see the effect of compression
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return data;
    }

    @GetMapping("/hello")
    public String getData1() {
        // Generate some sample data (replace this with your actual data retrieval logic)
        String data = "mjhjhbjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "kjbjmbjkkkkkkkkkkkkkkkkkkkkkkkkLorem ipsum dolor sit amet,nbvnvhv" +
                "jhjhvjhjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "hjhvhvjhvjhvjhvvhhvh" +
                "jbhvjhvhjv" +
                "nvhvhjvhvvhjvvhv" +
                "" +
                "" +
                "" +
                "hhjvvh" +
                "bjhvhv" +
                " consectetur adipiscing elit.";

        System.out.println( gzipFilterConfig.gzipFilter());

        // Simulate a long response to see the effect of compression
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return data;
    }
}

