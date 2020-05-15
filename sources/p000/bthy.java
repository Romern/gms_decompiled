package p000;

/* renamed from: bthy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bthy extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bthy f148917e;

    /* renamed from: f */
    private static volatile bxxk f148918f;

    /* renamed from: a */
    public bxtx f148919a = bxtx.f164797b;

    /* renamed from: b */
    public bxwc f148920b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f148921c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f148922d = bxxn.f165040b;

    static {
        bthy bthy = new bthy();
        f148917e = bthy;
        bxvk.m124024a(bthy.class, bthy);
    }

    private bthy() {
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
            return bxvk.m124022a(f148917e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\n\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", "b", bthz.class, "c", btiq.class, "d", btil.class});
        } else if (i2 == 3) {
            return new bthy();
        } else {
            if (i2 == 4) {
                return new bthx();
            }
            if (i2 == 5) {
                return f148917e;
            }
            bxxk bxxk = f148918f;
            if (bxxk == null) {
                synchronized (bthy.class) {
                    bxxk = f148918f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148917e);
                        f148918f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
