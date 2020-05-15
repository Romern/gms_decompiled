package p000;

/* renamed from: bvue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvue extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bvue f157659q;

    /* renamed from: r */
    private static volatile bxxk f157660r;

    /* renamed from: a */
    public int f157661a;

    /* renamed from: b */
    public String f157662b = "";

    /* renamed from: c */
    public bxwc f157663c = bxxn.f165040b;

    /* renamed from: d */
    public String f157664d = "";

    /* renamed from: e */
    public String f157665e = "";

    /* renamed from: f */
    public String f157666f = "";

    /* renamed from: g */
    public String f157667g = "";

    /* renamed from: h */
    public bxwc f157668h = bxxn.f165040b;

    /* renamed from: i */
    public bvuf f157669i;

    /* renamed from: j */
    public String f157670j = "";

    /* renamed from: k */
    public boolean f157671k;

    /* renamed from: l */
    public float f157672l;

    /* renamed from: m */
    public int f157673m;

    /* renamed from: n */
    public String f157674n = "";

    /* renamed from: o */
    public bvum f157675o;

    /* renamed from: p */
    public String f157676p = "";

    static {
        bvue bvue = new bvue();
        f157659q = bvue;
        bxvk.m124024a(bvue.class, bvue);
    }

    private bvue() {
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
            return bxvk.m124022a(f157659q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0007ဈ\u0004\b\u001a\tဉ\u0005\nဈ\u0006\u000bဇ\u0007\fခ\b\rင\t\u000fဈ\u000b\u0010ဉ\f\u0011ဈ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bvue();
        } else {
            if (i2 == 4) {
                return new bxvd(f157659q);
            }
            if (i2 == 5) {
                return f157659q;
            }
            bxxk bxxk = f157660r;
            if (bxxk == null) {
                synchronized (bvue.class) {
                    bxxk = f157660r;
                    if (bxxk == null) {
                        bxxk = new bxve(f157659q);
                        f157660r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
