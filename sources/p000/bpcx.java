package p000;

/* renamed from: bpcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpcx f135883d;

    /* renamed from: e */
    private static volatile bxxk f135884e;

    /* renamed from: a */
    public int f135885a;

    /* renamed from: b */
    public int f135886b;

    /* renamed from: c */
    public bpds f135887c;

    static {
        bpcx bpcx = new bpcx();
        f135883d = bpcx;
        bxvk.m124024a(bpcx.class, bpcx);
    }

    private bpcx() {
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
            return bxvk.m124022a(f135883d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f135883d);
            }
            if (i2 == 5) {
                return f135883d;
            }
            bxxk bxxk = f135884e;
            if (bxxk == null) {
                synchronized (bpcx.class) {
                    bxxk = f135884e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135883d);
                        f135884e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
