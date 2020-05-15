package p000;

/* renamed from: bkzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkzy f125714a;

    /* renamed from: e */
    private static volatile bxxk f125715e;

    /* renamed from: b */
    private int f125716b;

    /* renamed from: c */
    private int f125717c;

    /* renamed from: d */
    private byte f125718d = 2;

    static {
        bkzy bkzy = new bkzy();
        f125714a = bkzy;
        bxvk.m124024a(bkzy.class, bkzy);
    }

    private bkzy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125718d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125718d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125714a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blft.f126410a});
        } else if (i2 == 3) {
            return new bkzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f125714a);
            }
            if (i2 == 5) {
                return f125714a;
            }
            bxxk bxxk = f125715e;
            if (bxxk == null) {
                synchronized (bkzy.class) {
                    bxxk = f125715e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125714a);
                        f125715e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
