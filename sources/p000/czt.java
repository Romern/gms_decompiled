package p000;

/* renamed from: czt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum czt implements czv {
    DOMESTICITY_BASED_ON_COUNTRY_CODE(1, 1),
    DCVV_SUPPORTED(1, 7),
    MAGSTRIPE_PREFERRED(1, 8),
    CVN_16_FOR_CRYPTOGRAM(2, 7),
    IDD_IN_IAD(2, 6),
    ENABLE_IDDT(2, 5),
    GET_DATA_AFTER_GPO(2, 2);
    

    /* renamed from: h */
    private final int f12466h;

    private czt(int i, int i2) {
        czl.m8003a(true, "bit number must be between 1 and 8, inclusively");
        czl.m8003a(true, "byte number must be higher than 0");
        this.f12466h = ((i - 1) * 8) + (i2 - 1);
    }

    /* renamed from: a */
    public static czw m8047a(byte[] bArr) {
        return new czw(bArr);
    }

    /* renamed from: a */
    public final int mo8461a() {
        return this.f12466h >>> 3;
    }

    /* renamed from: b */
    public final int mo8462b() {
        return (this.f12466h & 7) + 1;
    }
}
