package p000;

/* renamed from: kzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kzz f25505d;

    /* renamed from: e */
    private static volatile bxxk f25506e;

    /* renamed from: a */
    public int f25507a;

    /* renamed from: b */
    public kzx f25508b;

    /* renamed from: c */
    public lbh f25509c;

    static {
        kzz kzz = new kzz();
        f25505d = kzz;
        bxvk.m124024a(kzz.class, kzz);
    }

    private kzz() {
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
            return bxvk.m124022a(f25505d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f25505d);
            }
            if (i2 == 5) {
                return f25505d;
            }
            bxxk bxxk = f25506e;
            if (bxxk == null) {
                synchronized (kzz.class) {
                    bxxk = f25506e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25505d);
                        f25506e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
