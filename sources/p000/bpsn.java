package p000;

/* renamed from: bpsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpsn f138986c;

    /* renamed from: d */
    private static volatile bxxk f138987d;

    /* renamed from: a */
    public int f138988a;

    /* renamed from: b */
    public ByteString f138989b = ByteString.f164797b;

    static {
        bpsn bpsn = new bpsn();
        f138986c = bpsn;
        GeneratedMessageLite.m124024a(bpsn.class, bpsn);
    }

    private bpsn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138986c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsn();
        } else {
            if (i2 == 4) {
                return new bxvd(f138986c);
            }
            if (i2 == 5) {
                return f138986c;
            }
            bxxk bxxk = f138987d;
            if (bxxk == null) {
                synchronized (bpsn.class) {
                    bxxk = f138987d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138986c);
                        f138987d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
