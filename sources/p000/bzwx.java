package p000;

/* renamed from: bzwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwx extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzwx f171692g;

    /* renamed from: h */
    private static volatile bxxk f171693h;

    /* renamed from: a */
    public int f171694a;

    /* renamed from: b */
    public brzz f171695b;

    /* renamed from: c */
    public bzwv f171696c;

    /* renamed from: d */
    public String f171697d = "";

    /* renamed from: e */
    public String f171698e = "";

    /* renamed from: f */
    public bxwc f171699f = bxxn.f165040b;

    static {
        bzwx bzwx = new bzwx();
        f171692g = bzwx;
        GeneratedMessageLite.m124024a(bzwx.class, bzwx);
    }

    private bzwx() {
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
            return GeneratedMessageLite.m124022a(f171692g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bzxa.class});
        } else if (i2 == 3) {
            return new bzwx();
        } else {
            if (i2 == 4) {
                return new bxvd(f171692g);
            }
            if (i2 == 5) {
                return f171692g;
            }
            bxxk bxxk = f171693h;
            if (bxxk == null) {
                synchronized (bzwx.class) {
                    bxxk = f171693h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171692g);
                        f171693h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
