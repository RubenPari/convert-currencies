package controllers

import com.github.kittinunf.fuel.Fuel
import io.javalin.http.Context
import io.github.cdimascio.dotenv.dotenv

fun toUSD(ctx: Context) {
    val baseUrl = dotenv()["BASE_URL"] + "/" + dotenv()["API_KEY"] + "/latest/EUR"

    val response = Fuel.get(baseUrl)

    val responseJson = response.responseString().third.get()

    val rate = responseJson.split("USD")[1].split(":")[1].split(",")[0]

    val result = mapOf("rate" to rate)

    ctx.json(result)
}

fun toJPY(ctx: Context) {
    val baseUrl = dotenv()["BASE_URL"] + "/" + dotenv()["API_KEY"] + "/latest/EUR"

    val response = Fuel.get(baseUrl)

    val responseJson = response.responseString().third.get()

    val rate = responseJson.split("JPY")[1].split(":")[1].split(",")[0]

    val result = mapOf("rate" to rate)

    ctx.json(result)
}

fun toGBP(ctx: Context) {
    val baseUrl = dotenv()["BASE_URL"] + "/" + dotenv()["API_KEY"] + "/latest/EUR"

    val response = Fuel.get(baseUrl)

    val responseJson = response.responseString().third.get()

    val rate = responseJson.split("GBP")[1].split(":")[1].split(",")[0]

    val result = mapOf("rate" to rate)

    ctx.json(result)
}