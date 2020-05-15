package p000;

/* renamed from: cbaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbaz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbaz f176518a;

    /* renamed from: b */
    private static volatile bxxk f176519b;

    static {
        cbaz cbaz = new cbaz();
        f176518a = cbaz;
        bxvk.m124024a(cbaz.class, cbaz);
    }

    private cbaz() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f176518a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbaz();
        }
        if (i2 == 4) {
            return new bxvd(f176518a);
        }
        if (i2 == 5) {
            return f176518a;
        }
        bxxk bxxk = f176519b;
        if (bxxk == null) {
            synchronized (cbaz.class) {
                bxxk = f176519b;
                if (bxxk == null) {
                    bxxk = new bxve(f176518a);
                    f176519b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
