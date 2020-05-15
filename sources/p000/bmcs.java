package p000;

/* renamed from: bmcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmcs f128739e;

    /* renamed from: f */
    private static volatile bxxk f128740f;

    /* renamed from: a */
    public int f128741a;

    /* renamed from: b */
    public ByteString f128742b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f128743c = ByteString.f164797b;

    /* renamed from: d */
    public boolean f128744d;

    static {
        bmcs bmcs = new bmcs();
        f128739e = bmcs;
        GeneratedMessageLite.m124024a(bmcs.class, bmcs);
    }

    private bmcs() {
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
            return GeneratedMessageLite.m124022a(f128739e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f128739e);
            }
            if (i2 == 5) {
                return f128739e;
            }
            bxxk bxxk = f128740f;
            if (bxxk == null) {
                synchronized (bmcs.class) {
                    bxxk = f128740f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128739e);
                        f128740f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
