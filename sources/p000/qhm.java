package p000;

/* renamed from: qhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final qhm f41375g;

    /* renamed from: i */
    private static volatile bxxk f41376i;

    /* renamed from: a */
    public int f41377a;

    /* renamed from: b */
    public String f41378b = "";

    /* renamed from: c */
    public String f41379c = "";

    /* renamed from: d */
    public String f41380d = "";

    /* renamed from: e */
    public bxwc f41381e = bxxn.f165040b;

    /* renamed from: f */
    public String f41382f = "";

    /* renamed from: h */
    private byte f41383h = 2;

    static {
        qhm qhm = new qhm();
        f41375g = qhm;
        GeneratedMessageLite.m124024a(qhm.class, qhm);
    }

    private qhm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41383h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41383h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41375g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005б\bဈ\u0004", new Object[]{"a", "b", "c", "d", "e", qhl.class, "f"});
        } else if (i2 == 3) {
            return new qhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f41375g);
            }
            if (i2 == 5) {
                return f41375g;
            }
            bxxk bxxk = f41376i;
            if (bxxk == null) {
                synchronized (qhm.class) {
                    bxxk = f41376i;
                    if (bxxk == null) {
                        bxxk = new bxve(f41375g);
                        f41376i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
