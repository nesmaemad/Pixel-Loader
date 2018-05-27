package app.config;

import app.controllers.PixelLoaderController;
import app.models.PixelLoader;
import org.javalite.activeweb.AbstractRouteConfig;
import org.javalite.activeweb.AppContext;

/**
 * Created by monagomaa on 27/05/18.
 */
public class RouteConfig extends AbstractRouteConfig {
    public void init(AppContext appContext) {
        route("/{action}").to(PixelLoaderController.class);
    }

}