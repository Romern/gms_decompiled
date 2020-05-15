package p000;

/* renamed from: bmrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmrc f130465f;

    /* renamed from: h */
    private static volatile bxxk f130466h;

    /* renamed from: a */
    public int f130467a;

    /* renamed from: b */
    public int f130468b = 0;

    /* renamed from: c */
    public Object f130469c;

    /* renamed from: d */
    public bmav f130470d;

    /* renamed from: e */
    public bmaq f130471e;

    /* renamed from: g */
    private byte f130472g = 2;

    static {
        bmrc bmrc = new bmrc();
        f130465f = bmrc;
        GeneratedMessageLite.m124024a(bmrc.class, bmrc);
    }

    private bmrc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130472g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130472g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130465f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ᐼ\u0000", new Object[]{"c", "b", "a", "d", "e", bmbr.class, bmet.class, bmrf.class});
        } else if (i2 == 3) {
            return new bmrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130465f);
            }
            if (i2 == 5) {
                return f130465f;
            }
            bxxk bxxk = f130466h;
            if (bxxk == null) {
                synchronized (bmrc.class) {
                    bxxk = f130466h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130465f);
                        f130466h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
