package p000;

/* renamed from: bmio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmio extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmio f129607e;

    /* renamed from: g */
    private static volatile bxxk f129608g;

    /* renamed from: a */
    public int f129609a = 0;

    /* renamed from: b */
    public Object f129610b;

    /* renamed from: c */
    public bmdn f129611c;

    /* renamed from: d */
    public bxwc f129612d = bxxn.f165040b;

    /* renamed from: f */
    private int f129613f;

    static {
        bmio bmio = new bmio();
        f129607e = bmio;
        GeneratedMessageLite.m124024a(bmio.class, bmio);
    }

    private bmio() {
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
            return GeneratedMessageLite.m124022a(f129607e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", "f", "c", "d", bmjf.class, bmin.class, bmix.class});
        } else if (i2 == 3) {
            return new bmio();
        } else {
            if (i2 == 4) {
                return new bxvd(f129607e);
            }
            if (i2 == 5) {
                return f129607e;
            }
            bxxk bxxk = f129608g;
            if (bxxk == null) {
                synchronized (bmio.class) {
                    bxxk = f129608g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129607e);
                        f129608g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
