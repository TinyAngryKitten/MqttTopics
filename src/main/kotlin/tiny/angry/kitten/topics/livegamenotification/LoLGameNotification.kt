package tiny.angry.kitten.topics.livegamenotification

object LoLGameNotification {
    val topic = "game/league/+"

    fun createTopicForUser(username : String) = topic.replace("+",username)
}