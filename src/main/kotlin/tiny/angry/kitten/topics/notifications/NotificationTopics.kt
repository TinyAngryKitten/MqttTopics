package tiny.angry.kitten.topics.notifications

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

object NotificationTopics {
    val mapper = ObjectMapper().registerModule(KotlinModule())
    val topic = "notify"

    fun createPayload(notification : Notification) = mapper.writeValueAsString(notification)
}