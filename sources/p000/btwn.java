package p000;

/* renamed from: btwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btwn f152726a;

    /* renamed from: b */
    private static volatile bxxk f152727b;

    static {
        btwn btwn = new btwn();
        f152726a = btwn;
        bxvk.m124024a(btwn.class, btwn);
    }

    private btwn() {
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
            return bxvk.m124022a(f152726a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwn();
        }
        if (i2 == 4) {
            return new bxvd(f152726a);
        }
        if (i2 == 5) {
            return f152726a;
        }
        bxxk bxxk = f152727b;
        if (bxxk == null) {
            synchronized (btwn.class) {
                bxxk = f152727b;
                if (bxxk == null) {
                    bxxk = new bxve(f152726a);
                    f152727b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
