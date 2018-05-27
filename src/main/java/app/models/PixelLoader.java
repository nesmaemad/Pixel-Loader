package app.models;

import org.javalite.activejdbc.Model;

/**
 * Created by monagomaa on 17/01/18.
 */
public class PixelLoader extends Model {

    public PixelLoader create(int pid, String seq[],String pixel_a, String pixel_b,  int current){
       return  PixelLoader.createIt("pid", pid,
                "pixel_a", pixel_a,
                "pixel_b", pixel_b,
                "seq1", seq[0],
                "seq2", seq[1],
                "seq3", seq[2],
                "seq4", seq[3],
                "seq5", seq[4],
                "seq6", seq[5],
                "seq7", seq[6],
                "seq8", seq[7],
                "seq9", seq[8],
                "seq10", seq[9],
                "current", current);


    }

}
