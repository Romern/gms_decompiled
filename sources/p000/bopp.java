package p000;

/* renamed from: bopp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bopp f134159e;

    /* renamed from: f */
    private static volatile bxxk f134160f;

    /* renamed from: a */
    public String f134161a = "";

    /* renamed from: b */
    public String f134162b = "";

    /* renamed from: c */
    public String f134163c = "";

    /* renamed from: d */
    public bxwc f134164d = bxxn.f165040b;

    static {
        bopp bopp = new bopp();
        f134159e = bopp;
        GeneratedMessageLite.m124024a(bopp.class, bopp);
    }

    private bopp() {
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
            return GeneratedMessageLite.m124022a(f134159e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"a", "b", "c", "d", bopq.class});
        } else if (i2 == 3) {
            return new bopp();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f134159e;
            }
            bxxk bxxk = f134160f;
            if (bxxk == null) {
                synchronized (bopp.class) {
                    bxxk = f134160f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134159e);
                        f134160f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
