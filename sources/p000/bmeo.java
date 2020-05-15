package p000;

/* renamed from: bmeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmeo f128974c;

    /* renamed from: d */
    private static volatile bxxk f128975d;

    /* renamed from: a */
    public int f128976a;

    /* renamed from: b */
    public bmqk f128977b;

    static {
        bmeo bmeo = new bmeo();
        f128974c = bmeo;
        GeneratedMessageLite.m124024a(bmeo.class, bmeo);
    }

    private bmeo() {
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
            return GeneratedMessageLite.m124022a(f128974c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f128974c);
            }
            if (i2 == 5) {
                return f128974c;
            }
            bxxk bxxk = f128975d;
            if (bxxk == null) {
                synchronized (bmeo.class) {
                    bxxk = f128975d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128974c);
                        f128975d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
