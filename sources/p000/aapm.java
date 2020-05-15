package p000;

/* renamed from: aapm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapm extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final aapm f28803f;

    /* renamed from: g */
    private static volatile bxxk f28804g;

    /* renamed from: a */
    public int f28805a;

    /* renamed from: b */
    public String f28806b = "";

    /* renamed from: c */
    public String f28807c = "";

    /* renamed from: d */
    public String f28808d = "";

    /* renamed from: e */
    public long f28809e;

    static {
        aapm aapm = new aapm();
        f28803f = aapm;
        GeneratedMessageLite.m124024a(aapm.class, aapm);
    }

    private aapm() {
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
            return GeneratedMessageLite.m124022a(f28803f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aapm();
        } else {
            if (i2 == 4) {
                return new bxvd(f28803f);
            }
            if (i2 == 5) {
                return f28803f;
            }
            bxxk bxxk = f28804g;
            if (bxxk == null) {
                synchronized (aapm.class) {
                    bxxk = f28804g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28803f);
                        f28804g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
