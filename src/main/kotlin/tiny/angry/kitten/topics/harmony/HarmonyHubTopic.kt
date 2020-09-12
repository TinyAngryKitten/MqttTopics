package tiny.angry.kitten.topics.harmony

object HarmonyHubTopic {
    val topic = "harmony/+/+"
    fun createTopicWith(hubName : String = "livingroom", device : String = "+") = "harmony/$hubName/$device"

    fun createPayload(action : HarmonyHubActions) = action.toString()
}