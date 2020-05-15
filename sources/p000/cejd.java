package p000;

/* renamed from: cejd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cejd f182750c;

    /* renamed from: d */
    private static volatile bxxk f182751d;

    /* renamed from: a */
    public int f182752a;

    /* renamed from: b */
    public String f182753b = "";

    static {
        cejd cejd = new cejd();
        f182750c = cejd;
        bxvk.m124024a(cejd.class, cejd);
    }

    private cejd() {
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
            return bxvk.m124022a(f182750c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cejd();
        } else {
            if (i2 == 4) {
                return new bxvd(f182750c);
            }
            if (i2 == 5) {
                return f182750c;
            }
            bxxk bxxk = f182751d;
            if (bxxk == null) {
                synchronized (cejd.class) {
                    bxxk = f182751d;
                    if (bxxk == null) {
                        bxxk = new bxve(f182750c);
                        f182751d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
