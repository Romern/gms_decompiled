package p000;

/* renamed from: cbnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbnl f177737a;

    /* renamed from: b */
    private static volatile bxxk f177738b;

    static {
        cbnl cbnl = new cbnl();
        f177737a = cbnl;
        bxvk.m124024a(cbnl.class, cbnl);
    }

    private cbnl() {
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
            return bxvk.m124022a(f177737a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnl();
        }
        if (i2 == 4) {
            return new bxvd(f177737a);
        }
        if (i2 == 5) {
            return f177737a;
        }
        bxxk bxxk = f177738b;
        if (bxxk == null) {
            synchronized (cbnl.class) {
                bxxk = f177738b;
                if (bxxk == null) {
                    bxxk = new bxve(f177737a);
                    f177738b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
