package p000;

/* renamed from: bzlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlc extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bzlc f170502h;

    /* renamed from: i */
    private static volatile bxxk f170503i;

    /* renamed from: a */
    public int f170504a;

    /* renamed from: b */
    public int f170505b = 0;

    /* renamed from: c */
    public Object f170506c;

    /* renamed from: d */
    public bzle f170507d;

    /* renamed from: e */
    public long f170508e;

    /* renamed from: f */
    public long f170509f;

    /* renamed from: g */
    public bxyk f170510g;

    static {
        bzlc bzlc = new bzlc();
        f170502h = bzlc;
        GeneratedMessageLite.m124024a(bzlc.class, bzlc);
    }

    private bzlc() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f170502h, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005ဉ\u0004\bြ\u0000\tြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", bzkl.class, bzld.class});
        } else if (i2 == 3) {
            return new bzlc();
        } else {
            if (i2 == 4) {
                return new bxvd(f170502h);
            }
            if (i2 == 5) {
                return f170502h;
            }
            bxxk bxxk = f170503i;
            if (bxxk == null) {
                synchronized (bzlc.class) {
                    bxxk = f170503i;
                    if (bxxk == null) {
                        bxxk = new bxve(f170502h);
                        f170503i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
