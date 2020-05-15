package p000;

/* renamed from: cwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cwj implements cwl {
    DOMESTICITY_BASED_ON_COUNTRY_CODE(1, 1),
    DCVV_SUPPORTED(1, 7),
    MAGSTRIPE_PREFERRED(1, 8),
    CVN_16_FOR_CRYPTOGRAM(2, 7),
    AFL_IN_ONLINE_TXNS(2, 8),
    IDD_IN_IAD(2, 6),
    ENABLE_IDDT(2, 5),
    PDOL_CHECKS_ENABLED(2, 4),
    GET_DATA_AFTER_GPO(2, 2);
    

    /* renamed from: j */
    private final int f12250j;

    private cwj(int i, int i2) {
        cvx.m7697a(true, "bit number must be between 1 and 8, inclusively");
        cvx.m7697a(true, "byte number must be higher than 0");
        this.f12250j = ((i - 1) * 8) + (i2 - 1);
    }

    /* renamed from: a */
    public static cwm m7764a(byte[] bArr) {
        return new cwm(bArr);
    }

    /* renamed from: a */
    public final int mo8359a() {
        return this.f12250j >>> 3;
    }

    /* renamed from: b */
    public final int mo8360b() {
        return (this.f12250j & 7) + 1;
    }
}
