package p000;

/* renamed from: bomw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bomw f133727d;

    /* renamed from: e */
    private static volatile bxxk f133728e;

    /* renamed from: a */
    public int f133729a;

    /* renamed from: b */
    public int f133730b;

    /* renamed from: c */
    public boolean f133731c;

    static {
        bomw bomw = new bomw();
        f133727d = bomw;
        bxvk.m124024a(bomw.class, bomw);
    }

    private bomw() {
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
            return bxvk.m124022a(f133727d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", adbh.f61240a, "c"});
        } else if (i2 == 3) {
            return new bomw();
        } else {
            if (i2 == 4) {
                return new bxvd(f133727d);
            }
            if (i2 == 5) {
                return f133727d;
            }
            bxxk bxxk = f133728e;
            if (bxxk == null) {
                synchronized (bomw.class) {
                    bxxk = f133728e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133727d);
                        f133728e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
