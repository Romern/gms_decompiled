package p000;

/* renamed from: bfyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bfyc f115652d;

    /* renamed from: e */
    private static volatile bxxk f115653e;

    /* renamed from: a */
    public int f115654a;

    /* renamed from: b */
    public long f115655b;

    /* renamed from: c */
    public long f115656c;

    static {
        bfyc bfyc = new bfyc();
        f115652d = bfyc;
        bxvk.m124024a(bfyc.class, bfyc);
    }

    private bfyc() {
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
            return bxvk.m124022a(f115652d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bfyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f115652d);
            }
            if (i2 == 5) {
                return f115652d;
            }
            bxxk bxxk = f115653e;
            if (bxxk == null) {
                synchronized (bfyc.class) {
                    bxxk = f115653e;
                    if (bxxk == null) {
                        bxxk = new bxve(f115652d);
                        f115653e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
