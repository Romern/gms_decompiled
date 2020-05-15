package p000;

/* renamed from: cbez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbez extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbez f176874c;

    /* renamed from: d */
    private static volatile bxxk f176875d;

    /* renamed from: a */
    public String f176876a = "";

    /* renamed from: b */
    public String f176877b = "";

    static {
        cbez cbez = new cbez();
        f176874c = cbez;
        bxvk.m124024a(cbez.class, cbez);
    }

    private cbez() {
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
            return bxvk.m124022a(f176874c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbez();
        } else {
            if (i2 == 4) {
                return new bxvd(f176874c);
            }
            if (i2 == 5) {
                return f176874c;
            }
            bxxk bxxk = f176875d;
            if (bxxk == null) {
                synchronized (cbez.class) {
                    bxxk = f176875d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176874c);
                        f176875d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
