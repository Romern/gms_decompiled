package p000;

/* renamed from: cbpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbpe f177905d;

    /* renamed from: e */
    private static volatile bxxk f177906e;

    /* renamed from: a */
    public cbpq f177907a;

    /* renamed from: b */
    public ByteString f177908b = ByteString.f164797b;

    /* renamed from: c */
    public bxyk f177909c;

    static {
        cbpe cbpe = new cbpe();
        f177905d = cbpe;
        GeneratedMessageLite.m124024a(cbpe.class, cbpe);
    }

    private cbpe() {
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
            return GeneratedMessageLite.m124022a(f177905d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\n\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f177905d);
            }
            if (i2 == 5) {
                return f177905d;
            }
            bxxk bxxk = f177906e;
            if (bxxk == null) {
                synchronized (cbpe.class) {
                    bxxk = f177906e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177905d);
                        f177906e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
