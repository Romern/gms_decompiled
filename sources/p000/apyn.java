package p000;

/* renamed from: apyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final apyn f85156g;

    /* renamed from: h */
    private static volatile bxxk f85157h;

    /* renamed from: a */
    public int f85158a;

    /* renamed from: b */
    public int f85159b;

    /* renamed from: c */
    public String f85160c = "";

    /* renamed from: d */
    public long f85161d;

    /* renamed from: e */
    public int f85162e;

    /* renamed from: f */
    public String f85163f = "";

    static {
        apyn apyn = new apyn();
        f85156g = apyn;
        GeneratedMessageLite.m124024a(apyn.class, apyn);
    }

    private apyn() {
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
            return GeneratedMessageLite.m124022a(f85156g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new apyn();
        } else {
            if (i2 == 4) {
                return new bxvd(f85156g);
            }
            if (i2 == 5) {
                return f85156g;
            }
            bxxk bxxk = f85157h;
            if (bxxk == null) {
                synchronized (apyn.class) {
                    bxxk = f85157h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85156g);
                        f85157h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
