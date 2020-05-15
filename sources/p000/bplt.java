package p000;

/* renamed from: bplt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplt extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bplt f138150p;

    /* renamed from: q */
    private static volatile bxxk f138151q;

    /* renamed from: a */
    public int f138152a;

    /* renamed from: b */
    public long f138153b;

    /* renamed from: c */
    public boolean f138154c;

    /* renamed from: d */
    public boolean f138155d;

    /* renamed from: e */
    public long f138156e;

    /* renamed from: f */
    public long f138157f;

    /* renamed from: g */
    public long f138158g;

    /* renamed from: h */
    public long f138159h;

    /* renamed from: i */
    public boolean f138160i;

    /* renamed from: j */
    public int f138161j;

    /* renamed from: k */
    public long f138162k;

    /* renamed from: l */
    public int f138163l;

    /* renamed from: m */
    public int f138164m;

    /* renamed from: n */
    public int f138165n;

    /* renamed from: o */
    public int f138166o;

    static {
        bplt bplt = new bplt();
        f138150p = bplt;
        bxvk.m124024a(bplt.class, bplt);
    }

    private bplt() {
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
            return bxvk.m124022a(f138150p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001စ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\tဂ\b\nဇ\t\u000bင\n\fဂ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bplt();
        } else {
            if (i2 == 4) {
                return new bxvd(f138150p);
            }
            if (i2 == 5) {
                return f138150p;
            }
            bxxk bxxk = f138151q;
            if (bxxk == null) {
                synchronized (bplt.class) {
                    bxxk = f138151q;
                    if (bxxk == null) {
                        bxxk = new bxve(f138150p);
                        f138151q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
