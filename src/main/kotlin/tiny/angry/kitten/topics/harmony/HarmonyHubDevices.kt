package tiny.angry.kitten.topics.harmony

enum class HarmonyHubDevices {
    TV { override fun toString() = "LG TV" },
    FANS { override fun toString() = "Sandstrom Taarnvifte" },
    APPLE_TV { override fun toString() = "Apple TV " },
    GAMING_PC { override fun toString() = "Windows Computer" }
}