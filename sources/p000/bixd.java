package p000;

/* renamed from: bixd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bixd implements bxvp {
    UNKNOWN_SECURITY_MODE(0),
    OPEN(1),
    WEP_64(2),
    WEP_128(3),
    WPA_PERSONAL(4),
    WPA2_PERSONAL(8),
    WPA_WPA2_PERSONAL(12),
    WPA_ENTERPRISE(20),
    WPA2_ENTERPRISE(24),
    WPA_WPA2_ENTERPRISE(28);
    

    /* renamed from: k */
    public final int f122173k;

    private bixd(int i) {
        this.f122173k = i;
    }

    /* renamed from: a */
    public static bixd m102925a(int i) {
        if (i == 0) {
            return UNKNOWN_SECURITY_MODE;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return WEP_64;
        }
        if (i == 3) {
            return WEP_128;
        }
        if (i == 4) {
            return WPA_PERSONAL;
        }
        if (i == 8) {
            return WPA2_PERSONAL;
        }
        if (i == 12) {
            return WPA_WPA2_PERSONAL;
        }
        if (i == 20) {
            return WPA_ENTERPRISE;
        }
        if (i == 24) {
            return WPA2_ENTERPRISE;
        }
        if (i != 28) {
            return null;
        }
        return WPA_WPA2_ENTERPRISE;
    }

    /* renamed from: b */
    public static bxvr m102926b() {
        return bixc.f122161a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f122173k;
    }

    public final String toString() {
        return Integer.toString(this.f122173k);
    }
}
