package p000;

/* renamed from: cbeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbeg f176841b;

    /* renamed from: c */
    private static volatile bxxk f176842c;

    /* renamed from: a */
    public String f176843a = "";

    static {
        cbeg cbeg = new cbeg();
        f176841b = cbeg;
        GeneratedMessageLite.m124024a(cbeg.class, cbeg);
    }

    private cbeg() {
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
            return GeneratedMessageLite.m124022a(f176841b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f176841b);
            }
            if (i2 == 5) {
                return f176841b;
            }
            bxxk bxxk = f176842c;
            if (bxxk == null) {
                synchronized (cbeg.class) {
                    bxxk = f176842c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176841b);
                        f176842c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
