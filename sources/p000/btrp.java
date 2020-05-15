package p000;

/* renamed from: btrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrp extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btrp f150133a;

    /* renamed from: b */
    private static volatile bxxk f150134b;

    static {
        btrp btrp = new btrp();
        f150133a = btrp;
        bxvk.m124024a(btrp.class, btrp);
    }

    private btrp() {
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
            return bxvk.m124022a(f150133a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btrp();
        }
        if (i2 == 4) {
            return new bxvd(f150133a);
        }
        if (i2 == 5) {
            return f150133a;
        }
        bxxk bxxk = f150134b;
        if (bxxk == null) {
            synchronized (btrp.class) {
                bxxk = f150134b;
                if (bxxk == null) {
                    bxxk = new bxve(f150133a);
                    f150134b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
