package server;

import spark.Spark;

public class Router {
    private static Router _instance;

    private Router() {
    }

    public static Router instance() {
        if(_instance == null) {
            _instance = new Router();
        }
        return _instance;
    }

    public void configurar() {
        Spark.staticFileLocation("/public");

        ConversorController conversorController = new ConversorController();
        Spark.get("/conversor/millas", conversorController::convertirAMillas);
    }
}
