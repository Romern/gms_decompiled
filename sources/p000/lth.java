package p000;

/* renamed from: lth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lth extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final lth f32914q;

    /* renamed from: s */
    private static volatile bxxk f32915s;

    /* renamed from: a */
    public int f32916a;

    /* renamed from: b */
    public long f32917b;

    /* renamed from: c */
    public long f32918c;

    /* renamed from: d */
    public String f32919d = "";

    /* renamed from: e */
    public String f32920e = "";

    /* renamed from: f */
    public int f32921f;

    /* renamed from: g */
    public int f32922g = 1;

    /* renamed from: h */
    public String f32923h = "";

    /* renamed from: i */
    public String f32924i = "";

    /* renamed from: j */
    public int f32925j;

    /* renamed from: k */
    public bxwc f32926k = bxxn.f165040b;

    /* renamed from: l */
    public lte f32927l;

    /* renamed from: m */
    public lta f32928m;

    /* renamed from: n */
    public ltc f32929n;

    /* renamed from: o */
    public ltg f32930o;

    /* renamed from: p */
    public ltd f32931p;

    /* renamed from: r */
    private byte f32932r = 2;

    static {
        lth lth = new lth();
        f32914q = lth;
        GeneratedMessageLite.m124024a(lth.class, lth);
    }

    private lth() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32932r);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32932r = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f32914q, "\u0001\u000f\u0000\u0001\u00015\u000f\u0000\u0001\u0003\u0001ᔂ\u0000\u0002б\rထ\f\u000eᔈ\u0004\u000fင\u0005\u0011ထ\r\u0013င\u0006\u0019ဈ\u0002\u001aဉ\u000e\u001fဈ\t$ဌ\u000b*ဉ\u0011,ဈ\n2ဂ\u00015ဉ\u0012", new Object[]{"a", "b", "k", lsz.class, "l", "e", "f", "m", "g", "d", "n", "h", "j", ltb.f32887a, "o", "i", "c", "p"});
        } else if (i2 == 3) {
            return new lth();
        } else {
            if (i2 == 4) {
                return new bxvd(f32914q);
            }
            if (i2 == 5) {
                return f32914q;
            }
            bxxk bxxk = f32915s;
            if (bxxk == null) {
                synchronized (lth.class) {
                    bxxk = f32915s;
                    if (bxxk == null) {
                        bxxk = new bxve(f32914q);
                        f32915s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo19598a() {
        if (!this.f32926k.mo73666a()) {
            this.f32926k = GeneratedMessageLite.m124021a(this.f32926k);
        }
    }
}
