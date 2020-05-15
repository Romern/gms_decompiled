package p000;

/* renamed from: blzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzq extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bxvu f128363m = new blzl();

    /* renamed from: p */
    public static final blzq f128364p;

    /* renamed from: q */
    private static volatile bxxk f128365q;

    /* renamed from: a */
    public int f128366a;

    /* renamed from: b */
    public String f128367b = "";

    /* renamed from: c */
    public blwj f128368c;

    /* renamed from: d */
    public String f128369d = "";

    /* renamed from: e */
    public bmab f128370e;

    /* renamed from: f */
    public bwey f128371f;

    /* renamed from: g */
    public boolean f128372g;

    /* renamed from: h */
    public int f128373h;

    /* renamed from: i */
    public int f128374i;

    /* renamed from: j */
    public boolean f128375j;

    /* renamed from: k */
    public boolean f128376k;

    /* renamed from: l */
    public bxvt f128377l = bxvm.f164965b;

    /* renamed from: n */
    public int f128378n;

    /* renamed from: o */
    public String f128379o = "";

    static {
        blzq blzq = new blzq();
        f128364p = blzq;
        GeneratedMessageLite.m124024a(blzq.class, blzq);
    }

    private blzq() {
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
            return GeneratedMessageLite.m124022a(f128364p, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007င\u0006\bဌ\u0007\tဇ\b\nဇ\t\u000b,\fဌ\n\rဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", blzg.f128348a, "j", "k", "l", blzp.m107813b(), "n", blzm.f128356a, "o"});
        } else if (i2 == 3) {
            return new blzq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f128364p;
            }
            bxxk bxxk = f128365q;
            if (bxxk == null) {
                synchronized (blzq.class) {
                    bxxk = f128365q;
                    if (bxxk == null) {
                        bxxk = new bxve(f128364p);
                        f128365q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
