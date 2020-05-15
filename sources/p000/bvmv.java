package p000;

/* renamed from: bvmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmv extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final bvmv f156798q;

    /* renamed from: r */
    private static volatile bxxk f156799r;

    /* renamed from: a */
    public int f156800a;

    /* renamed from: b */
    public String f156801b = "";

    /* renamed from: c */
    public bxwc f156802c = bxxn.f165040b;

    /* renamed from: d */
    public String f156803d = "";

    /* renamed from: e */
    public String f156804e = "";

    /* renamed from: f */
    public String f156805f = "";

    /* renamed from: g */
    public String f156806g = "";

    /* renamed from: h */
    public bxwc f156807h = bxxn.f165040b;

    /* renamed from: i */
    public bvmx f156808i;

    /* renamed from: j */
    public String f156809j = "";

    /* renamed from: k */
    public boolean f156810k;

    /* renamed from: l */
    public float f156811l;

    /* renamed from: m */
    public int f156812m;

    /* renamed from: n */
    public String f156813n = "";

    /* renamed from: o */
    public bvoh f156814o;

    /* renamed from: p */
    public String f156815p = "";

    static {
        bvmv bvmv = new bvmv();
        f156798q = bvmv;
        GeneratedMessageLite.m124024a(bvmv.class, bvmv);
    }

    private bvmv() {
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
            return GeneratedMessageLite.m124022a(f156798q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0007ဈ\u0004\b\u001a\tဉ\u0005\nဈ\u0006\u000bဇ\u0007\fခ\b\rင\t\u000fဈ\u000b\u0010ဉ\f\u0011ဈ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bvmv();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156798q;
            }
            bxxk bxxk = f156799r;
            if (bxxk == null) {
                synchronized (bvmv.class) {
                    bxxk = f156799r;
                    if (bxxk == null) {
                        bxxk = new bxve(f156798q);
                        f156799r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
