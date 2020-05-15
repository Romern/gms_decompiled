package p000;

/* renamed from: btrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btrz f150167e;

    /* renamed from: f */
    private static volatile bxxk f150168f;

    /* renamed from: a */
    public int f150169a;

    /* renamed from: b */
    public int f150170b;

    /* renamed from: c */
    public bxtx f150171c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f150172d = bxtx.f164797b;

    static {
        btrz btrz = new btrz();
        f150167e = btrz;
        bxvk.m124024a(btrz.class, btrz);
    }

    private btrz() {
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
            return bxvk.m124022a(f150167e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ည\u0002\u0005ည\u0004", new Object[]{"a", "b", btrx.f150166a, "c", "d"});
        } else if (i2 == 3) {
            return new btrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f150167e);
            }
            if (i2 == 5) {
                return f150167e;
            }
            bxxk bxxk = f150168f;
            if (bxxk == null) {
                synchronized (btrz.class) {
                    bxxk = f150168f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150167e);
                        f150168f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
