package p000;

/* renamed from: apyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final apyc f85114c;

    /* renamed from: e */
    private static volatile bxxk f85115e;

    /* renamed from: a */
    public int f85116a;

    /* renamed from: b */
    public String f85117b = "";

    /* renamed from: d */
    private apyd f85118d;

    static {
        apyc apyc = new apyc();
        f85114c = apyc;
        GeneratedMessageLite.m124024a(apyc.class, apyc);
    }

    private apyc() {
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
            return GeneratedMessageLite.m124022a(f85114c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new apyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f85114c);
            }
            if (i2 == 5) {
                return f85114c;
            }
            bxxk bxxk = f85115e;
            if (bxxk == null) {
                synchronized (apyc.class) {
                    bxxk = f85115e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85114c);
                        f85115e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
