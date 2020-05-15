package p000;

/* renamed from: bowb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bowb f135084g;

    /* renamed from: h */
    private static volatile bxxk f135085h;

    /* renamed from: a */
    public int f135086a;

    /* renamed from: b */
    public int f135087b;

    /* renamed from: c */
    public String f135088c = "";

    /* renamed from: d */
    public bovz f135089d;

    /* renamed from: e */
    public long f135090e;

    /* renamed from: f */
    public long f135091f;

    static {
        bowb bowb = new bowb();
        f135084g = bowb;
        GeneratedMessageLite.m124024a(bowb.class, bowb);
    }

    private bowb() {
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
            return GeneratedMessageLite.m124022a(f135084g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", bowa.f135083a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bowb();
        } else {
            if (i2 == 4) {
                return new bxvd(f135084g);
            }
            if (i2 == 5) {
                return f135084g;
            }
            bxxk bxxk = f135085h;
            if (bxxk == null) {
                synchronized (bowb.class) {
                    bxxk = f135085h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135084g);
                        f135085h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
