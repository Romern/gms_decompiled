package p000;

/* renamed from: brdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdc extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final brdc f142475j;

    /* renamed from: l */
    private static volatile bxxk f142476l;

    /* renamed from: a */
    public int f142477a;

    /* renamed from: b */
    public String f142478b = "";

    /* renamed from: c */
    public boolean f142479c;

    /* renamed from: d */
    public int f142480d;

    /* renamed from: e */
    public int f142481e;

    /* renamed from: f */
    public bree f142482f;

    /* renamed from: g */
    public int f142483g;

    /* renamed from: h */
    public bxwc f142484h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f142485i = bxxn.f165040b;

    /* renamed from: k */
    private byte f142486k = 2;

    static {
        brdc brdc = new brdc();
        f142475j = brdc;
        GeneratedMessageLite.m124024a(brdc.class, brdc);
    }

    private brdc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142486k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142486k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f142475j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0002\u0002\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007င\u0006\bЛ\tЛ", new Object[]{"a", "b", "c", "d", brcm.m113876b(), "e", brcb.f142350a, "f", "g", "h", brch.class, "i", brdk.class});
        } else if (i2 == 3) {
            return new brdc();
        } else {
            if (i2 == 4) {
                return new bxvd(f142475j);
            }
            if (i2 == 5) {
                return f142475j;
            }
            bxxk bxxk = f142476l;
            if (bxxk == null) {
                synchronized (brdc.class) {
                    bxxk = f142476l;
                    if (bxxk == null) {
                        bxxk = new bxve(f142475j);
                        f142476l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
