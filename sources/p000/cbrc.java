package p000;

/* renamed from: cbrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbrc f178104c;

    /* renamed from: d */
    private static volatile bxxk f178105d;

    /* renamed from: a */
    public bxyk f178106a;

    /* renamed from: b */
    public bxyk f178107b;

    static {
        cbrc cbrc = new cbrc();
        f178104c = cbrc;
        bxvk.m124024a(cbrc.class, cbrc);
    }

    private cbrc() {
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
            return bxvk.m124022a(f178104c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f178104c);
            }
            if (i2 == 5) {
                return f178104c;
            }
            bxxk bxxk = f178105d;
            if (bxxk == null) {
                synchronized (cbrc.class) {
                    bxxk = f178105d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178104c);
                        f178105d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
