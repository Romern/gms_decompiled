package p000;

/* renamed from: buzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buzu f155430c;

    /* renamed from: d */
    private static volatile bxxk f155431d;

    /* renamed from: a */
    public int f155432a;

    /* renamed from: b */
    public bxtx f155433b = bxtx.f164797b;

    static {
        buzu buzu = new buzu();
        f155430c = buzu;
        bxvk.m124024a(buzu.class, buzu);
    }

    private buzu() {
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
            return bxvk.m124022a(f155430c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f155430c);
            }
            if (i2 == 5) {
                return f155430c;
            }
            bxxk bxxk = f155431d;
            if (bxxk == null) {
                synchronized (buzu.class) {
                    bxxk = f155431d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155430c);
                        f155431d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
