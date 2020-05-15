package p000;

/* renamed from: bmqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmqt f130424e;

    /* renamed from: f */
    private static volatile bxxk f130425f;

    /* renamed from: a */
    public int f130426a;

    /* renamed from: b */
    public int f130427b = 0;

    /* renamed from: c */
    public Object f130428c;

    /* renamed from: d */
    public bmqs f130429d;

    static {
        bmqt bmqt = new bmqt();
        f130424e = bmqt;
        GeneratedMessageLite.m124024a(bmqt.class, bmqt);
    }

    private bmqt() {
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
            return GeneratedMessageLite.m124022a(f130424e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000", new Object[]{"c", "b", "a", "d", bmqr.class});
        } else if (i2 == 3) {
            return new bmqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f130424e);
            }
            if (i2 == 5) {
                return f130424e;
            }
            bxxk bxxk = f130425f;
            if (bxxk == null) {
                synchronized (bmqt.class) {
                    bxxk = f130425f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130424e);
                        f130425f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
