package controllers;

import play.mvc.*;
import views.html.*;

public class LoginController extends Controller {

    public Result login() {
        return ok(loginpage.render());
    }

}
