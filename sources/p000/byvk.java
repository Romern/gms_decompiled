package p000;

/* renamed from: byvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byvk f168441b;

    /* renamed from: d */
    private static volatile bxxk f168442d;

    /* renamed from: a */
    public int f168443a;

    /* renamed from: c */
    private int f168444c;

    static {
        byvk byvk = new byvk();
        f168441b = byvk;
        bxvk.m124024a(byvk.class, byvk);
    }

    private byvk() {
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
            return bxvk.m124022a(f168441b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bzbu.m125628b()});
        } else if (i2 == 3) {
            return new byvk();
        } else {
            if (i2 == 4) {
                return new bxvd(f168441b);
            }
            if (i2 == 5) {
                return f168441b;
            }
            bxxk bxxk = f168442d;
            if (bxxk == null) {
                synchronized (byvk.class) {
                    bxxk = f168442d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168441b);
                        f168442d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
