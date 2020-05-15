package p000;

/* renamed from: abur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abur extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final abur f58453f;

    /* renamed from: g */
    private static volatile bxxk f58454g;

    /* renamed from: a */
    public int f58455a;

    /* renamed from: b */
    public String f58456b = "";

    /* renamed from: c */
    public abup f58457c;

    /* renamed from: d */
    public abuo f58458d;

    /* renamed from: e */
    public abuq f58459e;

    static {
        abur abur = new abur();
        f58453f = abur;
        GeneratedMessageLite.m124024a(abur.class, abur);
    }

    private abur() {
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
            return GeneratedMessageLite.m124022a(f58453f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new abur();
        } else {
            if (i2 == 4) {
                return new bxvd(f58453f);
            }
            if (i2 == 5) {
                return f58453f;
            }
            bxxk bxxk = f58454g;
            if (bxxk == null) {
                synchronized (abur.class) {
                    bxxk = f58454g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58453f);
                        f58454g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
