package p000;

/* renamed from: tnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnr extends bxvk implements bxxd {

    /* renamed from: h */
    public static final tnr f46331h;

    /* renamed from: i */
    private static volatile bxxk f46332i;

    /* renamed from: a */
    public int f46333a;

    /* renamed from: b */
    public int f46334b;

    /* renamed from: c */
    public int f46335c;

    /* renamed from: d */
    public int f46336d;

    /* renamed from: e */
    public int f46337e;

    /* renamed from: f */
    public int f46338f;

    /* renamed from: g */
    public String f46339g = "";

    static {
        tnr tnr = new tnr();
        f46331h = tnr;
        bxvk.m124024a(tnr.class, tnr);
    }

    private tnr() {
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
            return bxvk.m124022a(f46331h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"a", "b", bxco.m122578b(), "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new tnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f46331h);
            }
            if (i2 == 5) {
                return f46331h;
            }
            bxxk bxxk = f46332i;
            if (bxxk == null) {
                synchronized (tnr.class) {
                    bxxk = f46332i;
                    if (bxxk == null) {
                        bxxk = new bxve(f46331h);
                        f46332i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
