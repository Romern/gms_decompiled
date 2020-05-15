package p000;

/* renamed from: biww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biww implements bxvp {
    UNKNOWN_SECURITY_MODE(0),
    OPEN(1),
    WEP_64(2),
    WEP_128(3),
    WPA_PERSONAL(4),
    WPA2_PERSONAL(5),
    WPA_WPA2_PERSONAL(6),
    WPA_ENTERPRISE(7),
    WPA2_ENTERPRISE(8),
    WPA_WPA2_ENTERPRISE(9);
    

    /* renamed from: k */
    public final int f122145k;

    private biww(int i) {
        this.f122145k = i;
    }

    /* renamed from: a */
    public static biww m102916a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SECURITY_MODE;
            case 1:
                return OPEN;
            case 2:
                return WEP_64;
            case 3:
                return WEP_128;
            case 4:
                return WPA_PERSONAL;
            case 5:
                return WPA2_PERSONAL;
            case 6:
                return WPA_WPA2_PERSONAL;
            case 7:
                return WPA_ENTERPRISE;
            case 8:
                return WPA2_ENTERPRISE;
            case 9:
                return WPA_WPA2_ENTERPRISE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102917b() {
        return biwv.f122133a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f122145k;
    }

    public final String toString() {
        return Integer.toString(this.f122145k);
    }
}
