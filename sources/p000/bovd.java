package p000;

/* renamed from: bovd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bovd f134997d;

    /* renamed from: e */
    private static volatile bxxk f134998e;

    /* renamed from: a */
    public int f134999a;

    /* renamed from: b */
    public int f135000b;

    /* renamed from: c */
    public int f135001c;

    static {
        bovd bovd = new bovd();
        f134997d = bovd;
        bxvk.m124024a(bovd.class, bovd);
    }

    private bovd() {
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
            return bxvk.m124022a(f134997d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bovd();
        } else {
            if (i2 == 4) {
                return new bxvd(f134997d);
            }
            if (i2 == 5) {
                return f134997d;
            }
            bxxk bxxk = f134998e;
            if (bxxk == null) {
                synchronized (bovd.class) {
                    bxxk = f134998e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134997d);
                        f134998e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
