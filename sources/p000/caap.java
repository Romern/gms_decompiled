package p000;

/* renamed from: caap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum caap implements bxvp {
    UNKNOWN(0),
    PHONE(1),
    TABLET(2),
    WATCH(3),
    CHEST_STRAP(4),
    SCALE(5),
    HEAD_MOUNTED(6);
    

    /* renamed from: h */
    public final int f172355h;

    private caap(int i) {
        this.f172355h = i;
    }

    /* renamed from: a */
    public static caap m126421a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PHONE;
            case 2:
                return TABLET;
            case 3:
                return WATCH;
            case 4:
                return CHEST_STRAP;
            case 5:
                return SCALE;
            case 6:
                return HEAD_MOUNTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126422b() {
        return caao.f172346a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172355h;
    }

    public final String toString() {
        return Integer.toString(this.f172355h);
    }
}
