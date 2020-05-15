package p000;

/* renamed from: bvta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvta extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvta f157552a;

    /* renamed from: b */
    private static volatile bxxk f157553b;

    static {
        bvta bvta = new bvta();
        f157552a = bvta;
        bxvk.m124024a(bvta.class, bvta);
    }

    private bvta() {
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
            return bxvk.m124022a(f157552a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvta();
        }
        if (i2 == 4) {
            return new bxvd(f157552a);
        }
        if (i2 == 5) {
            return f157552a;
        }
        bxxk bxxk = f157553b;
        if (bxxk == null) {
            synchronized (bvta.class) {
                bxxk = f157553b;
                if (bxxk == null) {
                    bxxk = new bxve(f157552a);
                    f157553b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
