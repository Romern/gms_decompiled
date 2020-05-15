package p000;

/* renamed from: bzqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzqv f171075c;

    /* renamed from: e */
    private static volatile bxxk f171076e;

    /* renamed from: a */
    public String f171077a = "";

    /* renamed from: b */
    public bxwc f171078b = bxxn.f165040b;

    /* renamed from: d */
    private int f171079d;

    static {
        bzqv bzqv = new bzqv();
        f171075c = bzqv;
        bxvk.m124024a(bzqv.class, bzqv);
    }

    private bzqv() {
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
            return bxvk.m124022a(f171075c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bzqy.class});
        } else if (i2 == 3) {
            return new bzqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171075c);
            }
            if (i2 == 5) {
                return f171075c;
            }
            bxxk bxxk = f171076e;
            if (bxxk == null) {
                synchronized (bzqv.class) {
                    bxxk = f171076e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171075c);
                        f171076e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
