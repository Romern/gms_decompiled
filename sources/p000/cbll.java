package p000;

/* renamed from: cbll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbll extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbll f177527e;

    /* renamed from: f */
    private static volatile bxxk f177528f;

    /* renamed from: a */
    public cbmo f177529a;

    /* renamed from: b */
    public String f177530b = "";

    /* renamed from: c */
    public cbma f177531c;

    /* renamed from: d */
    public cbkj f177532d;

    static {
        cbll cbll = new cbll();
        f177527e = cbll;
        bxvk.m124024a(cbll.class, cbll);
    }

    private cbll() {
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
            return bxvk.m124022a(f177527e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbll();
        } else {
            if (i2 == 4) {
                return new bxvd(f177527e);
            }
            if (i2 == 5) {
                return f177527e;
            }
            bxxk bxxk = f177528f;
            if (bxxk == null) {
                synchronized (cbll.class) {
                    bxxk = f177528f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177527e);
                        f177528f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
