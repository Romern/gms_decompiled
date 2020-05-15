package p000;

/* renamed from: cbqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbqd f178006c;

    /* renamed from: d */
    private static volatile bxxk f178007d;

    /* renamed from: a */
    public String f178008a = "";

    /* renamed from: b */
    public String f178009b = "";

    static {
        cbqd cbqd = new cbqd();
        f178006c = cbqd;
        bxvk.m124024a(cbqd.class, cbqd);
    }

    private cbqd() {
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
            return bxvk.m124022a(f178006c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbqd();
        } else {
            if (i2 == 4) {
                return new bxvd(f178006c);
            }
            if (i2 == 5) {
                return f178006c;
            }
            bxxk bxxk = f178007d;
            if (bxxk == null) {
                synchronized (cbqd.class) {
                    bxxk = f178007d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178006c);
                        f178007d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
