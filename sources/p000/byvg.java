package p000;

/* renamed from: byvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byvg f168431b;

    /* renamed from: c */
    private static volatile bxxk f168432c;

    /* renamed from: a */
    public bxwc f168433a = bxxn.f165040b;

    static {
        byvg byvg = new byvg();
        f168431b = byvg;
        bxvk.m124024a(byvg.class, byvg);
    }

    private byvg() {
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
            return bxvk.m124022a(f168431b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byvi.class});
        } else if (i2 == 3) {
            return new byvg();
        } else {
            if (i2 == 4) {
                return new bxvd(f168431b);
            }
            if (i2 == 5) {
                return f168431b;
            }
            bxxk bxxk = f168432c;
            if (bxxk == null) {
                synchronized (byvg.class) {
                    bxxk = f168432c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168431b);
                        f168432c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
