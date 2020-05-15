package p000;

/* renamed from: bsrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsrb f146729c;

    /* renamed from: d */
    private static volatile bxxk f146730d;

    /* renamed from: a */
    public int f146731a;

    /* renamed from: b */
    public String f146732b = "";

    static {
        bsrb bsrb = new bsrb();
        f146729c = bsrb;
        GeneratedMessageLite.m124024a(bsrb.class, bsrb);
    }

    private bsrb() {
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
            return GeneratedMessageLite.m124022a(f146729c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f146729c);
            }
            if (i2 == 5) {
                return f146729c;
            }
            bxxk bxxk = f146730d;
            if (bxxk == null) {
                synchronized (bsrb.class) {
                    bxxk = f146730d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146729c);
                        f146730d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
