package tiny.angry.kitten.topics.actions

object MqttActionTopics {
    val topic = "action/+"

    fun createTopicWithAction(actionName : String) = topic.replace("+",actionName)
}
