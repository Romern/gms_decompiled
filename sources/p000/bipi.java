package p000;

/* renamed from: bipi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bipi implements bxvp {
    USER_SELECTION(1),
    DEVICE_SWITCH(2),
    NOT_SUPPORTED(3),
    NOT_CURRENTLY_SUPPORTED(4),
    PROBE_SUPPORTED(5);
    

    /* renamed from: f */
    public final int f121169f;

    private bipi(int i) {
        this.f121169f = i;
    }

    /* renamed from: a */
    public static bipi m102695a(int i) {
        if (i == 1) {
            return USER_SELECTION;
        }
        if (i == 2) {
            return DEVICE_SWITCH;
        }
        if (i == 3) {
            return NOT_SUPPORTED;
        }
        if (i == 4) {
            return NOT_CURRENTLY_SUPPORTED;
        }
        if (i != 5) {
            return null;
        }
        return PROBE_SUPPORTED;
    }

    /* renamed from: b */
    public static bxvr m102696b() {
        return biph.f121162a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121169f;
    }

    public final String toString() {
        return Integer.toString(this.f121169f);
    }
}
