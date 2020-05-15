package p000;

/* renamed from: cbnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbnk f177735a;

    /* renamed from: b */
    private static volatile bxxk f177736b;

    static {
        cbnk cbnk = new cbnk();
        f177735a = cbnk;
        bxvk.m124024a(cbnk.class, cbnk);
    }

    private cbnk() {
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
            return bxvk.m124022a(f177735a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnk();
        }
        if (i2 == 4) {
            return new bxvd(f177735a);
        }
        if (i2 == 5) {
            return f177735a;
        }
        bxxk bxxk = f177736b;
        if (bxxk == null) {
            synchronized (cbnk.class) {
                bxxk = f177736b;
                if (bxxk == null) {
                    bxxk = new bxve(f177735a);
                    f177736b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
