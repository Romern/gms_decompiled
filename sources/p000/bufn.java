package p000;

/* renamed from: bufn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bufn f153721b;

    /* renamed from: d */
    private static volatile bxxk f153722d;

    /* renamed from: a */
    public long f153723a;

    /* renamed from: c */
    private int f153724c;

    static {
        bufn bufn = new bufn();
        f153721b = bufn;
        bxvk.m124024a(bufn.class, bufn);
    }

    private bufn() {
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
            return bxvk.m124022a(f153721b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bufn();
        } else {
            if (i2 == 4) {
                return new bxvd(f153721b);
            }
            if (i2 == 5) {
                return f153721b;
            }
            bxxk bxxk = f153722d;
            if (bxxk == null) {
                synchronized (bufn.class) {
                    bxxk = f153722d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153721b);
                        f153722d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
