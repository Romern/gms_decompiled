package p000;

/* renamed from: btjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btjg f149109e;

    /* renamed from: f */
    private static volatile bxxk f149110f;

    /* renamed from: a */
    public bxwc f149111a = bxxn.f165040b;

    /* renamed from: b */
    public bxtx f149112b = bxtx.f164797b;

    /* renamed from: c */
    public boolean f149113c;

    /* renamed from: d */
    public bxtx f149114d = bxtx.f164797b;

    static {
        btjg btjg = new btjg();
        f149109e = btjg;
        bxvk.m124024a(btjg.class, btjg);
    }

    private btjg() {
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
            return bxvk.m124022a(f149109e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002\n\u0003\u0007\u0005\n", new Object[]{"a", btjq.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new btjg();
        } else {
            if (i2 == 4) {
                return new bxvd(f149109e);
            }
            if (i2 == 5) {
                return f149109e;
            }
            bxxk bxxk = f149110f;
            if (bxxk == null) {
                synchronized (btjg.class) {
                    bxxk = f149110f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149109e);
                        f149110f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
