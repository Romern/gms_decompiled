package p000;

/* renamed from: byiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byiu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byiu f166604d;

    /* renamed from: e */
    private static volatile bxxk f166605e;

    /* renamed from: a */
    public int f166606a;

    /* renamed from: b */
    public bygz f166607b;

    /* renamed from: c */
    public int f166608c;

    static {
        byiu byiu = new byiu();
        f166604d = byiu;
        bxvk.m124024a(byiu.class, byiu);
    }

    private byiu() {
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
            return bxvk.m124022a(f166604d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f166604d);
            }
            if (i2 == 5) {
                return f166604d;
            }
            bxxk bxxk = f166605e;
            if (bxxk == null) {
                synchronized (byiu.class) {
                    bxxk = f166605e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166604d);
                        f166605e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
