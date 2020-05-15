package p000;

/* renamed from: bubx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bubx implements bxvp {
    UNKNOWN(0),
    SAMPLE_TIMEOUT(1),
    TRANSITION_TIMEOUT(2),
    FLUSH(3),
    BUFFER_FULL(4),
    AUDIO_FUSION_TRANSITION(5);
    

    /* renamed from: g */
    private final int f153298g;

    private bubx(int i) {
        this.f153298g = i;
    }

    /* renamed from: a */
    public static bubx m119309a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SAMPLE_TIMEOUT;
        }
        if (i == 2) {
            return TRANSITION_TIMEOUT;
        }
        if (i == 3) {
            return FLUSH;
        }
        if (i == 4) {
            return BUFFER_FULL;
        }
        if (i != 5) {
            return null;
        }
        return AUDIO_FUSION_TRANSITION;
    }

    /* renamed from: b */
    public static bxvr m119310b() {
        return bubw.f153290a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153298g;
    }

    public final String toString() {
        return Integer.toString(this.f153298g);
    }
}
