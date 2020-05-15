package p000;

/* renamed from: bxhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxhy f163486c;

    /* renamed from: d */
    private static volatile bxxk f163487d;

    /* renamed from: a */
    public int f163488a;

    /* renamed from: b */
    public bxie f163489b;

    static {
        bxhy bxhy = new bxhy();
        f163486c = bxhy;
        bxvk.m124024a(bxhy.class, bxhy);
    }

    private bxhy() {
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
            return bxvk.m124022a(f163486c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f163486c);
            }
            if (i2 == 5) {
                return f163486c;
            }
            bxxk bxxk = f163487d;
            if (bxxk == null) {
                synchronized (bxhy.class) {
                    bxxk = f163487d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163486c);
                        f163487d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
