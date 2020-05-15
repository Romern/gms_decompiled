package p000;

/* renamed from: bius */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bius implements bxvp {
    SENSOR_OK(1),
    SENSOR_ERROR_TRANSIENT(2),
    SENSOR_ERROR_PERMANENT(3);
    

    /* renamed from: d */
    private final int f121869d;

    private bius(int i) {
        this.f121869d = i;
    }

    /* renamed from: a */
    public static bius m102853a(int i) {
        if (i == 1) {
            return SENSOR_OK;
        }
        if (i == 2) {
            return SENSOR_ERROR_TRANSIENT;
        }
        if (i != 3) {
            return null;
        }
        return SENSOR_ERROR_PERMANENT;
    }

    /* renamed from: b */
    public static bxvr m102854b() {
        return biur.f121864a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121869d;
    }

    public final String toString() {
        return Integer.toString(this.f121869d);
    }
}
