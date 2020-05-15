package p000;

/* renamed from: bkxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkxy f125432a;

    /* renamed from: b */
    private static volatile bxxk f125433b;

    static {
        bkxy bkxy = new bkxy();
        f125432a = bkxy;
        bxvk.m124024a(bkxy.class, bkxy);
    }

    private bkxy() {
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
            return bxvk.m124022a(f125432a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bkxy();
        }
        if (i2 == 4) {
            return new bxvd(f125432a);
        }
        if (i2 == 5) {
            return f125432a;
        }
        bxxk bxxk = f125433b;
        if (bxxk == null) {
            synchronized (bkxy.class) {
                bxxk = f125433b;
                if (bxxk == null) {
                    bxxk = new bxve(f125432a);
                    f125433b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
