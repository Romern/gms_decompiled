package p000;

/* renamed from: bvpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpw f157349a;

    /* renamed from: b */
    private static volatile bxxk f157350b;

    static {
        bvpw bvpw = new bvpw();
        f157349a = bvpw;
        bxvk.m124024a(bvpw.class, bvpw);
    }

    private bvpw() {
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
            return bxvk.m124022a(f157349a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpw();
        }
        if (i2 == 4) {
            return new bxvd(f157349a);
        }
        if (i2 == 5) {
            return f157349a;
        }
        bxxk bxxk = f157350b;
        if (bxxk == null) {
            synchronized (bvpw.class) {
                bxxk = f157350b;
                if (bxxk == null) {
                    bxxk = new bxve(f157349a);
                    f157350b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
