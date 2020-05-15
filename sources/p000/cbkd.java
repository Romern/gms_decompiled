package p000;

/* renamed from: cbkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbkd f177393c;

    /* renamed from: d */
    private static volatile bxxk f177394d;

    /* renamed from: a */
    public cbmo f177395a;

    /* renamed from: b */
    public String f177396b = "";

    static {
        cbkd cbkd = new cbkd();
        f177393c = cbkd;
        GeneratedMessageLite.m124024a(cbkd.class, cbkd);
    }

    private cbkd() {
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
            return GeneratedMessageLite.m124022a(f177393c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f177393c);
            }
            if (i2 == 5) {
                return f177393c;
            }
            bxxk bxxk = f177394d;
            if (bxxk == null) {
                synchronized (cbkd.class) {
                    bxxk = f177394d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177393c);
                        f177394d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
