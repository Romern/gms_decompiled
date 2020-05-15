package p000;

/* renamed from: bzto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzto extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzto f171353b;

    /* renamed from: c */
    private static volatile bxxk f171354c;

    /* renamed from: a */
    public String f171355a = "";

    static {
        bzto bzto = new bzto();
        f171353b = bzto;
        GeneratedMessageLite.m124024a(bzto.class, bzto);
    }

    private bzto() {
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
            return GeneratedMessageLite.m124022a(f171353b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzto();
        } else {
            if (i2 == 4) {
                return new bxvd(f171353b);
            }
            if (i2 == 5) {
                return f171353b;
            }
            bxxk bxxk = f171354c;
            if (bxxk == null) {
                synchronized (bzto.class) {
                    bxxk = f171354c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171353b);
                        f171354c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
