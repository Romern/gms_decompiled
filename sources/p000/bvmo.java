package p000;

/* renamed from: bvmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvmo f156764e;

    /* renamed from: f */
    private static volatile bxxk f156765f;

    /* renamed from: a */
    public int f156766a;

    /* renamed from: b */
    public int f156767b;

    /* renamed from: c */
    public int f156768c;

    /* renamed from: d */
    public int f156769d;

    static {
        bvmo bvmo = new bvmo();
        f156764e = bvmo;
        bxvk.m124024a(bvmo.class, bvmo);
    }

    private bvmo() {
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
            return bxvk.m124022a(f156764e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0004င\u0003", new Object[]{"a", "b", "c", bvmn.f156763a, "d"});
        } else if (i2 == 3) {
            return new bvmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f156764e);
            }
            if (i2 == 5) {
                return f156764e;
            }
            bxxk bxxk = f156765f;
            if (bxxk == null) {
                synchronized (bvmo.class) {
                    bxxk = f156765f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156764e);
                        f156765f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
