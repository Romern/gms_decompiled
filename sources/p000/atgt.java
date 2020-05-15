package p000;

/* renamed from: atgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atgt {
    ID("felica_id_bundle", 2, 7, atgs.ID),
    QUICPAY("felica_quicpay_bundle", 1, 8, atgs.QUICPAY),
    APTEST_QUICPAY("felica_quicpay_aptest_bundle", 1, 8, atgs.QUICPAY),
    APTEST_ID("felica_id_aptest_bundle", 2, 7, atgs.ID);
    

    /* renamed from: e */
    public final int f90320e;

    /* renamed from: f */
    public final atgs f90321f;

    /* renamed from: g */
    public final int f90322g;

    /* renamed from: h */
    private final String f90323h;

    private atgt(String str, int i, int i2, atgs atgs) {
        this.f90323h = str;
        this.f90320e = i;
        this.f90322g = i2;
        this.f90321f = atgs;
    }

    /* renamed from: a */
    public static atgt m75867a(int i) {
        if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
            if (i == 9) {
                return APTEST_ID;
            }
            if (i == 10) {
                return APTEST_QUICPAY;
            }
        }
        if (i == 9) {
            return ID;
        }
        if (i == 10) {
            return QUICPAY;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Unknown PostpaidServiceProvider for CardNetwork ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static atgt m75868a(String str) {
        atgt[] values = values();
        for (atgt atgt : values) {
            if (atgt.f90323h.equals(str)) {
                return atgt;
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown PostpaidServiceProvider for ") : "Unknown PostpaidServiceProvider for ".concat(valueOf));
    }
}
