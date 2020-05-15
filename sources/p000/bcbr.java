package p000;

/* renamed from: bcbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bcbr {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    GROUP(4),
    DEVICE_ID(5);
    

    /* renamed from: g */
    public final int f103945g;

    private bcbr(int i) {
        this.f103945g = i;
    }

    /* renamed from: a */
    public static bcbr m88772a(int i) {
        return (bcbr) bnfi.m109237a(values()).mo67507c(new bcbq(i)).mo66812a(UNKNOWN);
    }
}
