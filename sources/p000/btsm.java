package p000;

/* renamed from: btsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btsm f150235b;

    /* renamed from: c */
    private static volatile bxxk f150236c;

    /* renamed from: a */
    public btsj f150237a;

    static {
        btsm btsm = new btsm();
        f150235b = btsm;
        bxvk.m124024a(btsm.class, btsm);
    }

    private btsm() {
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
            return bxvk.m124022a(f150235b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btsm();
        } else {
            if (i2 == 4) {
                return new bxvd(f150235b);
            }
            if (i2 == 5) {
                return f150235b;
            }
            bxxk bxxk = f150236c;
            if (bxxk == null) {
                synchronized (btsm.class) {
                    bxxk = f150236c;
                    if (bxxk == null) {
                        bxxk = new bxve(f150235b);
                        f150236c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
