package p000;

/* renamed from: kzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kzu f25475c;

    /* renamed from: d */
    private static volatile bxxk f25476d;

    /* renamed from: a */
    public int f25477a;

    /* renamed from: b */
    public int f25478b;

    static {
        kzu kzu = new kzu();
        f25475c = kzu;
        bxvk.m124024a(kzu.class, kzu);
    }

    private kzu() {
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
            return bxvk.m124022a(f25475c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဆ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f25475c);
            }
            if (i2 == 5) {
                return f25475c;
            }
            bxxk bxxk = f25476d;
            if (bxxk == null) {
                synchronized (kzu.class) {
                    bxxk = f25476d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25475c);
                        f25476d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
