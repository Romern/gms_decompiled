package p000;

/* renamed from: alkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final alkr f73594c;

    /* renamed from: d */
    private static volatile bxxk f73595d;

    /* renamed from: a */
    public int f73596a;

    /* renamed from: b */
    public int f73597b;

    static {
        alkr alkr = new alkr();
        f73594c = alkr;
        GeneratedMessageLite.m124024a(alkr.class, alkr);
    }

    private alkr() {
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
            return GeneratedMessageLite.m124022a(f73594c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new alkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f73594c);
            }
            if (i2 == 5) {
                return f73594c;
            }
            bxxk bxxk = f73595d;
            if (bxxk == null) {
                synchronized (alkr.class) {
                    bxxk = f73595d;
                    if (bxxk == null) {
                        bxxk = new bxve(f73594c);
                        f73595d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
