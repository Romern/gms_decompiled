package p000;

/* renamed from: kdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kdk f23890c;

    /* renamed from: d */
    private static volatile bxxk f23891d;

    /* renamed from: a */
    public int f23892a;

    /* renamed from: b */
    public String f23893b = "";

    static {
        kdk kdk = new kdk();
        f23890c = kdk;
        bxvk.m124024a(kdk.class, kdk);
    }

    private kdk() {
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
            return bxvk.m124022a(f23890c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kdk();
        } else {
            if (i2 == 4) {
                return new bxvd(f23890c);
            }
            if (i2 == 5) {
                return f23890c;
            }
            bxxk bxxk = f23891d;
            if (bxxk == null) {
                synchronized (kdk.class) {
                    bxxk = f23891d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23890c);
                        f23891d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
