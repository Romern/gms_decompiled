package p000;

/* renamed from: brbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brbr f142309b;

    /* renamed from: d */
    private static volatile bxxk f142310d;

    /* renamed from: a */
    public bral f142311a;

    /* renamed from: c */
    private int f142312c;

    static {
        brbr brbr = new brbr();
        f142309b = brbr;
        bxvk.m124024a(brbr.class, brbr);
    }

    private brbr() {
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
            return bxvk.m124022a(f142309b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbr();
        } else {
            if (i2 == 4) {
                return new bxvd(f142309b);
            }
            if (i2 == 5) {
                return f142309b;
            }
            bxxk bxxk = f142310d;
            if (bxxk == null) {
                synchronized (brbr.class) {
                    bxxk = f142310d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142309b);
                        f142310d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
