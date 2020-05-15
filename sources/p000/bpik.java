package p000;

/* renamed from: bpik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpik extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bpik f137757s;

    /* renamed from: t */
    private static volatile bxxk f137758t;

    /* renamed from: a */
    public int f137759a;

    /* renamed from: b */
    public bpje f137760b;

    /* renamed from: c */
    public bphn f137761c;

    /* renamed from: d */
    public bpjk f137762d;

    /* renamed from: e */
    public bpjo f137763e;

    /* renamed from: f */
    public bpjl f137764f;

    /* renamed from: g */
    public bpjh f137765g;

    /* renamed from: h */
    public bphe f137766h;

    /* renamed from: i */
    public bpjw f137767i;

    /* renamed from: j */
    public bpif f137768j;

    /* renamed from: k */
    public bpht f137769k;

    /* renamed from: l */
    public bpic f137770l;

    /* renamed from: m */
    public bpih f137771m;

    /* renamed from: n */
    public bpig f137772n;

    /* renamed from: o */
    public bphk f137773o;

    /* renamed from: p */
    public bpjd f137774p;

    /* renamed from: q */
    public bpiw f137775q;

    /* renamed from: r */
    public bpid f137776r;

    static {
        bpik bpik = new bpik();
        f137757s = bpik;
        bxvk.m124024a(bpik.class, bpik);
    }

    private bpik() {
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
            return bxvk.m124022a(f137757s, "\u0001\u0011\u0000\u0001\u0001 \u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\nဉ\u0002\u000bဉ\u0004\rဉ\u0005\u0014ဉ\u0003\u0015ဉ\u0006\u0016ဉ\u0007\u0018ဉ\b\u0019ဉ\t\u001aဉ\n\u001bဉ\u000b\u001cဉ\f\u001dဉ\r\u001eဉ\u000e\u001fဉ\u000f ဉ\u0010", new Object[]{"a", "b", "c", "d", "f", "g", "e", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new bpik();
        } else {
            if (i2 == 4) {
                return new bxvd(f137757s);
            }
            if (i2 == 5) {
                return f137757s;
            }
            bxxk bxxk = f137758t;
            if (bxxk == null) {
                synchronized (bpik.class) {
                    bxxk = f137758t;
                    if (bxxk == null) {
                        bxxk = new bxve(f137757s);
                        f137758t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
