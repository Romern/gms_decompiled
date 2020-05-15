package p000;

/* renamed from: qgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgv extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final qgv f41250l;

    /* renamed from: n */
    private static volatile bxxk f41251n;

    /* renamed from: a */
    public int f41252a;

    /* renamed from: b */
    public boolean f41253b;

    /* renamed from: c */
    public long f41254c;

    /* renamed from: d */
    public bxwc f41255d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f41256e;

    /* renamed from: f */
    public bxwc f41257f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f41258g = bxxn.f165040b;

    /* renamed from: h */
    public long f41259h;

    /* renamed from: i */
    public String f41260i = "";

    /* renamed from: j */
    public String f41261j = "";

    /* renamed from: k */
    public bxwc f41262k = bxxn.f165040b;

    /* renamed from: m */
    private byte f41263m = 2;

    static {
        qgv qgv = new qgv();
        f41250l = qgv;
        GeneratedMessageLite.m124024a(qgv.class, qgv);
    }

    private qgv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41263m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41263m = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41250l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0004\u0003\u0001ᔇ\u0000\u0002Л\u0003ဂ\u0001\u0005Л\bစ\u0006\tဇ\u0003\n\u001a\u000bဈ\u0007\fဈ\b\r\u001a", new Object[]{"a", "b", "d", qhm.class, "c", "g", qgx.class, "h", "e", "f", "i", "j", "k"});
        } else if (i2 == 3) {
            return new qgv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41250l;
            }
            bxxk bxxk = f41251n;
            if (bxxk == null) {
                synchronized (qgv.class) {
                    bxxk = f41251n;
                    if (bxxk == null) {
                        bxxk = new bxve(f41250l);
                        f41251n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
