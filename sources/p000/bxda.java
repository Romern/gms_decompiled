package p000;

/* renamed from: bxda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxda extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxda f163011d;

    /* renamed from: e */
    private static volatile bxxk f163012e;

    /* renamed from: a */
    public int f163013a;

    /* renamed from: b */
    public int f163014b;

    /* renamed from: c */
    public long f163015c;

    static {
        bxda bxda = new bxda();
        f163011d = bxda;
        bxvk.m124024a(bxda.class, bxda);
    }

    private bxda() {
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
            return bxvk.m124022a(f163011d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bxcy.f163010a, "c"});
        } else if (i2 == 3) {
            return new bxda();
        } else {
            if (i2 == 4) {
                return new bxvd(f163011d);
            }
            if (i2 == 5) {
                return f163011d;
            }
            bxxk bxxk = f163012e;
            if (bxxk == null) {
                synchronized (bxda.class) {
                    bxxk = f163012e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163011d);
                        f163012e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
