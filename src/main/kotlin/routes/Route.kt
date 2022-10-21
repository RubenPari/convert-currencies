package routes

import controllers.toGBP
import controllers.toJPY
import controllers.toUSD
import io.javalin.Javalin

fun setRoutes(app: Javalin): Javalin {
    // USA dollar
    app.get("/EUR/toUSD") { ctx ->
        toUSD(ctx)
    }

    // japanese Yen
    app.get("/EUR/toJPY") { ctx ->
        toJPY(ctx)
    }

    // UK pound
    app.get("/EUR/toGBP") { ctx ->
        toGBP(ctx)
    }

    return app
}

