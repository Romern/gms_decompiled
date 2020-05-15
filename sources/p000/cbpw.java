package p000;

/* renamed from: cbpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbpw f177965b;

    /* renamed from: c */
    private static volatile bxxk f177966c;

    /* renamed from: a */
    public String f177967a = "";

    static {
        cbpw cbpw = new cbpw();
        f177965b = cbpw;
        GeneratedMessageLite.m124024a(cbpw.class, cbpw);
    }

    private cbpw() {
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
            return GeneratedMessageLite.m124022a(f177965b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpw();
        } else {
            if (i2 == 4) {
                return new bxvd(f177965b);
            }
            if (i2 == 5) {
                return f177965b;
            }
            bxxk bxxk = f177966c;
            if (bxxk == null) {
                synchronized (cbpw.class) {
                    bxxk = f177966c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177965b);
                        f177966c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
