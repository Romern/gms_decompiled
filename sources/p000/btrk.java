package p000;

/* renamed from: btrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btrk f150112a;

    /* renamed from: b */
    private static volatile bxxk f150113b;

    static {
        btrk btrk = new btrk();
        f150112a = btrk;
        bxvk.m124024a(btrk.class, btrk);
    }

    private btrk() {
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
            return bxvk.m124022a(f150112a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btrk();
        }
        if (i2 == 4) {
            return new bxvd(f150112a);
        }
        if (i2 == 5) {
            return f150112a;
        }
        bxxk bxxk = f150113b;
        if (bxxk == null) {
            synchronized (btrk.class) {
                bxxk = f150113b;
                if (bxxk == null) {
                    bxxk = new bxve(f150112a);
                    f150113b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
