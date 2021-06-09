package tiny.angry.kitten.topics.harmony

enum class HarmonyHubActions {
    VolumeDown,
    VolumeUp,

    ChannelUp,
    ChannelDown,

    Netflix,

    InputHdmi4,
    InputHdmi3,
    InputHdmi2,
    InputHdmi1,

    //Home Appliance functions
    Oscillation,
    Speed,
    Mode,
    Timer,

    PowerOff,
    PowerOn,
    PowerToggle,//use toggle for home appliances

    Mute,

    DirectionDown,
    DirectionUp,
    DirectionLeft,
    DirectionRight,
    OK,

    //Woods Venezia AC
    TempCooler,
    TempHotter,
    NightMode,
    ToggleSpeed,

    SELECT {
        override fun toString() = "OK"
    },

    Zero {
        override fun toString(): String {
            return "0"
        }
    },
    One {
        override fun toString(): String {
            return "1"
        }
    },
    Two {
        override fun toString(): String {
            return "2"
        }
    },
    Three {
        override fun toString(): String {
            return "3"
        }
    },
    Four {
        override fun toString(): String {
            return "4"
        }
    },
    Five {
        override fun toString(): String {
            return "5"
        }
    },
    Six {
        override fun toString(): String {
            return "6"
        }
    },
    Seven {
        override fun toString(): String {
            return "7"
        }
    },
    Eight {
        override fun toString(): String {
            return "8"
        }
    },
    Nine {
        override fun toString(): String {
            return "9"
        }
    }
}