package p000;

/* renamed from: cbni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbni extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbni f177731a;

    /* renamed from: b */
    private static volatile bxxk f177732b;

    static {
        cbni cbni = new cbni();
        f177731a = cbni;
        bxvk.m124024a(cbni.class, cbni);
    }

    private cbni() {
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
            return bxvk.m124022a(f177731a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbni();
        }
        if (i2 == 4) {
            return new bxvd(f177731a);
        }
        if (i2 == 5) {
            return f177731a;
        }
        bxxk bxxk = f177732b;
        if (bxxk == null) {
            synchronized (cbni.class) {
                bxxk = f177732b;
                if (bxxk == null) {
                    bxxk = new bxve(f177731a);
                    f177732b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
