package p000;

/* renamed from: czz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum czz implements czv {
    SIGNATURE_SUPPORTED(1, 2),
    ONLINE_PIN_SUPPORTED(1, 3),
    OFFLINE_ONLY(1, 4),
    CONTACT_CHIP_INTERFACE_SUPPORTED(1, 5),
    EMV_SUPPORTED(1, 6),
    MAGSTRIPE_SUPPORTED(1, 8),
    CVM_REQUIRED(2, 7),
    ONLINE_CRYPTOGRAM_REQUIRED(2, 8),
    CONSUMER_DEVICE_CVM_REQUIRED(3, 4),
    TERMINAL_SUPPORTS_CONSUMER_DEVICE_CVM(3, 7),
    READER_SUPPORTING_ISSUER_UPDATE_PROCESSING(3, 8);
    

    /* renamed from: l */
    private final int f12486l;

    private czz(int i, int i2) {
        czl.m8003a(true, "bit number outside scope");
        czl.m8003a(true, "byte number outside scope");
        this.f12486l = ((i - 1) * 8) + (i2 - 1);
    }

    /* renamed from: a */
    public static czw m8064a(byte[] bArr) {
        return new czw(bArr);
    }

    /* renamed from: a */
    public final int mo8461a() {
        return this.f12486l >>> 3;
    }

    /* renamed from: b */
    public final int mo8462b() {
        return (this.f12486l & 7) + 1;
    }
}
