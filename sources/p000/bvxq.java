package p000;

/* renamed from: bvxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvxq f158082d;

    /* renamed from: e */
    private static volatile bxxk f158083e;

    /* renamed from: a */
    public int f158084a;

    /* renamed from: b */
    public int f158085b = -1;

    /* renamed from: c */
    public int f158086c;

    static {
        bvxq bvxq = new bvxq();
        f158082d = bvxq;
        bxvk.m124024a(bvxq.class, bvxq);
    }

    private bvxq() {
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
            return bxvk.m124022a(f158082d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bvxp.f158081a, "c"});
        } else if (i2 == 3) {
            return new bvxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f158082d);
            }
            if (i2 == 5) {
                return f158082d;
            }
            bxxk bxxk = f158083e;
            if (bxxk == null) {
                synchronized (bvxq.class) {
                    bxxk = f158083e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158082d);
                        f158083e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
