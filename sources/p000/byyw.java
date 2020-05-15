package p000;

/* renamed from: byyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyw extends bxvg implements bxvh {

    /* renamed from: c */
    public static final byyw f169032c;

    /* renamed from: e */
    private static volatile bxxk f169033e;

    /* renamed from: a */
    public int f169034a;

    /* renamed from: b */
    public bzby f169035b;

    /* renamed from: d */
    private byte f169036d = 2;

    static {
        byyw byyw = new byyw();
        f169032c = byyw;
        bxvk.m124024a(byyw.class, byyw);
    }

    private byyw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169036d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169036d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169032c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byyw();
        } else {
            if (i2 == 4) {
                return new bxvf(f169032c);
            }
            if (i2 == 5) {
                return f169032c;
            }
            bxxk bxxk = f169033e;
            if (bxxk == null) {
                synchronized (byyw.class) {
                    bxxk = f169033e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169032c);
                        f169033e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
