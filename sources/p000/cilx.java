package p000;

/* renamed from: cilx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cilx f190679c;

    /* renamed from: d */
    private static volatile bxxk f190680d;

    /* renamed from: a */
    public int f190681a;

    /* renamed from: b */
    public long f190682b;

    static {
        cilx cilx = new cilx();
        f190679c = cilx;
        GeneratedMessageLite.m124024a(cilx.class, cilx);
    }

    private cilx() {
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
            return GeneratedMessageLite.m124022a(f190679c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cilx();
        } else {
            if (i2 == 4) {
                return new bxvd(f190679c);
            }
            if (i2 == 5) {
                return f190679c;
            }
            bxxk bxxk = f190680d;
            if (bxxk == null) {
                synchronized (cilx.class) {
                    bxxk = f190680d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190679c);
                        f190680d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
