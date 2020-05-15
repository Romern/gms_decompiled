package p000;

/* renamed from: bxnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxnu f164091d;

    /* renamed from: e */
    private static volatile bxxk f164092e;

    /* renamed from: a */
    public int f164093a;

    /* renamed from: b */
    public String f164094b = "";

    /* renamed from: c */
    public String f164095c = "";

    static {
        bxnu bxnu = new bxnu();
        f164091d = bxnu;
        GeneratedMessageLite.m124024a(bxnu.class, bxnu);
    }

    private bxnu() {
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
            return GeneratedMessageLite.m124022a(f164091d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f164091d);
            }
            if (i2 == 5) {
                return f164091d;
            }
            bxxk bxxk = f164092e;
            if (bxxk == null) {
                synchronized (bxnu.class) {
                    bxxk = f164092e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164091d);
                        f164092e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
