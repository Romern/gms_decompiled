package p000;

/* renamed from: biou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biou implements bxvp {
    AUDIO_FOCUS_STATE_INVALID(0),
    AUDIO_FOCUS_STATE_GAIN(1),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT(2),
    AUDIO_FOCUS_STATE_LOSS(3),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK(4),
    AUDIO_FOCUS_STATE_LOSS_TRANSIENT(5),
    AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY(6),
    AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY(7);
    

    /* renamed from: i */
    public final int f121111i;

    private biou(int i) {
        this.f121111i = i;
    }

    /* renamed from: a */
    public static biou m102677a(int i) {
        switch (i) {
            case 0:
                return AUDIO_FOCUS_STATE_INVALID;
            case 1:
                return AUDIO_FOCUS_STATE_GAIN;
            case 2:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT;
            case 3:
                return AUDIO_FOCUS_STATE_LOSS;
            case 4:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK;
            case 5:
                return AUDIO_FOCUS_STATE_LOSS_TRANSIENT;
            case 6:
                return AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY;
            case 7:
                return AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102678b() {
        return biot.f121101a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121111i;
    }

    public final String toString() {
        return Integer.toString(this.f121111i);
    }
}
