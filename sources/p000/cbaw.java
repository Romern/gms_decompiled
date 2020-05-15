package p000;

/* renamed from: cbaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbaw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbaw f176507d;

    /* renamed from: e */
    private static volatile bxxk f176508e;

    /* renamed from: a */
    public String f176509a = "";

    /* renamed from: b */
    public int f176510b;

    /* renamed from: c */
    public int f176511c;

    static {
        cbaw cbaw = new cbaw();
        f176507d = cbaw;
        GeneratedMessageLite.m124024a(cbaw.class, cbaw);
    }

    private cbaw() {
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
            return GeneratedMessageLite.m124022a(f176507d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbaw();
        } else {
            if (i2 == 4) {
                return new bxvd(f176507d);
            }
            if (i2 == 5) {
                return f176507d;
            }
            bxxk bxxk = f176508e;
            if (bxxk == null) {
                synchronized (cbaw.class) {
                    bxxk = f176508e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176507d);
                        f176508e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
