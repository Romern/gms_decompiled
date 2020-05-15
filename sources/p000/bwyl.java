package p000;

/* renamed from: bwyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwyl implements bxvp {
    MATERIAL_ELEVATION_UNKNOWN(0),
    MATERIAL_ELEVATION_1(1),
    MATERIAL_ELEVATION_2(2),
    MATERIAL_ELEVATION_3(3),
    MATERIAL_ELEVATION_4(4),
    MATERIAL_ELEVATION_5(5);
    

    /* renamed from: g */
    private final int f161483g;

    private bwyl(int i) {
        this.f161483g = i;
    }

    /* renamed from: a */
    public static bwyl m122440a(int i) {
        if (i == 0) {
            return MATERIAL_ELEVATION_UNKNOWN;
        }
        if (i == 1) {
            return MATERIAL_ELEVATION_1;
        }
        if (i == 2) {
            return MATERIAL_ELEVATION_2;
        }
        if (i == 3) {
            return MATERIAL_ELEVATION_3;
        }
        if (i == 4) {
            return MATERIAL_ELEVATION_4;
        }
        if (i != 5) {
            return null;
        }
        return MATERIAL_ELEVATION_5;
    }

    /* renamed from: b */
    public static bxvr m122441b() {
        return bwyk.f161475a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161483g;
    }

    public final String toString() {
        return Integer.toString(this.f161483g);
    }
}
