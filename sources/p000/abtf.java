package p000;

/* renamed from: abtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abtf implements bxvp {
    UNSET(0),
    DISABLED(1),
    ENABLED(2);
    

    /* renamed from: d */
    public final int f58217d;

    private abtf(int i) {
        this.f58217d = i;
    }

    /* renamed from: a */
    public static abtf m48246a(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return ENABLED;
    }

    /* renamed from: b */
    public static bxvr m48247b() {
        return abte.f58212a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f58217d;
    }

    public final String toString() {
        return Integer.toString(this.f58217d);
    }
}
