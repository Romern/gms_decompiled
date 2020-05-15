package p000;

/* renamed from: cagn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagn extends bxvg implements bxvh {

    /* renamed from: q */
    public static final cagn f174467q;

    /* renamed from: s */
    private static volatile bxxk f174468s;

    /* renamed from: a */
    public int f174469a;

    /* renamed from: b */
    public long f174470b;

    /* renamed from: c */
    public long f174471c;

    /* renamed from: d */
    public cagb f174472d;

    /* renamed from: e */
    public int f174473e = -1;

    /* renamed from: f */
    public String f174474f = "";

    /* renamed from: g */
    public String f174475g = "";

    /* renamed from: h */
    public bxwc f174476h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f174477i = bxxn.f165040b;

    /* renamed from: j */
    public int f174478j;

    /* renamed from: k */
    public int f174479k;

    /* renamed from: l */
    public cage f174480l;

    /* renamed from: n */
    public cagf f174481n;

    /* renamed from: o */
    public cagc f174482o;

    /* renamed from: p */
    public int f174483p;

    /* renamed from: r */
    private byte f174484r = 2;

    static {
        cagn cagn = new cagn();
        f174467q = cagn;
        bxvk.m124024a(cagn.class, cagn);
    }

    private cagn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174484r);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174484r = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f174467q, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0002\u0002\u0001ᐉ\u0002\u0002ဌ\u0003\u0003Л\u0004ဂ\u0000\u0005\u001c\u0006ဈ\u0004\u0007ဈ\u0005\bဂ\u0001\tဌ\u0007\nဌ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u0010ဋ\f", new Object[]{"a", "d", "e", cagl.m126607b(), "h", cagi.class, "b", "i", "f", "g", "c", "j", cagz.m126623b(), "k", cagm.f174466a, "l", "n", "o", "p"});
        } else if (i2 == 3) {
            return new cagn();
        } else {
            if (i2 == 4) {
                return new bxvf(f174467q);
            }
            if (i2 == 5) {
                return f174467q;
            }
            bxxk bxxk = f174468s;
            if (bxxk == null) {
                synchronized (cagn.class) {
                    bxxk = f174468s;
                    if (bxxk == null) {
                        bxxk = new bxve(f174467q);
                        f174468s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
