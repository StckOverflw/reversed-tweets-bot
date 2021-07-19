package de.stckoverflw.reversetweets.config

object Config {

    val TWITTER_BEARER_TOKEN: String by getEnv()
    val TWITTER_API_KEY: String by getEnv()
    val TWITTER_API_SECRET: String by getEnv()
    val TWITTER_ACCESS_TOKEN: String by getEnv()
    val TWITTER_ACCESS_SECRET: String by getEnv()

    val IMAGINARY_URL: String by getEnv()
}