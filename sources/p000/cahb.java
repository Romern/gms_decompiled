package p000;

/* renamed from: cahb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cahb f174522c;

    /* renamed from: e */
    private static volatile bxxk f174523e;

    /* renamed from: a */
    public bxwc f174524a = bxxn.f165040b;

    /* renamed from: b */
    public long f174525b;

    /* renamed from: d */
    private int f174526d;

    static {
        cahb cahb = new cahb();
        f174522c = cahb;
        GeneratedMessageLite.m124024a(cahb.class, cahb);
    }

    private cahb() {
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
            return GeneratedMessageLite.m124022a(f174522c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"d", "a", caha.class, "b"});
        } else if (i2 == 3) {
            return new cahb();
        } else {
            if (i2 == 4) {
                return new bxvd(f174522c);
            }
            if (i2 == 5) {
                return f174522c;
            }
            bxxk bxxk = f174523e;
            if (bxxk == null) {
                synchronized (cahb.class) {
                    bxxk = f174523e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174522c);
                        f174523e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
