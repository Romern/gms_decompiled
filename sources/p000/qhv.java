package p000;

/* renamed from: qhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qhv f41428d;

    /* renamed from: f */
    private static volatile bxxk f41429f;

    /* renamed from: a */
    public int f41430a;

    /* renamed from: b */
    public String f41431b = "";

    /* renamed from: c */
    public String f41432c = "";

    /* renamed from: e */
    private byte f41433e = 2;

    static {
        qhv qhv = new qhv();
        f41428d = qhv;
        GeneratedMessageLite.m124024a(qhv.class, qhv);
    }

    private qhv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41433e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41433e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41428d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qhv();
        } else {
            if (i2 == 4) {
                return new bxvd(f41428d);
            }
            if (i2 == 5) {
                return f41428d;
            }
            bxxk bxxk = f41429f;
            if (bxxk == null) {
                synchronized (qhv.class) {
                    bxxk = f41429f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41428d);
                        f41429f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
