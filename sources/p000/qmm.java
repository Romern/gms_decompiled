package p000;

/* renamed from: qmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final qmm f41713g;

    /* renamed from: h */
    private static volatile bxxk f41714h;

    /* renamed from: a */
    public int f41715a;

    /* renamed from: b */
    public qmk f41716b;

    /* renamed from: c */
    public boolean f41717c;

    /* renamed from: d */
    public boolean f41718d;

    /* renamed from: e */
    public long f41719e;

    /* renamed from: f */
    public boolean f41720f;

    static {
        qmm qmm = new qmm();
        f41713g = qmm;
        GeneratedMessageLite.m124024a(qmm.class, qmm);
    }

    private qmm() {
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
            return GeneratedMessageLite.m124022a(f41713g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new qmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f41713g);
            }
            if (i2 == 5) {
                return f41713g;
            }
            bxxk bxxk = f41714h;
            if (bxxk == null) {
                synchronized (qmm.class) {
                    bxxk = f41714h;
                    if (bxxk == null) {
                        bxxk = new bxve(f41713g);
                        f41714h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
