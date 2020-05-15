package p000;

/* renamed from: bozu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bozu implements bxvp {
    UNKNOWN_TAP_PATH(0),
    VISA_MSD(1),
    VISA_QVSDC(2),
    MC_MSD(3),
    MC_EMV(4),
    AMEX_MSD(5),
    AMEX_EMV(6),
    DISCOVER_ZIP(7),
    DISCOVER_DPAS(8),
    OPEN_APPLET(9);
    

    /* renamed from: k */
    public final int f135420k;

    private bozu(int i) {
        this.f135420k = i;
    }

    /* renamed from: a */
    public static bozu m111702a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TAP_PATH;
            case 1:
                return VISA_MSD;
            case 2:
                return VISA_QVSDC;
            case 3:
                return MC_MSD;
            case 4:
                return MC_EMV;
            case 5:
                return AMEX_MSD;
            case 6:
                return AMEX_EMV;
            case 7:
                return DISCOVER_ZIP;
            case 8:
                return DISCOVER_DPAS;
            case 9:
                return OPEN_APPLET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111703b() {
        return bozt.f135408a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135420k;
    }

    public final String toString() {
        return Integer.toString(this.f135420k);
    }
}
