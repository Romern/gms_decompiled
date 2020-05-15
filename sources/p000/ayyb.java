package p000;

/* renamed from: ayyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ayyb f98728b;

    /* renamed from: d */
    private static volatile bxxk f98729d;

    /* renamed from: a */
    public int f98730a;

    /* renamed from: c */
    private int f98731c;

    static {
        ayyb ayyb = new ayyb();
        f98728b = ayyb;
        bxvk.m124024a(ayyb.class, ayyb);
    }

    private ayyb() {
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
            return bxvk.m124022a(f98728b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new ayyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f98728b);
            }
            if (i2 == 5) {
                return f98728b;
            }
            bxxk bxxk = f98729d;
            if (bxxk == null) {
                synchronized (ayyb.class) {
                    bxxk = f98729d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98728b);
                        f98729d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
