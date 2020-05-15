package p000;

/* renamed from: bzek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzek extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzek f169664b;

    /* renamed from: c */
    private static volatile bxxk f169665c;

    /* renamed from: a */
    public String f169666a = "";

    static {
        bzek bzek = new bzek();
        f169664b = bzek;
        GeneratedMessageLite.m124024a(bzek.class, bzek);
    }

    private bzek() {
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
            return GeneratedMessageLite.m124022a(f169664b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzek();
        } else {
            if (i2 == 4) {
                return new bxvd(f169664b);
            }
            if (i2 == 5) {
                return f169664b;
            }
            bxxk bxxk = f169665c;
            if (bxxk == null) {
                synchronized (bzek.class) {
                    bxxk = f169665c;
                    if (bxxk == null) {
                        bxxk = new bxve(f169664b);
                        f169665c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
