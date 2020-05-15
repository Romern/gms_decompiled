package p000;

/* renamed from: bkle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkle extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkle f124727e;

    /* renamed from: i */
    private static volatile bxxk f124728i;

    /* renamed from: a */
    public String f124729a = "";

    /* renamed from: b */
    public String f124730b = "";

    /* renamed from: c */
    public long f124731c;

    /* renamed from: d */
    public boolean f124732d;

    /* renamed from: f */
    private int f124733f;

    /* renamed from: g */
    private String f124734g = "";

    /* renamed from: h */
    private byte f124735h = 2;

    static {
        bkle bkle = new bkle();
        f124727e = bkle;
        GeneratedMessageLite.m124024a(bkle.class, bkle);
    }

    private bkle() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124735h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124735h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f124727e, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"f", "g", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkle();
        } else {
            if (i2 == 4) {
                return new bxvd(f124727e);
            }
            if (i2 == 5) {
                return f124727e;
            }
            bxxk bxxk = f124728i;
            if (bxxk == null) {
                synchronized (bkle.class) {
                    bxxk = f124728i;
                    if (bxxk == null) {
                        bxxk = new bxve(f124727e);
                        f124728i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
