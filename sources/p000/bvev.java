package p000;

/* renamed from: bvev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvev extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvev f155801c;

    /* renamed from: d */
    private static volatile bxxk f155802d;

    /* renamed from: a */
    public int f155803a;

    /* renamed from: b */
    public int f155804b;

    static {
        bvev bvev = new bvev();
        f155801c = bvev;
        GeneratedMessageLite.m124024a(bvev.class, bvev);
    }

    private bvev() {
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
            return GeneratedMessageLite.m124022a(f155801c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvev();
        } else {
            if (i2 == 4) {
                return new bxvd(f155801c);
            }
            if (i2 == 5) {
                return f155801c;
            }
            bxxk bxxk = f155802d;
            if (bxxk == null) {
                synchronized (bvev.class) {
                    bxxk = f155802d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155801c);
                        f155802d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
