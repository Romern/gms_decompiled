package p000;

/* renamed from: aqay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqay implements bxvp {
    UNDEFINED(0),
    NEW_ACTIVITY_AFTER_SCREEN_OFF(1);
    

    /* renamed from: c */
    public final int f85514c;

    private aqay(int i) {
        this.f85514c = i;
    }

    /* renamed from: a */
    public static aqay m71273a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i != 1) {
            return null;
        }
        return NEW_ACTIVITY_AFTER_SCREEN_OFF;
    }

    /* renamed from: b */
    public static bxvr m71274b() {
        return aqax.f85510a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f85514c;
    }

    public final String toString() {
        return Integer.toString(this.f85514c);
    }
}
