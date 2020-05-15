package p000;

/* renamed from: allz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum allz implements bxvp {
    UNKNOWN(0),
    NULL_ACCOUNT(1),
    GOOGLE(2),
    DEVICE(3),
    SIM(4),
    EXCHANGE(5),
    THIRD_PARTY_EDITABLE(6),
    THIRD_PARTY_READONLY(7),
    SIM_SDN(8);
    

    /* renamed from: j */
    public final int f73664j;

    private allz(int i) {
        this.f73664j = i;
    }

    /* renamed from: a */
    public static allz m61245a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NULL_ACCOUNT;
            case 2:
                return GOOGLE;
            case 3:
                return DEVICE;
            case 4:
                return SIM;
            case 5:
                return EXCHANGE;
            case 6:
                return THIRD_PARTY_EDITABLE;
            case 7:
                return THIRD_PARTY_READONLY;
            case 8:
                return SIM_SDN;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m61246b() {
        return ally.f73653a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f73664j;
    }

    public final String toString() {
        return Integer.toString(this.f73664j);
    }
}
