package p000;

/* renamed from: blxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blxz f128176e;

    /* renamed from: h */
    private static volatile bxxk f128177h;

    /* renamed from: a */
    public int f128178a;

    /* renamed from: b */
    public bmaq f128179b;

    /* renamed from: c */
    public bmar f128180c;

    /* renamed from: d */
    public bxwc f128181d = bxxn.f165040b;

    /* renamed from: f */
    private bmav f128182f;

    /* renamed from: g */
    private byte f128183g = 2;

    static {
        blxz blxz = new blxz();
        f128176e = blxz;
        bxvk.m124024a(blxz.class, blxz);
    }

    private blxz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128183g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128183g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128176e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003Л\u0004ဉ\u0002", new Object[]{"a", "f", "b", "d", blxs.class, "c"});
        } else if (i2 == 3) {
            return new blxz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null);
            }
            if (i2 == 5) {
                return f128176e;
            }
            bxxk bxxk = f128177h;
            if (bxxk == null) {
                synchronized (blxz.class) {
                    bxxk = f128177h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128176e);
                        f128177h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
