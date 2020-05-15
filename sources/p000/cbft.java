package p000;

/* renamed from: cbft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbft extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbft f176969c;

    /* renamed from: d */
    private static volatile bxxk f176970d;

    /* renamed from: a */
    public bxwc f176971a = bxxn.f165040b;

    /* renamed from: b */
    public int f176972b;

    static {
        cbft cbft = new cbft();
        f176969c = cbft;
        bxvk.m124024a(cbft.class, cbft);
    }

    private cbft() {
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
            return bxvk.m124022a(f176969c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"a", cbfs.class, "b"});
        } else if (i2 == 3) {
            return new cbft();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176969c;
            }
            bxxk bxxk = f176970d;
            if (bxxk == null) {
                synchronized (cbft.class) {
                    bxxk = f176970d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176969c);
                        f176970d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
