package p000;

/* renamed from: oer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum oer implements bxvp {
    UNKNOWN(0),
    CONTROL(1),
    VIDEO_SINK(2),
    AUDIO_SINK_GUIDANCE(3),
    AUDIO_SINK_SYSTEM(4),
    AUDIO_SINK_MEDIA(5),
    AUDIO_SOURCE(6),
    SENSOR_SOURCE(7),
    INPUT_SOURCE(8),
    BLUETOOTH(9),
    NAVIGATION_STATUS(10),
    MEDIA_PLAYBACK_STATUS(11),
    MEDIA_BROWSER(12),
    PHONE_STATUS(13),
    NOTIFICATION(14),
    RADIO(15),
    VENDOR_EXTENSION(16),
    WIFI_PROJECTION(17),
    WIFI_DISCOVERY(18),
    UNRECOGNIZED(-1);
    

    /* renamed from: u */
    private final int f37428u;

    private oer(int i) {
        this.f37428u = i;
    }

    /* renamed from: a */
    public static oer m28607a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONTROL;
            case 2:
                return VIDEO_SINK;
            case 3:
                return AUDIO_SINK_GUIDANCE;
            case 4:
                return AUDIO_SINK_SYSTEM;
            case 5:
                return AUDIO_SINK_MEDIA;
            case 6:
                return AUDIO_SOURCE;
            case 7:
                return SENSOR_SOURCE;
            case 8:
                return INPUT_SOURCE;
            case 9:
                return BLUETOOTH;
            case 10:
                return NAVIGATION_STATUS;
            case 11:
                return MEDIA_PLAYBACK_STATUS;
            case 12:
                return MEDIA_BROWSER;
            case 13:
                return PHONE_STATUS;
            case 14:
                return NOTIFICATION;
            case 15:
                return RADIO;
            case 16:
                return VENDOR_EXTENSION;
            case 17:
                return WIFI_PROJECTION;
            case 18:
                return WIFI_DISCOVERY;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f37428u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
