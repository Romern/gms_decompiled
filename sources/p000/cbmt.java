package p000;

/* renamed from: cbmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbmt f177676d;

    /* renamed from: e */
    private static volatile bxxk f177677e;

    /* renamed from: a */
    public cbma f177678a;

    /* renamed from: b */
    public cbmx f177679b;

    /* renamed from: c */
    public bxwc f177680c = bxxn.f165040b;

    static {
        cbmt cbmt = new cbmt();
        f177676d = cbmt;
        bxvk.m124024a(cbmt.class, cbmt);
    }

    private cbmt() {
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
            return bxvk.m124022a(f177676d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\t\u0004\u001b", new Object[]{"a", "b", "c", cbma.class});
        } else if (i2 == 3) {
            return new cbmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f177676d);
            }
            if (i2 == 5) {
                return f177676d;
            }
            bxxk bxxk = f177677e;
            if (bxxk == null) {
                synchronized (cbmt.class) {
                    bxxk = f177677e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177676d);
                        f177677e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
