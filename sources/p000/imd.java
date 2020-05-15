package p000;

/* renamed from: imd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final imd f21346d;

    /* renamed from: e */
    private static volatile bxxk f21347e;

    /* renamed from: a */
    public int f21348a;

    /* renamed from: b */
    public String f21349b = "";

    /* renamed from: c */
    public String f21350c = "";

    static {
        imd imd = new imd();
        f21346d = imd;
        bxvk.m124024a(imd.class, imd);
    }

    private imd() {
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
            return bxvk.m124022a(f21346d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new imd();
        } else {
            if (i2 == 4) {
                return new bxvd(f21346d);
            }
            if (i2 == 5) {
                return f21346d;
            }
            bxxk bxxk = f21347e;
            if (bxxk == null) {
                synchronized (imd.class) {
                    bxxk = f21347e;
                    if (bxxk == null) {
                        bxxk = new bxve(f21346d);
                        f21347e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
