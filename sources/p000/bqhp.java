package p000;

/* renamed from: bqhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhp extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final bqhp f140683q;

    /* renamed from: r */
    private static volatile bxxk f140684r;

    /* renamed from: a */
    public int f140685a;

    /* renamed from: b */
    public bqhu f140686b;

    /* renamed from: c */
    public String f140687c = "";

    /* renamed from: d */
    public bqhu f140688d;

    /* renamed from: e */
    public int f140689e;

    /* renamed from: f */
    public String f140690f = "";

    /* renamed from: g */
    public int f140691g;

    /* renamed from: h */
    public int f140692h;

    /* renamed from: i */
    public int f140693i;

    /* renamed from: j */
    public bqht f140694j;

    /* renamed from: k */
    public int f140695k;

    /* renamed from: l */
    public bqhs f140696l;

    /* renamed from: m */
    public int f140697m;

    /* renamed from: n */
    public bqhr f140698n;

    /* renamed from: o */
    public bqhq f140699o;

    /* renamed from: p */
    public String f140700p = "";

    static {
        bqhp bqhp = new bqhp();
        f140683q = bqhp;
        GeneratedMessageLite.m124024a(bqhp.class, bqhp);
    }

    private bqhp() {
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
            return GeneratedMessageLite.m124022a(f140683q, "\u0000\u0010\u0000\u0000\u0001\u0011\u0010\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ\u0004\t\u0005\f\u0006Ȉ\u0007\f\b\u0004\t\f\n\t\u000b\u0004\f\t\r\f\u000e\t\u0010\t\u0011Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bqhp();
        } else {
            if (i2 == 4) {
                return new bxvd(f140683q);
            }
            if (i2 == 5) {
                return f140683q;
            }
            bxxk bxxk = f140684r;
            if (bxxk == null) {
                synchronized (bqhp.class) {
                    bxxk = f140684r;
                    if (bxxk == null) {
                        bxxk = new bxve(f140683q);
                        f140684r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
