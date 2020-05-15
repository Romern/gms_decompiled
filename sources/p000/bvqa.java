package p000;

/* renamed from: bvqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqa f157357a;

    /* renamed from: b */
    private static volatile bxxk f157358b;

    static {
        bvqa bvqa = new bvqa();
        f157357a = bvqa;
        bxvk.m124024a(bvqa.class, bvqa);
    }

    private bvqa() {
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
            return bxvk.m124022a(f157357a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqa();
        }
        if (i2 == 4) {
            return new bxvd(f157357a);
        }
        if (i2 == 5) {
            return f157357a;
        }
        bxxk bxxk = f157358b;
        if (bxxk == null) {
            synchronized (bvqa.class) {
                bxxk = f157358b;
                if (bxxk == null) {
                    bxxk = new bxve(f157357a);
                    f157358b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
