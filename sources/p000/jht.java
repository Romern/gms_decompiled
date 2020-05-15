package p000;

/* renamed from: jht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jht extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final jht f22505j;

    /* renamed from: k */
    private static volatile bxxk f22506k;

    /* renamed from: a */
    public int f22507a;

    /* renamed from: b */
    public String f22508b = "";

    /* renamed from: c */
    public String f22509c = "";

    /* renamed from: d */
    public String f22510d = "";

    /* renamed from: e */
    public String f22511e = "";

    /* renamed from: f */
    public String f22512f = "";

    /* renamed from: g */
    public boolean f22513g;

    /* renamed from: h */
    public boolean f22514h;

    /* renamed from: i */
    public int f22515i;

    static {
        jht jht = new jht();
        f22505j = jht;
        GeneratedMessageLite.m124024a(jht.class, jht);
    }

    private jht() {
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
            return GeneratedMessageLite.m124022a(f22505j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new jht();
        } else {
            if (i2 == 4) {
                return new bxvd(f22505j);
            }
            if (i2 == 5) {
                return f22505j;
            }
            bxxk bxxk = f22506k;
            if (bxxk == null) {
                synchronized (jht.class) {
                    bxxk = f22506k;
                    if (bxxk == null) {
                        bxxk = new bxve(f22505j);
                        f22506k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
