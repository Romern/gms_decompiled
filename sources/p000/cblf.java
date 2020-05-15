package p000;

/* renamed from: cblf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblf extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final cblf f177482m;

    /* renamed from: n */
    private static volatile bxxk f177483n;

    /* renamed from: a */
    public cbmo f177484a;

    /* renamed from: b */
    public cbma f177485b;

    /* renamed from: c */
    public long f177486c;

    /* renamed from: d */
    public int f177487d;

    /* renamed from: e */
    public ByteString f177488e = ByteString.f164797b;

    /* renamed from: f */
    public cbld f177489f;

    /* renamed from: g */
    public String f177490g = "";

    /* renamed from: h */
    public ByteString f177491h = ByteString.f164797b;

    /* renamed from: i */
    public String f177492i = "";

    /* renamed from: j */
    public cbma f177493j;

    /* renamed from: k */
    public cbml f177494k;

    /* renamed from: l */
    public cble f177495l;

    static {
        cblf cblf = new cblf();
        f177482m = cblf;
        GeneratedMessageLite.m124024a(cblf.class, cblf);
    }

    private cblf() {
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
            return GeneratedMessageLite.m124022a(f177482m, "\u0000\f\u0000\u0000\u0001\u0011\f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0002\u0004\n\u0005Ȉ\u0006\n\u0007Ȉ\u000b\t\r\t\u000e\t\u0010\f\u0011\t", new Object[]{"a", "b", "c", "e", "g", "h", "i", "k", "f", "j", "d", "l"});
        } else if (i2 == 3) {
            return new cblf();
        } else {
            if (i2 == 4) {
                return new bxvd(f177482m);
            }
            if (i2 == 5) {
                return f177482m;
            }
            bxxk bxxk = f177483n;
            if (bxxk == null) {
                synchronized (cblf.class) {
                    bxxk = f177483n;
                    if (bxxk == null) {
                        bxxk = new bxve(f177482m);
                        f177483n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
