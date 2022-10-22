package routes

import controllers.toGBP
import controllers.toJPY
import controllers.toUSD
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path

fun setRoutes(app: Javalin): Javalin {
    app.routes {
        path("EUR") {
            get("toUSD", ::toUSD)
            get("toGBP", ::toGBP)
            get("toJPY", ::toJPY)
        }
    }
    return app
}

