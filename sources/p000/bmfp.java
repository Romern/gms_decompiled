package p000;

/* renamed from: bmfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmfp f129133e;

    /* renamed from: h */
    private static volatile bxxk f129134h;

    /* renamed from: a */
    public int f129135a = 0;

    /* renamed from: b */
    public Object f129136b;

    /* renamed from: c */
    public bxwc f129137c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f129138d;

    /* renamed from: f */
    private int f129139f;

    /* renamed from: g */
    private byte f129140g = 2;

    static {
        bmfp bmfp = new bmfp();
        f129133e = bmfp;
        GeneratedMessageLite.m124024a(bmfp.class, bmfp);
    }

    private bmfp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129140g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129140g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129133e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002့\u0000\u0003ြ\u0000\u0004ဇ\u0000", new Object[]{"b", "a", "f", "c", bmfl.class, bmnr.class, "d"});
        } else if (i2 == 3) {
            return new bmfp();
        } else {
            if (i2 == 4) {
                return new bxvd(f129133e);
            }
            if (i2 == 5) {
                return f129133e;
            }
            bxxk bxxk = f129134h;
            if (bxxk == null) {
                synchronized (bmfp.class) {
                    bxxk = f129134h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129133e);
                        f129134h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
