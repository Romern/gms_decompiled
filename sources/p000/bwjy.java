package p000;

/* renamed from: bwjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjy extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bwjy f159900r;

    /* renamed from: u */
    private static volatile bxxk f159901u;

    /* renamed from: a */
    public int f159902a;

    /* renamed from: b */
    public String f159903b = "";

    /* renamed from: c */
    public bmjt f159904c;

    /* renamed from: d */
    public bmnr f159905d;

    /* renamed from: e */
    public bmlz f159906e;

    /* renamed from: f */
    public bmdb f159907f;

    /* renamed from: g */
    public boolean f159908g;

    /* renamed from: h */
    public String f159909h = "";

    /* renamed from: i */
    public String f159910i = "";

    /* renamed from: j */
    public bmfu f159911j;

    /* renamed from: k */
    public bmkl f159912k;

    /* renamed from: l */
    public bxwc f159913l = bxxn.f165040b;

    /* renamed from: m */
    public bmkw f159914m;

    /* renamed from: n */
    public bxwc f159915n = bxxn.f165040b;

    /* renamed from: o */
    public bmjl f159916o;

    /* renamed from: p */
    public boolean f159917p;

    /* renamed from: q */
    public bmdj f159918q;

    /* renamed from: s */
    private bmno f159919s;

    /* renamed from: t */
    private byte f159920t = 2;

    static {
        bwjy bwjy = new bwjy();
        f159900r = bwjy;
        GeneratedMessageLite.m124024a(bwjy.class, bwjy);
    }

    private bwjy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159920t);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159920t = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159900r, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0002\u0005\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဇ\u0006\u0007ဈ\u0007\bဈ\b\tᐉ\t\u000bဉ\n\f\u001b\rᐉ\u000b\u000eЛ\u0011ᐉ\f\u0012ဇ\r\u0013ဉ\u0001\u0017ᐉ\u0010", new Object[]{"a", "b", "s", "d", "e", "f", "g", "h", "i", "j", "k", "l", bwhd.class, "m", "n", bmeb.class, "o", "p", "c", "q"});
        } else if (i2 == 3) {
            return new bwjy();
        } else {
            if (i2 == 4) {
                return new bxvd(f159900r);
            }
            if (i2 == 5) {
                return f159900r;
            }
            bxxk bxxk = f159901u;
            if (bxxk == null) {
                synchronized (bwjy.class) {
                    bxxk = f159901u;
                    if (bxxk == null) {
                        bxxk = new bxve(f159900r);
                        f159901u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
