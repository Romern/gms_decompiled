package p000;

/* renamed from: bupy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bupy f154690c;

    /* renamed from: d */
    private static volatile bxxk f154691d;

    /* renamed from: a */
    public bupw f154692a;

    /* renamed from: b */
    public bupv f154693b;

    static {
        bupy bupy = new bupy();
        f154690c = bupy;
        GeneratedMessageLite.m124024a(bupy.class, bupy);
    }

    private bupy() {
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
            return GeneratedMessageLite.m124022a(f154690c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bupy();
        } else {
            if (i2 == 4) {
                return new bxvd(f154690c);
            }
            if (i2 == 5) {
                return f154690c;
            }
            bxxk bxxk = f154691d;
            if (bxxk == null) {
                synchronized (bupy.class) {
                    bxxk = f154691d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154690c);
                        f154691d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
