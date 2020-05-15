package p000;

/* renamed from: bmpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final bmpk f130298o;

    /* renamed from: p */
    private static volatile bxxk f130299p;

    /* renamed from: a */
    public int f130300a;

    /* renamed from: b */
    public String f130301b = "";

    /* renamed from: c */
    public String f130302c = "";

    /* renamed from: d */
    public String f130303d = "";

    /* renamed from: e */
    public bmnr f130304e;

    /* renamed from: f */
    public bmnr f130305f;

    /* renamed from: g */
    public String f130306g = "";

    /* renamed from: h */
    public ByteString f130307h = ByteString.f164797b;

    /* renamed from: i */
    public long f130308i;

    /* renamed from: j */
    public bmnr f130309j;

    /* renamed from: k */
    public bmno f130310k;

    /* renamed from: l */
    public boolean f130311l;

    /* renamed from: m */
    public boolean f130312m;

    /* renamed from: n */
    public bwdm f130313n;

    static {
        bmpk bmpk = new bmpk();
        f130298o = bmpk;
        GeneratedMessageLite.m124024a(bmpk.class, bmpk);
    }

    private bmpk() {
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
            return GeneratedMessageLite.m124022a(f130298o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0005\u0004ဉ\b\u0005ဂ\u0007\u0006ဉ\t\bဉ\u0003\tဇ\n\nည\u0006\rဇ\u000b\u000eဈ\u0002\u000fဉ\u0004\u0010ဈ\u0001\u0011ဉ\f", new Object[]{"a", "b", "g", "j", "i", "k", "e", "l", "h", "m", "d", "f", "c", "n"});
        } else if (i2 == 3) {
            return new bmpk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130298o);
            }
            if (i2 == 5) {
                return f130298o;
            }
            bxxk bxxk = f130299p;
            if (bxxk == null) {
                synchronized (bmpk.class) {
                    bxxk = f130299p;
                    if (bxxk == null) {
                        bxxk = new bxve(f130298o);
                        f130299p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
