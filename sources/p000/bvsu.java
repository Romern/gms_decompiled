package p000;

/* renamed from: bvsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsu f157529a;

    /* renamed from: b */
    private static volatile bxxk f157530b;

    static {
        bvsu bvsu = new bvsu();
        f157529a = bvsu;
        bxvk.m124024a(bvsu.class, bvsu);
    }

    private bvsu() {
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
            return bxvk.m124022a(f157529a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsu();
        }
        if (i2 == 4) {
            return new bxvd(f157529a);
        }
        if (i2 == 5) {
            return f157529a;
        }
        bxxk bxxk = f157530b;
        if (bxxk == null) {
            synchronized (bvsu.class) {
                bxxk = f157530b;
                if (bxxk == null) {
                    bxxk = new bxve(f157529a);
                    f157530b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
