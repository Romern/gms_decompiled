package p000;

/* renamed from: bsry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsry extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsry f146810e;

    /* renamed from: f */
    private static volatile bxxk f146811f;

    /* renamed from: a */
    public int f146812a;

    /* renamed from: b */
    public bxwc f146813b = bxxn.f165040b;

    /* renamed from: c */
    public int f146814c;

    /* renamed from: d */
    public String f146815d = "";

    static {
        bsry bsry = new bsry();
        f146810e = bsry;
        GeneratedMessageLite.m124024a(bsry.class, bsry);
    }

    private bsry() {
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
            return GeneratedMessageLite.m124022a(f146810e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "c", bsrx.f146809a, "b", bsrw.class, "d"});
        } else if (i2 == 3) {
            return new bsry();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f146810e;
            }
            bxxk bxxk = f146811f;
            if (bxxk == null) {
                synchronized (bsry.class) {
                    bxxk = f146811f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146810e);
                        f146811f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
