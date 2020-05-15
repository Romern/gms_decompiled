package p000;

/* renamed from: bzau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzau implements bxvp {
    ENTRY_POINT_UNKNOWN(0),
    BLUETOOTH_SETTINGS(1),
    GMS_SETTINGS(2),
    GOOGLE_APPS(3);
    

    /* renamed from: e */
    public final int f169233e;

    private bzau(int i) {
        this.f169233e = i;
    }

    /* renamed from: a */
    public static bzau m125594a(int i) {
        if (i == 0) {
            return ENTRY_POINT_UNKNOWN;
        }
        if (i == 1) {
            return BLUETOOTH_SETTINGS;
        }
        if (i == 2) {
            return GMS_SETTINGS;
        }
        if (i != 3) {
            return null;
        }
        return GOOGLE_APPS;
    }

    /* renamed from: b */
    public static bxvr m125595b() {
        return bzat.f169227a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169233e;
    }

    public final String toString() {
        return Integer.toString(this.f169233e);
    }
}
