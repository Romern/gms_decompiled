package p000;

/* renamed from: bydn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bydn f165809a;

    /* renamed from: i */
    private static volatile bxxk f165810i;

    /* renamed from: b */
    private int f165811b;

    /* renamed from: c */
    private String f165812c = "";

    /* renamed from: d */
    private long f165813d;

    /* renamed from: e */
    private long f165814e;

    /* renamed from: f */
    private bydm f165815f;

    /* renamed from: g */
    private bydm f165816g;

    /* renamed from: h */
    private byte f165817h = 2;

    static {
        bydn bydn = new bydn();
        f165809a = bydn;
        GeneratedMessageLite.m124024a(bydn.class, bydn);
    }

    private bydn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165817h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165817h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165809a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔈ\u0000\u0002ᔂ\u0001\u0003ᔂ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bydn();
        } else {
            if (i2 == 4) {
                return new bxvd(f165809a);
            }
            if (i2 == 5) {
                return f165809a;
            }
            bxxk bxxk = f165810i;
            if (bxxk == null) {
                synchronized (bydn.class) {
                    bxxk = f165810i;
                    if (bxxk == null) {
                        bxxk = new bxve(f165809a);
                        f165810i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
