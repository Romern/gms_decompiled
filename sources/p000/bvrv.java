package p000;

/* renamed from: bvrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrv f157464a;

    /* renamed from: b */
    private static volatile bxxk f157465b;

    static {
        bvrv bvrv = new bvrv();
        f157464a = bvrv;
        bxvk.m124024a(bvrv.class, bvrv);
    }

    private bvrv() {
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
            return bxvk.m124022a(f157464a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrv();
        }
        if (i2 == 4) {
            return new bxvd(f157464a);
        }
        if (i2 == 5) {
            return f157464a;
        }
        bxxk bxxk = f157465b;
        if (bxxk == null) {
            synchronized (bvrv.class) {
                bxxk = f157465b;
                if (bxxk == null) {
                    bxxk = new bxve(f157464a);
                    f157465b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
