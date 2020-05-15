package p000;

/* renamed from: btma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btma extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btma f149457d;

    /* renamed from: e */
    private static volatile bxxk f149458e;

    /* renamed from: a */
    public int f149459a;

    /* renamed from: b */
    public int f149460b;

    /* renamed from: c */
    public long f149461c;

    static {
        btma btma = new btma();
        f149457d = btma;
        bxvk.m124024a(btma.class, btma);
    }

    private btma() {
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
            return bxvk.m124022a(f149457d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btma();
        } else {
            if (i2 == 4) {
                return new bxvd(f149457d);
            }
            if (i2 == 5) {
                return f149457d;
            }
            bxxk bxxk = f149458e;
            if (bxxk == null) {
                synchronized (btma.class) {
                    bxxk = f149458e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149457d);
                        f149458e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
