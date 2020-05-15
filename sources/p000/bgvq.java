package p000;

/* renamed from: bgvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bgvq implements bxvp {
    WIFI(0),
    CELL(1),
    GPS(2),
    UNKNOWN(3),
    MANUAL(4);
    

    /* renamed from: f */
    public final int f117712f;

    private bgvq(int i) {
        this.f117712f = i;
    }

    /* renamed from: a */
    public static bgvq m100134a(int i) {
        if (i == 0) {
            return WIFI;
        }
        if (i == 1) {
            return CELL;
        }
        if (i == 2) {
            return GPS;
        }
        if (i == 3) {
            return UNKNOWN;
        }
        if (i != 4) {
            return null;
        }
        return MANUAL;
    }

    /* renamed from: b */
    public static bxvr m100135b() {
        return bgvp.f117705a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f117712f;
    }

    public final String toString() {
        return Integer.toString(this.f117712f);
    }
}
