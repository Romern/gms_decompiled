package p000;

/* renamed from: canj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final canj f175368f;

    /* renamed from: g */
    private static volatile bxxk f175369g;

    /* renamed from: a */
    public int f175370a;

    /* renamed from: b */
    public int f175371b;

    /* renamed from: c */
    public String f175372c = "";

    /* renamed from: d */
    public long f175373d;

    /* renamed from: e */
    public long f175374e;

    static {
        canj canj = new canj();
        f175368f = canj;
        GeneratedMessageLite.m124024a(canj.class, canj);
    }

    private canj() {
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
            return GeneratedMessageLite.m124022a(f175368f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", canh.f175367a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new canj();
        } else {
            if (i2 == 4) {
                return new bxvd(f175368f);
            }
            if (i2 == 5) {
                return f175368f;
            }
            bxxk bxxk = f175369g;
            if (bxxk == null) {
                synchronized (canj.class) {
                    bxxk = f175369g;
                    if (bxxk == null) {
                        bxxk = new bxve(f175368f);
                        f175369g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
