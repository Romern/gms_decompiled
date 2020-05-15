package p000;

/* renamed from: bpsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsz extends bxvk implements bxxd {

    /* renamed from: I */
    public static final bpsz f139036I;

    /* renamed from: K */
    private static volatile bxxk f139037K;

    /* renamed from: A */
    public bpti f139038A;

    /* renamed from: B */
    public bxwc f139039B;

    /* renamed from: C */
    public int f139040C;

    /* renamed from: D */
    public boolean f139041D;

    /* renamed from: E */
    public boolean f139042E;

    /* renamed from: F */
    public int f139043F;

    /* renamed from: G */
    public bptm f139044G;

    /* renamed from: H */
    public bptf f139045H;

    /* renamed from: J */
    private byte f139046J = 2;

    /* renamed from: a */
    public int f139047a;

    /* renamed from: b */
    public int f139048b;

    /* renamed from: c */
    public long f139049c;

    /* renamed from: d */
    public int f139050d;

    /* renamed from: e */
    public bptl f139051e;

    /* renamed from: f */
    public bptd f139052f;

    /* renamed from: g */
    public bpsx f139053g;

    /* renamed from: h */
    public String f139054h = "";

    /* renamed from: i */
    public bptk f139055i;

    /* renamed from: j */
    public String f139056j = "";

    /* renamed from: k */
    public bxvt f139057k = bxvm.f164965b;

    /* renamed from: l */
    public bxwc f139058l;

    /* renamed from: m */
    public bxwc f139059m;

    /* renamed from: n */
    public bxwc f139060n;

    /* renamed from: o */
    public int f139061o;

    /* renamed from: p */
    public int f139062p;

    /* renamed from: q */
    public bptc f139063q;

    /* renamed from: r */
    public int f139064r;

    /* renamed from: s */
    public bxwc f139065s;

    /* renamed from: t */
    public bptc f139066t;

    /* renamed from: u */
    public int f139067u;

    /* renamed from: v */
    public int f139068v;

    /* renamed from: w */
    public int f139069w;

    /* renamed from: x */
    public int f139070x;

    /* renamed from: y */
    public bptr f139071y;

    /* renamed from: z */
    public bpth f139072z;

    static {
        bpsz bpsz = new bpsz();
        f139036I = bpsz;
        bxvk.m124024a(bpsz.class, bpsz);
    }

    private bpsz() {
        bxxn bxxn = bxxn.f165040b;
        this.f139058l = bxxn.f165040b;
        this.f139059m = bxxn.f165040b;
        this.f139060n = bxxn.f165040b;
        this.f139065s = bxxn.f165040b;
        this.f139039B = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139046J);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139046J = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139036I, "\u0001 \u0000\u0002\u00023 \u0000\u0006\u0001\u0002ဂ\u0001\u0003ဌ\u0002\u0005ဉ\u0004\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d#ဌ\u0012$ဉ\u0013%ᐉ 'ဉ\"(\u001b)ဌ#-ဇ%.ဇ&/ဌ'1င\u00142ဉ)3ဉ*", new Object[]{"a", "b", "c", "d", bpfl.f137413a, "e", "f", "g", "h", "i", "j", "k", "l", bptg.class, "m", bpta.class, "n", bpto.class, "o", bpfi.m111868b(), "s", bptc.class, "t", "u", bpew.m111850b(), "v", "w", "x", "y", "p", bpfe.m111862b(), "q", "z", "A", "B", bpsw.class, "C", bpff.f137393a, "D", "E", "F", bpeu.f137355a, "r", "G", "H"});
        } else if (i2 == 3) {
            return new bpsz();
        } else {
            if (i2 == 4) {
                return new bpsy();
            }
            if (i2 == 5) {
                return f139036I;
            }
            bxxk bxxk = f139037K;
            if (bxxk == null) {
                synchronized (bpsz.class) {
                    bxxk = f139037K;
                    if (bxxk == null) {
                        bxxk = new bxve(f139036I);
                        f139037K = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68983a() {
        if (!this.f139059m.mo73666a()) {
            this.f139059m = bxvk.m124021a(this.f139059m);
        }
    }
}
