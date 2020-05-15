package p000;

/* renamed from: bvpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpq f157337a;

    /* renamed from: b */
    private static volatile bxxk f157338b;

    static {
        bvpq bvpq = new bvpq();
        f157337a = bvpq;
        bxvk.m124024a(bvpq.class, bvpq);
    }

    private bvpq() {
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
            return bxvk.m124022a(f157337a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpq();
        }
        if (i2 == 4) {
            return new bxvd(f157337a);
        }
        if (i2 == 5) {
            return f157337a;
        }
        bxxk bxxk = f157338b;
        if (bxxk == null) {
            synchronized (bvpq.class) {
                bxxk = f157338b;
                if (bxxk == null) {
                    bxxk = new bxve(f157337a);
                    f157338b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
