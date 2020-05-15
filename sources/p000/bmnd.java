package p000;

/* renamed from: bmnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmnd f130085c;

    /* renamed from: d */
    private static volatile bxxk f130086d;

    /* renamed from: a */
    public int f130087a;

    /* renamed from: b */
    public bmmw f130088b;

    static {
        bmnd bmnd = new bmnd();
        f130085c = bmnd;
        GeneratedMessageLite.m124024a(bmnd.class, bmnd);
    }

    private bmnd() {
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
            return GeneratedMessageLite.m124022a(f130085c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f130085c);
            }
            if (i2 == 5) {
                return f130085c;
            }
            bxxk bxxk = f130086d;
            if (bxxk == null) {
                synchronized (bmnd.class) {
                    bxxk = f130086d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130085c);
                        f130086d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
