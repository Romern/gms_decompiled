package p000;

/* renamed from: bvwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bvwb f157885r;

    /* renamed from: s */
    private static volatile bxxk f157886s;

    /* renamed from: a */
    public int f157887a;

    /* renamed from: b */
    public String f157888b = "";

    /* renamed from: c */
    public int f157889c;

    /* renamed from: d */
    public int f157890d;

    /* renamed from: e */
    public String f157891e = "";

    /* renamed from: f */
    public String f157892f = "";

    /* renamed from: g */
    public String f157893g = "";

    /* renamed from: h */
    public String f157894h = "";

    /* renamed from: i */
    public int f157895i;

    /* renamed from: j */
    public String f157896j = "";

    /* renamed from: k */
    public int f157897k;

    /* renamed from: l */
    public String f157898l = "";

    /* renamed from: m */
    public int f157899m;

    /* renamed from: n */
    public int f157900n;

    /* renamed from: o */
    public int f157901o;

    /* renamed from: p */
    public bvvb f157902p;

    /* renamed from: q */
    public int f157903q;

    static {
        bvwb bvwb = new bvwb();
        f157885r = bvwb;
        GeneratedMessageLite.m124024a(bvwb.class, bvwb);
    }

    private bvwb() {
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
            return GeneratedMessageLite.m124022a(f157885r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဌ\u000e\u0007ဈ\u0006\nင\t\u000bဈ\u000b\fဌ\f\rဈ\r\u000eင\u000f\u0010င\u0010\u0011ဉ\u0011\u0012င\u0012\u0013ဌ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "m", bvwa.f157884a, "h", "i", "j", "k", bvvd.f157789a, "l", "n", "o", "p", "q", "c", bvvf.f157791a});
        } else if (i2 == 3) {
            return new bvwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f157885r);
            }
            if (i2 == 5) {
                return f157885r;
            }
            bxxk bxxk = f157886s;
            if (bxxk == null) {
                synchronized (bvwb.class) {
                    bxxk = f157886s;
                    if (bxxk == null) {
                        bxxk = new bxve(f157885r);
                        f157886s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
