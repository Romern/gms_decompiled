package p000;

/* renamed from: cios */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cios extends bxvk implements bxxd {

    /* renamed from: s */
    public static final cios f191113s;

    /* renamed from: v */
    private static volatile bxxk f191114v;

    /* renamed from: a */
    public int f191115a;

    /* renamed from: b */
    public cine f191116b;

    /* renamed from: c */
    public long f191117c;

    /* renamed from: d */
    public String f191118d = "";

    /* renamed from: e */
    public ciot f191119e;

    /* renamed from: f */
    public cioe f191120f;

    /* renamed from: g */
    public cinm f191121g;

    /* renamed from: h */
    public ciop f191122h;

    /* renamed from: i */
    public ciom f191123i;

    /* renamed from: j */
    public ciml f191124j;

    /* renamed from: k */
    public cioi f191125k;

    /* renamed from: l */
    public cimz f191126l;

    /* renamed from: m */
    public cinu f191127m;

    /* renamed from: n */
    public String f191128n = "";

    /* renamed from: o */
    public cimw f191129o;

    /* renamed from: p */
    public cioc f191130p;

    /* renamed from: q */
    public ciog f191131q;

    /* renamed from: r */
    public cior f191132r;

    /* renamed from: t */
    private cioj f191133t;

    /* renamed from: u */
    private byte f191134u = 2;

    static {
        cios cios = new cios();
        f191113s = cios;
        bxvk.m124024a(cios.class, cios);
    }

    private cios() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f191134u);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f191134u = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f191113s, "\u0001\u0012\u0000\u0001\u0001\u001c\u0012\u0000\u0000\u0005\u0001ᐉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\bဉ\u0007\tဉ\b\nᐉ\t\fဉ\u000b\rဉ\f\u000eᐉ\r\u0010ᐉ\u000f\u0011ဈ\u0010\u0015ဉ\u0014\u0017ဉ\u0016\u001bဉ\u0012\u001cဉ\u0019", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "t", "l", "m", "n", "p", "q", "o", "r"});
        } else if (i2 == 3) {
            return new cios();
        } else {
            if (i2 == 4) {
                return new bxvd(f191113s);
            }
            if (i2 == 5) {
                return f191113s;
            }
            bxxk bxxk = f191114v;
            if (bxxk == null) {
                synchronized (cios.class) {
                    bxxk = f191114v;
                    if (bxxk == null) {
                        bxxk = new bxve(f191113s);
                        f191114v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
