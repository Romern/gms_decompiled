package p000;

/* renamed from: bvzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvzf implements bxvp {
    LM_UNKNOWN(0),
    LM_LOCATION_MODE_OFF(1),
    LM_LOCATION_MODE_BATTERY_SAVING(2),
    LM_LOCATION_MODE_SENSORS_ONLY(3),
    LM_LOCATION_MODE_HIGH_ACCURACY(4);
    

    /* renamed from: f */
    public final int f158289f;

    private bvzf(int i) {
        this.f158289f = i;
    }

    /* renamed from: a */
    public static bvzf m121618a(int i) {
        if (i == 0) {
            return LM_UNKNOWN;
        }
        if (i == 1) {
            return LM_LOCATION_MODE_OFF;
        }
        if (i == 2) {
            return LM_LOCATION_MODE_BATTERY_SAVING;
        }
        if (i == 3) {
            return LM_LOCATION_MODE_SENSORS_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return LM_LOCATION_MODE_HIGH_ACCURACY;
    }

    /* renamed from: b */
    public static bxvr m121619b() {
        return bvze.f158282a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f158289f;
    }

    public final String toString() {
        return Integer.toString(this.f158289f);
    }
}
