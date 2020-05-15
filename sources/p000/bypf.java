package p000;

/* renamed from: bypf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bypf implements bxvp {
    RECEIVED(40),
    TRIGGER_FAILED(44),
    TRIGGERED(46),
    SEEN(50);
    

    /* renamed from: e */
    public final int f167333e;

    private bypf(int i) {
        this.f167333e = i;
    }

    /* renamed from: a */
    public static bypf m125055a(int i) {
        if (i == 40) {
            return RECEIVED;
        }
        if (i == 44) {
            return TRIGGER_FAILED;
        }
        if (i == 46) {
            return TRIGGERED;
        }
        if (i != 50) {
            return null;
        }
        return SEEN;
    }

    /* renamed from: b */
    public static bxvr m125056b() {
        return bype.f167327a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f167333e;
    }

    public final String toString() {
        return Integer.toString(this.f167333e);
    }
}
