package p000;

/* renamed from: blyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final blyn f128261o;

    /* renamed from: p */
    private static volatile bxxk f128262p;

    /* renamed from: a */
    public int f128263a;

    /* renamed from: b */
    public bmer f128264b;

    /* renamed from: c */
    public bmeo f128265c;

    /* renamed from: d */
    public bmog f128266d;

    /* renamed from: e */
    public bxwc f128267e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f128268f = bxxn.f165040b;

    /* renamed from: g */
    public ByteString f128269g = ByteString.f164797b;

    /* renamed from: h */
    public bmgo f128270h;

    /* renamed from: i */
    public bmft f128271i;

    /* renamed from: j */
    public bmeu f128272j;

    /* renamed from: k */
    public bxwc f128273k = bxxn.f165040b;

    /* renamed from: l */
    public ByteString f128274l = ByteString.f164797b;

    /* renamed from: m */
    public bmcc f128275m;

    /* renamed from: n */
    public bmdk f128276n;

    static {
        blyn blyn = new blyn();
        f128261o = blyn;
        GeneratedMessageLite.m124024a(blyn.class, blyn);
    }

    private blyn() {
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
            return GeneratedMessageLite.m124022a(f128261o, "\u0001\r\u0000\u0001\u0001\u0017\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005\u001a\u0006ည\u0004\u0007ဉ\u0005\bဉ\u0003\n\u001b\u000bည\t\fဉ\u0006\rဉ\b\u0012\u001b\u0015ဉ\n\u0017ဉ\u000b", new Object[]{"a", "b", "c", "f", "g", "h", "d", "k", bmed.class, "l", "i", "j", "e", bmog.class, "m", "n"});
        } else if (i2 == 3) {
            return new blyn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f128261o;
            }
            bxxk bxxk = f128262p;
            if (bxxk == null) {
                synchronized (blyn.class) {
                    bxxk = f128262p;
                    if (bxxk == null) {
                        bxxk = new bxve(f128261o);
                        f128262p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo66773b() {
        if (!this.f128273k.mo73666a()) {
            this.f128273k = GeneratedMessageLite.m124021a(this.f128273k);
        }
    }

    /* renamed from: a */
    public final void mo66772a() {
        if (!this.f128268f.mo73666a()) {
            this.f128268f = GeneratedMessageLite.m124021a(this.f128268f);
        }
    }
}
