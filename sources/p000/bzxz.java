package p000;

/* renamed from: bzxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzxz f171827b;

    /* renamed from: c */
    private static volatile bxxk f171828c;

    /* renamed from: a */
    public long f171829a;

    static {
        bzxz bzxz = new bzxz();
        f171827b = bzxz;
        bxvk.m124024a(bzxz.class, bzxz);
    }

    private bzxz() {
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
            return bxvk.m124022a(f171827b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171827b);
            }
            if (i2 == 5) {
                return f171827b;
            }
            bxxk bxxk = f171828c;
            if (bxxk == null) {
                synchronized (bzxz.class) {
                    bxxk = f171828c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171827b);
                        f171828c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
