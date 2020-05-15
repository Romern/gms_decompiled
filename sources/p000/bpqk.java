package p000;

/* renamed from: bpqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: w */
    public static final bpqk f138732w;

    /* renamed from: y */
    private static volatile bxxk f138733y;

    /* renamed from: a */
    public int f138734a;

    /* renamed from: b */
    public int f138735b;

    /* renamed from: c */
    public int f138736c = 1;

    /* renamed from: d */
    public bpkf f138737d;

    /* renamed from: e */
    public bplh f138738e;

    /* renamed from: f */
    public int f138739f;

    /* renamed from: g */
    public float f138740g;

    /* renamed from: h */
    public bxwc f138741h = bxxn.f165040b;

    /* renamed from: i */
    public bprg f138742i;

    /* renamed from: j */
    public bppr f138743j;

    /* renamed from: k */
    public bppw f138744k;

    /* renamed from: l */
    public bprb f138745l;

    /* renamed from: m */
    public bpqs f138746m;

    /* renamed from: n */
    public bpqy f138747n;

    /* renamed from: o */
    public bpqv f138748o;

    /* renamed from: p */
    public bprd f138749p;

    /* renamed from: q */
    public bpqf f138750q;

    /* renamed from: r */
    public bpql f138751r;

    /* renamed from: s */
    public bppy f138752s;

    /* renamed from: t */
    public bppg f138753t;

    /* renamed from: u */
    public bprw f138754u;

    /* renamed from: v */
    public bppp f138755v;

    /* renamed from: x */
    private byte f138756x = 2;

    static {
        bpqk bpqk = new bpqk();
        f138732w = bpqk;
        GeneratedMessageLite.m124024a(bpqk.class, bpqk);
    }

    private bpqk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138756x);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138756x = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138732w, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0001\u0003\u0001ဌ\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0007ဉ\u0007\bᐉ\b\tဌ\u0004\nခ\u0005\fဉ\t\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014", new Object[]{"a", "c", bpqi.f138731a, "d", "e", "h", bprz.class, "i", "j", "k", "f", bpqh.f138730a, "g", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "b", "u"});
        } else if (i2 == 3) {
            return new bpqk();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138732w;
            }
            bxxk bxxk = f138733y;
            if (bxxk == null) {
                synchronized (bpqk.class) {
                    bxxk = f138733y;
                    if (bxxk == null) {
                        bxxk = new bxve(f138732w);
                        f138733y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
