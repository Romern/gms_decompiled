package p000;

/* renamed from: qmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final qmt f41734g;

    /* renamed from: h */
    private static volatile bxxk f41735h;

    /* renamed from: a */
    public int f41736a;

    /* renamed from: b */
    public String f41737b = "";

    /* renamed from: c */
    public bxwc f41738c = bxxn.f165040b;

    /* renamed from: d */
    public String f41739d = "";

    /* renamed from: e */
    public int f41740e;

    /* renamed from: f */
    public int f41741f;

    static {
        qmt qmt = new qmt();
        f41734g = qmt;
        GeneratedMessageLite.m124024a(qmt.class, qmt);
    }

    private qmt() {
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
            return GeneratedMessageLite.m124022a(f41734g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002\u0005ဌ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", "c", djd.class, "d", "e", qmp.f41732a, "f", qmr.f41733a});
        } else if (i2 == 3) {
            return new qmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f41734g);
            }
            if (i2 == 5) {
                return f41734g;
            }
            bxxk bxxk = f41735h;
            if (bxxk == null) {
                synchronized (qmt.class) {
                    bxxk = f41735h;
                    if (bxxk == null) {
                        bxxk = new bxve(f41734g);
                        f41735h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
