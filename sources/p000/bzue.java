package p000;

/* renamed from: bzue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzue extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzue f171411b;

    /* renamed from: c */
    private static volatile bxxk f171412c;

    /* renamed from: a */
    public long f171413a;

    static {
        bzue bzue = new bzue();
        f171411b = bzue;
        GeneratedMessageLite.m124024a(bzue.class, bzue);
    }

    private bzue() {
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
            return GeneratedMessageLite.m124022a(f171411b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzue();
        } else {
            if (i2 == 4) {
                return new bxvd(f171411b);
            }
            if (i2 == 5) {
                return f171411b;
            }
            bxxk bxxk = f171412c;
            if (bxxk == null) {
                synchronized (bzue.class) {
                    bxxk = f171412c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171411b);
                        f171412c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
