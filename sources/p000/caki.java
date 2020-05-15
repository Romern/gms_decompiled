package p000;

/* renamed from: caki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caki extends bxvk implements bxxd {

    /* renamed from: a */
    public static final caki f174987a;

    /* renamed from: b */
    private static volatile bxxk f174988b;

    static {
        caki caki = new caki();
        f174987a = caki;
        bxvk.m124024a(caki.class, caki);
    }

    private caki() {
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
            return bxvk.m124022a(f174987a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new caki();
        }
        if (i2 == 4) {
            return new bxvd(f174987a);
        }
        if (i2 == 5) {
            return f174987a;
        }
        bxxk bxxk = f174988b;
        if (bxxk == null) {
            synchronized (caki.class) {
                bxxk = f174988b;
                if (bxxk == null) {
                    bxxk = new bxve(f174987a);
                    f174988b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
