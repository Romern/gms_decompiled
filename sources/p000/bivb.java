package p000;

/* renamed from: bivb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivb extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bivb f121921l;

    /* renamed from: r */
    private static volatile bxxk f121922r;

    /* renamed from: a */
    public int f121923a;

    /* renamed from: b */
    public int f121924b;

    /* renamed from: c */
    public biuy f121925c;

    /* renamed from: d */
    public bisc f121926d;

    /* renamed from: e */
    public birg f121927e;

    /* renamed from: f */
    public bisd f121928f;

    /* renamed from: g */
    public bipg f121929g;

    /* renamed from: h */
    public bitu f121930h;

    /* renamed from: i */
    public bitc f121931i;

    /* renamed from: j */
    public biwd f121932j;

    /* renamed from: k */
    public biwu f121933k;

    /* renamed from: m */
    private bisb f121934m;

    /* renamed from: n */
    private bito f121935n;

    /* renamed from: o */
    private birt f121936o;

    /* renamed from: p */
    private biqo f121937p;

    /* renamed from: q */
    private byte f121938q = 2;

    static {
        bivb bivb = new bivb();
        f121921l = bivb;
        bxvk.m124024a(bivb.class, bivb);
    }

    private bivb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121938q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121938q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121921l, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\t\u0001ᔄ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "m", "n", "o", "j", "p", "k"});
        } else if (i2 == 3) {
            return new bivb();
        } else {
            if (i2 == 4) {
                return new bxvd(f121921l);
            }
            if (i2 == 5) {
                return f121921l;
            }
            bxxk bxxk = f121922r;
            if (bxxk == null) {
                synchronized (bivb.class) {
                    bxxk = f121922r;
                    if (bxxk == null) {
                        bxxk = new bxve(f121921l);
                        f121922r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
