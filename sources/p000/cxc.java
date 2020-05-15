package p000;

/* renamed from: cxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cxc {
    UNKNOWN(0, 1),
    SUCCESS(1, 4),
    NOT_STARTED(3, 0),
    CARD_NOT_SUPPORTED(4, 3),
    UNLOCK_REQUIRED(5, 3),
    TEAR(6, 2),
    PROTOCOL_FAILURE(7, 3);
    

    /* renamed from: h */
    public final int f12348h;

    /* renamed from: i */
    private final int f12349i;

    private cxc(int i, int i2) {
        this.f12348h = i;
        this.f12349i = i2;
    }

    /* renamed from: a */
    public final cxc mo8382a(cxc cxc) {
        return this.f12349i < cxc.f12349i ? cxc : this;
    }
}
