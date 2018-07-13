package app.controllers;

import app.models.PixelLoader;
import app.services.Constants;
import org.javalite.activeweb.AppController;

/**
 * Created by monagomaa on 27/01/18.
 */
public class PxController extends AppController {

    public void index(){
        String pid = param("pid");
        PixelLoader pxModel = new PixelLoader();

        PixelLoader getInstance = PixelLoader.findFirst("pid = ?", pid);

        if(getInstance == null){
            getInstance = pxModel.create(Integer.parseInt(pid),
                                        Constants.DEFAULT_SEQUANCE,
                                        Constants.PIXEL_A,
                                        Constants.PIXEL_B,
                                        Constants.DEFAULT_CURRENT);
        }

        int getCurrent = getInstance.getInteger("current") ;
        String currentSeqNumber = "seq" + getCurrent;
        String currentSeq = getInstance.getString(currentSeqNumber);
        String currentPixel = getInstance.getString(("pixel_" + currentSeq));
        // number of sequences base 1
        getCurrent = (getCurrent + 1 ) % (Constants.NUMBER_OF_SEQ + 1);
        if(getCurrent == 0)
            getCurrent++;
        getInstance.set("current", getCurrent);
        getInstance.saveIt();
        respond(currentPixel)
                .header("Access-Control-Allow-Origin", "*" )
                .contentType("text/javascript")
                .status(200);

    }
}