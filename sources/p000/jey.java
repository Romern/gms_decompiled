package p000;

/* renamed from: jey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jey extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final jey f22324i;

    /* renamed from: k */
    private static volatile bxxk f22325k;

    /* renamed from: a */
    public String f22326a = "";

    /* renamed from: b */
    public String f22327b = "";

    /* renamed from: c */
    public boolean f22328c;

    /* renamed from: d */
    public String f22329d = "";

    /* renamed from: e */
    public boolean f22330e;

    /* renamed from: f */
    public boolean f22331f;

    /* renamed from: g */
    public boolean f22332g;

    /* renamed from: h */
    public boolean f22333h;

    /* renamed from: j */
    private int f22334j;

    static {
        jey jey = new jey();
        f22324i = jey;
        GeneratedMessageLite.m124024a(jey.class, jey);
    }

    private jey() {
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
            return GeneratedMessageLite.m124022a(f22324i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new jey();
        } else {
            if (i2 == 4) {
                return new bxvd(f22324i);
            }
            if (i2 == 5) {
                return f22324i;
            }
            bxxk bxxk = f22325k;
            if (bxxk == null) {
                synchronized (jey.class) {
                    bxxk = f22325k;
                    if (bxxk == null) {
                        bxxk = new bxve(f22324i);
                        f22325k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
