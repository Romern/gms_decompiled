package p000;

/* renamed from: bmri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmri extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmri f130495g;

    /* renamed from: i */
    private static volatile bxxk f130496i;

    /* renamed from: a */
    public int f130497a;

    /* renamed from: b */
    public bmav f130498b;

    /* renamed from: c */
    public bmaq f130499c;

    /* renamed from: d */
    public int f130500d;

    /* renamed from: e */
    public bmag f130501e;

    /* renamed from: f */
    public bmrf f130502f;

    /* renamed from: h */
    private byte f130503h = 2;

    static {
        bmri bmri = new bmri();
        f130495g = bmri;
        bxvk.m124024a(bmri.class, bmri);
    }

    private bmri() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130503h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130503h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130495g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0005ᐉ\u0004\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", bwgz.m121953b(), "f", "e"});
        } else if (i2 == 3) {
            return new bmri();
        } else {
            if (i2 == 4) {
                return new bxvd(f130495g);
            }
            if (i2 == 5) {
                return f130495g;
            }
            bxxk bxxk = f130496i;
            if (bxxk == null) {
                synchronized (bmri.class) {
                    bxxk = f130496i;
                    if (bxxk == null) {
                        bxxk = new bxve(f130495g);
                        f130496i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
