package p000;

/* renamed from: bxdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdf extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxdf f163018j;

    /* renamed from: k */
    private static volatile bxxk f163019k;

    /* renamed from: a */
    public int f163020a;

    /* renamed from: b */
    public int f163021b;

    /* renamed from: c */
    public long f163022c;

    /* renamed from: d */
    public int f163023d;

    /* renamed from: e */
    public String f163024e = "";

    /* renamed from: f */
    public String f163025f = "";

    /* renamed from: g */
    public ByteString f163026g = ByteString.f164797b;

    /* renamed from: h */
    public long f163027h;

    /* renamed from: i */
    public int f163028i;

    static {
        bxdf bxdf = new bxdf();
        f163018j = bxdf;
        GeneratedMessageLite.m124024a(bxdf.class, bxdf);
    }

    private bxdf() {
        bxvm bxvm = bxvm.f164965b;
        bxxn bxxn = bxxn.f165040b;
        this.f163027h = -1;
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
            return GeneratedMessageLite.m124022a(f163018j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\tဂ\u0006\fင\t", new Object[]{"a", "b", bxdd.f163017a, "c", "d", bxdb.f163016a, "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bxdf();
        } else {
            if (i2 == 4) {
                return new bxvd(f163018j);
            }
            if (i2 == 5) {
                return f163018j;
            }
            bxxk bxxk = f163019k;
            if (bxxk == null) {
                synchronized (bxdf.class) {
                    bxxk = f163019k;
                    if (bxxk == null) {
                        bxxk = new bxve(f163018j);
                        f163019k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
