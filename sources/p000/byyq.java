package p000;

/* renamed from: byyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyq extends bxvg implements bxvh {

    /* renamed from: c */
    public static final byyq f168991c;

    /* renamed from: e */
    private static volatile bxxk f168992e;

    /* renamed from: a */
    public int f168993a;

    /* renamed from: b */
    public int f168994b;

    /* renamed from: d */
    private byte f168995d = 2;

    static {
        byyq byyq = new byyq();
        f168991c = byyq;
        bxvk.m124024a(byyq.class, byyq);
    }

    private byyq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168995d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168995d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzac.f169213a});
        } else if (i2 == 3) {
            return new byyq();
        } else {
            if (i2 == 4) {
                return new bxvf(f168991c);
            }
            if (i2 == 5) {
                return f168991c;
            }
            bxxk bxxk = f168992e;
            if (bxxk == null) {
                synchronized (byyq.class) {
                    bxxk = f168992e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168991c);
                        f168992e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
