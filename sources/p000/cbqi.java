package p000;

/* renamed from: cbqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbqi f178026d;

    /* renamed from: e */
    private static volatile bxxk f178027e;

    /* renamed from: a */
    public cbql f178028a;

    /* renamed from: b */
    public cbqy f178029b;

    /* renamed from: c */
    public cbrc f178030c;

    static {
        cbqi cbqi = new cbqi();
        f178026d = cbqi;
        bxvk.m124024a(cbqi.class, cbqi);
    }

    private cbqi() {
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
            return bxvk.m124022a(f178026d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"b", "a", "c"});
        } else if (i2 == 3) {
            return new cbqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f178026d);
            }
            if (i2 == 5) {
                return f178026d;
            }
            bxxk bxxk = f178027e;
            if (bxxk == null) {
                synchronized (cbqi.class) {
                    bxxk = f178027e;
                    if (bxxk == null) {
                        bxxk = new bxve(f178026d);
                        f178027e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
