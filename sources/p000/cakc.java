package p000;

/* renamed from: cakc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakc extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final cakc f174926m;

    /* renamed from: n */
    private static volatile bxxk f174927n;

    /* renamed from: a */
    public int f174928a;

    /* renamed from: b */
    public int f174929b;

    /* renamed from: c */
    public String f174930c = "";

    /* renamed from: d */
    public ByteString f174931d = ByteString.f164797b;

    /* renamed from: e */
    public boolean f174932e;

    /* renamed from: f */
    public String f174933f = "";

    /* renamed from: g */
    public String f174934g = "";

    /* renamed from: h */
    public String f174935h = "";

    /* renamed from: i */
    public boolean f174936i;

    /* renamed from: j */
    public boolean f174937j;

    /* renamed from: k */
    public boolean f174938k;

    /* renamed from: l */
    public ByteString f174939l = ByteString.f164797b;

    static {
        cakc cakc = new cakc();
        f174926m = cakc;
        GeneratedMessageLite.m124024a(cakc.class, cakc);
    }

    private cakc() {
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
            return GeneratedMessageLite.m124022a(f174926m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0007\bဇ\b\tဈ\u0006\nဇ\t\rည\u000b", new Object[]{"a", "b", cakb.m126712b(), "c", "d", "e", "f", "g", "i", "j", "h", "k", "l"});
        } else if (i2 == 3) {
            return new cakc();
        } else {
            if (i2 == 4) {
                return new bxvd(f174926m);
            }
            if (i2 == 5) {
                return f174926m;
            }
            bxxk bxxk = f174927n;
            if (bxxk == null) {
                synchronized (cakc.class) {
                    bxxk = f174927n;
                    if (bxxk == null) {
                        bxxk = new bxve(f174926m);
                        f174927n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
