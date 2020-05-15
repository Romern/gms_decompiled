package p000;

/* renamed from: butw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final butw f154888d;

    /* renamed from: e */
    private static volatile bxxk f154889e;

    /* renamed from: a */
    public int f154890a;

    /* renamed from: b */
    public ByteString f154891b = ByteString.f164797b;

    /* renamed from: c */
    public int f154892c;

    static {
        butw butw = new butw();
        f154888d = butw;
        GeneratedMessageLite.m124024a(butw.class, butw);
    }

    private butw() {
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
            return GeneratedMessageLite.m124022a(f154888d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new butw();
        } else {
            if (i2 == 4) {
                return new bxvd(f154888d);
            }
            if (i2 == 5) {
                return f154888d;
            }
            bxxk bxxk = f154889e;
            if (bxxk == null) {
                synchronized (butw.class) {
                    bxxk = f154889e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154888d);
                        f154889e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
