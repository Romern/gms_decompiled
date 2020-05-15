package p000;

/* renamed from: bzqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzqn f171035c;

    /* renamed from: e */
    private static volatile bxxk f171036e;

    /* renamed from: a */
    public boolean f171037a;

    /* renamed from: b */
    public String f171038b = "";

    /* renamed from: d */
    private int f171039d;

    static {
        bzqn bzqn = new bzqn();
        f171035c = bzqn;
        GeneratedMessageLite.m124024a(bzqn.class, bzqn);
    }

    private bzqn() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f171035c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171035c);
            }
            if (i2 == 5) {
                return f171035c;
            }
            bxxk bxxk = f171036e;
            if (bxxk == null) {
                synchronized (bzqn.class) {
                    bxxk = f171036e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171035c);
                        f171036e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
