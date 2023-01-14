package uticodes.tutorials.kmmnoteappdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform