package p000;

/* renamed from: auff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auff extends GeneratedMessageLite implements bxxd {

    /* renamed from: C */
    public static final auff f91640C;

    /* renamed from: H */
    private static volatile bxxk f91641H;

    /* renamed from: A */
    public bxwc f91642A = bxxn.f165040b;

    /* renamed from: B */
    public bxwc f91643B = bxxn.f165040b;

    /* renamed from: D */
    private int f91644D = 100;

    /* renamed from: E */
    private bxyk f91645E;

    /* renamed from: F */
    private boolean f91646F;

    /* renamed from: G */
    private byte f91647G = 2;

    /* renamed from: a */
    public int f91648a;

    /* renamed from: b */
    public String f91649b = "";

    /* renamed from: c */
    public int f91650c;

    /* renamed from: d */
    public bxwc f91651d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f91652e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f91653f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f91654g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f91655h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f91656i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f91657j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f91658k = bxxn.f165040b;

    /* renamed from: l */
    public aufh f91659l;

    /* renamed from: m */
    public float f91660m = 0.6826895f;

    /* renamed from: n */
    public boolean f91661n;

    /* renamed from: o */
    public boolean f91662o;

    /* renamed from: p */
    public bxvw f91663p = bxwq.f165002b;

    /* renamed from: q */
    public long f91664q;

    /* renamed from: r */
    public bxwc f91665r = bxxn.f165040b;

    /* renamed from: s */
    public aufe f91666s;

    /* renamed from: t */
    public aufl f91667t;

    /* renamed from: u */
    public bxwc f91668u = bxxn.f165040b;

    /* renamed from: v */
    public bxwc f91669v = bxxn.f165040b;

    /* renamed from: w */
    public bxwc f91670w = bxxn.f165040b;

    /* renamed from: x */
    public bxwc f91671x = bxxn.f165040b;

    /* renamed from: y */
    public bxwc f91672y = bxxn.f165040b;

    /* renamed from: z */
    public bxwc f91673z = bxxn.f165040b;

    static {
        auff auff = new auff();
        f91640C = auff;
        GeneratedMessageLite.m124024a(auff.class, auff);
    }

    private auff() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f91647G);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f91647G = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f91640C, "\u0001\u001e\u0000\u0001\u0001\u001e\u001e\u0000\u0012\u0002\u0001ဈ\u0000\u0002င\t\u0003င\u0001\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\t\u001a\n\u001a\u000b\u001a\f\u001a\r\u001a\u000e\u001a\u000fဇ\u0005\u0010%\u0011ဂ\u0006\u0012\u001b\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017\u001a\u0018ᐉ\u0002\u0019ဇ\u000b\u001aᐉ\b\u001bဉ\n\u001cဉ\u0007\u001dခ\u0003\u001eဇ\u0004", new Object[]{"a", "b", "D", "c", "d", "u", "v", "w", "x", "y", "z", "A", "B", "j", "k", "o", "p", "q", "r", aufk.class, "e", "f", "g", "h", "i", "l", "F", "t", "E", "s", "m", "n"});
        } else if (i2 == 3) {
            return new auff();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f91640C;
            }
            bxxk bxxk = f91641H;
            if (bxxk == null) {
                synchronized (auff.class) {
                    bxxk = f91641H;
                    if (bxxk == null) {
                        bxxk = new bxve(f91640C);
                        f91641H = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
