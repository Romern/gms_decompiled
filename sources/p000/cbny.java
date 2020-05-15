package p000;

/* renamed from: cbny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbny extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbny f177777c;

    /* renamed from: d */
    private static volatile bxxk f177778d;

    /* renamed from: a */
    public String f177779a = "";

    /* renamed from: b */
    public int f177780b;

    static {
        cbny cbny = new cbny();
        f177777c = cbny;
        GeneratedMessageLite.m124024a(cbny.class, cbny);
    }

    private cbny() {
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
            return GeneratedMessageLite.m124022a(f177777c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003Ȉ\u0004\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbny();
        } else {
            if (i2 == 4) {
                return new bxvd(f177777c);
            }
            if (i2 == 5) {
                return f177777c;
            }
            bxxk bxxk = f177778d;
            if (bxxk == null) {
                synchronized (cbny.class) {
                    bxxk = f177778d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177777c);
                        f177778d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
