package p000;

/* renamed from: bpqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final bpqf f138708q;

    /* renamed from: r */
    private static volatile bxxk f138709r;

    /* renamed from: a */
    public int f138710a;

    /* renamed from: b */
    public int f138711b;

    /* renamed from: c */
    public int f138712c = 1;

    /* renamed from: d */
    public boolean f138713d;

    /* renamed from: e */
    public boolean f138714e;

    /* renamed from: f */
    public boolean f138715f;

    /* renamed from: g */
    public int f138716g;

    /* renamed from: h */
    public int f138717h;

    /* renamed from: i */
    public int f138718i;

    /* renamed from: j */
    public int f138719j;

    /* renamed from: k */
    public int f138720k;

    /* renamed from: l */
    public int f138721l;

    /* renamed from: m */
    public int f138722m;

    /* renamed from: n */
    public boolean f138723n;

    /* renamed from: o */
    public int f138724o;

    /* renamed from: p */
    public int f138725p;

    static {
        bpqf bpqf = new bpqf();
        f138708q = bpqf;
        GeneratedMessageLite.m124024a(bpqf.class, bpqf);
    }

    private bpqf() {
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
            return GeneratedMessageLite.m124022a(f138708q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e", new Object[]{"a", "b", bpqe.m112172b(), "c", bpqb.f138695a, "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "j", "p"});
        } else if (i2 == 3) {
            return new bpqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f138708q);
            }
            if (i2 == 5) {
                return f138708q;
            }
            bxxk bxxk = f138709r;
            if (bxxk == null) {
                synchronized (bpqf.class) {
                    bxxk = f138709r;
                    if (bxxk == null) {
                        bxxk = new bxve(f138708q);
                        f138709r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
