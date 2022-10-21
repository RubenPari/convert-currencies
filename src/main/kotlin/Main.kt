import io.github.cdimascio.dotenv.dotenv
import io.javalin.Javalin
import routes.setRoutes

fun main() {
    val dotenv = dotenv()
    var app = Javalin.create()

    app = setRoutes(app)

    app.start(dotenv["PORT"].toInt())
}