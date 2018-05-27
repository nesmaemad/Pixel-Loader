package app.controllers;

import app.services.GenericQuerySegmentService;
import org.javalite.activeweb.AppController;
import org.rosuda.REngine.Rserve.RserveException;

/**
 * Created by monagomaa on 27/01/18.
 */
public class GenericQuerySegmentController extends AppController {

    public void index() throws RserveException {
        String modelId = param("modelId");

        respond(modelId).header("Access-Control-Allow-Origin", "*").status(200);
    }
}