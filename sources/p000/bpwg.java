package p000;

/* renamed from: bpwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwg extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bpwg f139467r;

    /* renamed from: s */
    private static volatile bxxk f139468s;

    /* renamed from: a */
    public int f139469a;

    /* renamed from: b */
    public boolean f139470b;

    /* renamed from: c */
    public int f139471c;

    /* renamed from: d */
    public boolean f139472d;

    /* renamed from: e */
    public boolean f139473e;

    /* renamed from: f */
    public int f139474f;

    /* renamed from: g */
    public int f139475g;

    /* renamed from: h */
    public int f139476h;

    /* renamed from: i */
    public int f139477i;

    /* renamed from: j */
    public int f139478j;

    /* renamed from: k */
    public int f139479k;

    /* renamed from: l */
    public int f139480l;

    /* renamed from: m */
    public int f139481m;

    /* renamed from: n */
    public int f139482n;

    /* renamed from: o */
    public boolean f139483o;

    /* renamed from: p */
    public boolean f139484p;

    /* renamed from: q */
    public boolean f139485q;

    static {
        bpwg bpwg = new bpwg();
        f139467r = bpwg;
        GeneratedMessageLite.m124024a(bpwg.class, bpwg);
    }

    private bpwg() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f139467r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0004\u0005င\u0005\u0006င\u0007\u0007င\u000b\bဇ\u000e\nင\t\u000bဇ\r\fင\n\rင\u0006\u000eင\b\u000fဇ\u0003\u0010င\f\u0011ဇ\u000f", new Object[]{"a", "b", "c", bpwe.f139466a, "d", "f", "g", "i", "m", "p", "k", "o", "l", "h", "j", "e", "n", "q"});
        } else if (i2 == 3) {
            return new bpwg();
        } else {
            if (i2 == 4) {
                return new bxvd(f139467r);
            }
            if (i2 == 5) {
                return f139467r;
            }
            bxxk bxxk = f139468s;
            if (bxxk == null) {
                synchronized (bpwg.class) {
                    bxxk = f139468s;
                    if (bxxk == null) {
                        bxxk = new bxve(f139467r);
                        f139468s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
