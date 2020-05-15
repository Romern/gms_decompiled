package p000;

/* renamed from: bore */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bore extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bore f134393d;

    /* renamed from: e */
    private static volatile bxxk f134394e;

    /* renamed from: a */
    public int f134395a;

    /* renamed from: b */
    public String f134396b = "";

    /* renamed from: c */
    public int f134397c;

    static {
        bore bore = new bore();
        f134393d = bore;
        bxvk.m124024a(bore.class, bore);
    }

    private bore() {
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
            return bxvk.m124022a(f134393d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bore();
        } else {
            if (i2 == 4) {
                return new bxvd(f134393d);
            }
            if (i2 == 5) {
                return f134393d;
            }
            bxxk bxxk = f134394e;
            if (bxxk == null) {
                synchronized (bore.class) {
                    bxxk = f134394e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134393d);
                        f134394e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
