package p000;

/* renamed from: bork */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bork extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bork f134421e;

    /* renamed from: f */
    private static volatile bxxk f134422f;

    /* renamed from: a */
    public int f134423a;

    /* renamed from: b */
    public bxwc f134424b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f134425c = bxxn.f165040b;

    /* renamed from: d */
    public int f134426d;

    static {
        bork bork = new bork();
        f134421e = bork;
        bxvk.m124024a(bork.class, bork);
    }

    private bork() {
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
            return bxvk.m124022a(f134421e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0002\u0000\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"a", "b", borg.class, "c", borg.class, "d", borj.f134420a});
        } else if (i2 == 3) {
            return new bork();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f134421e;
            }
            bxxk bxxk = f134422f;
            if (bxxk == null) {
                synchronized (bork.class) {
                    bxxk = f134422f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134421e);
                        f134422f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
