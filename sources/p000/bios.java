package p000;

/* renamed from: bios */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bios implements bxvp {
    AUDIO_FOCUS_GAIN(1),
    AUDIO_FOCUS_GAIN_TRANSIENT(2),
    AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK(3),
    AUDIO_FOCUS_RELEASE(4);
    

    /* renamed from: e */
    public final int f121100e;

    private bios(int i) {
        this.f121100e = i;
    }

    /* renamed from: a */
    public static bios m102673a(int i) {
        if (i == 1) {
            return AUDIO_FOCUS_GAIN;
        }
        if (i == 2) {
            return AUDIO_FOCUS_GAIN_TRANSIENT;
        }
        if (i == 3) {
            return AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK;
        }
        if (i != 4) {
            return null;
        }
        return AUDIO_FOCUS_RELEASE;
    }

    /* renamed from: b */
    public static bxvr m102674b() {
        return bior.f121094a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121100e;
    }

    public final String toString() {
        return Integer.toString(this.f121100e);
    }
}
