package io.chalie.demo;

import static spark.Spark.*;

public class Main {
    static int getRailwayAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }else {
            return 4567;
        }
    }
    public static void main(String[] args) {
        getRailwayAssignedPort();

        get("/hello", (req, res) -> "Hello World");

    }
}