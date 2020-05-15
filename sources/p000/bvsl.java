package p000;

/* renamed from: bvsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsl f157498a;

    /* renamed from: b */
    private static volatile bxxk f157499b;

    static {
        bvsl bvsl = new bvsl();
        f157498a = bvsl;
        bxvk.m124024a(bvsl.class, bvsl);
    }

    private bvsl() {
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
            return bxvk.m124022a(f157498a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsl();
        }
        if (i2 == 4) {
            return new bxvd(f157498a);
        }
        if (i2 == 5) {
            return f157498a;
        }
        bxxk bxxk = f157499b;
        if (bxxk == null) {
            synchronized (bvsl.class) {
                bxxk = f157499b;
                if (bxxk == null) {
                    bxxk = new bxve(f157498a);
                    f157499b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
