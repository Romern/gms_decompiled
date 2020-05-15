package p000;

/* renamed from: kce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kce extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kce f23741c;

    /* renamed from: d */
    private static volatile bxxk f23742d;

    /* renamed from: a */
    public String f23743a = "";

    /* renamed from: b */
    public String f23744b = "";

    static {
        kce kce = new kce();
        f23741c = kce;
        bxvk.m124024a(kce.class, kce);
    }

    private kce() {
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
            return bxvk.m124022a(f23741c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kce();
        } else {
            if (i2 == 4) {
                return new bxvd(f23741c);
            }
            if (i2 == 5) {
                return f23741c;
            }
            bxxk bxxk = f23742d;
            if (bxxk == null) {
                synchronized (kce.class) {
                    bxxk = f23742d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23741c);
                        f23742d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
