package p000;

/* renamed from: cbib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbib extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbib f177226a;

    /* renamed from: b */
    private static volatile bxxk f177227b;

    static {
        cbib cbib = new cbib();
        f177226a = cbib;
        bxvk.m124024a(cbib.class, cbib);
    }

    private cbib() {
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
            return bxvk.m124022a(f177226a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbib();
        }
        if (i2 == 4) {
            return new bxvd(f177226a);
        }
        if (i2 == 5) {
            return f177226a;
        }
        bxxk bxxk = f177227b;
        if (bxxk == null) {
            synchronized (cbib.class) {
                bxxk = f177227b;
                if (bxxk == null) {
                    bxxk = new bxve(f177226a);
                    f177227b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
