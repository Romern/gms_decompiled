package p000;

/* renamed from: aajz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aajz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aajz f28330e;

    /* renamed from: g */
    private static volatile bxxk f28331g;

    /* renamed from: a */
    public int f28332a;

    /* renamed from: b */
    public long f28333b;

    /* renamed from: c */
    public blmp f28334c;

    /* renamed from: d */
    public int f28335d;

    /* renamed from: f */
    private byte f28336f = 2;

    static {
        aajz aajz = new aajz();
        f28330e = aajz;
        GeneratedMessageLite.m124024a(aajz.class, aajz);
    }

    private aajz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f28336f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f28336f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f28330e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", aajx.f28329a});
        } else if (i2 == 3) {
            return new aajz();
        } else {
            if (i2 == 4) {
                return new bxvd(f28330e);
            }
            if (i2 == 5) {
                return f28330e;
            }
            bxxk bxxk = f28331g;
            if (bxxk == null) {
                synchronized (aajz.class) {
                    bxxk = f28331g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28330e);
                        f28331g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
