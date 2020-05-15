package p000;

/* renamed from: boxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boxq f135276e;

    /* renamed from: f */
    private static volatile bxxk f135277f;

    /* renamed from: a */
    public int f135278a;

    /* renamed from: b */
    public String f135279b = "";

    /* renamed from: c */
    public int f135280c;

    /* renamed from: d */
    public String f135281d = "";

    static {
        boxq boxq = new boxq();
        f135276e = boxq;
        GeneratedMessageLite.m124024a(boxq.class, boxq);
    }

    private boxq() {
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
            return GeneratedMessageLite.m124022a(f135276e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", boxp.f135275a, "d"});
        } else if (i2 == 3) {
            return new boxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f135276e);
            }
            if (i2 == 5) {
                return f135276e;
            }
            bxxk bxxk = f135277f;
            if (bxxk == null) {
                synchronized (boxq.class) {
                    bxxk = f135277f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135276e);
                        f135277f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
