package p000;

/* renamed from: bwmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmg extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bwmg f160254n;

    /* renamed from: p */
    private static volatile bxxk f160255p;

    /* renamed from: a */
    public int f160256a;

    /* renamed from: b */
    public int f160257b = 0;

    /* renamed from: c */
    public Object f160258c;

    /* renamed from: d */
    public bwmj f160259d;

    /* renamed from: e */
    public String f160260e = "";

    /* renamed from: f */
    public int f160261f;

    /* renamed from: g */
    public long f160262g;

    /* renamed from: h */
    public long f160263h;

    /* renamed from: i */
    public long f160264i;

    /* renamed from: j */
    public boolean f160265j;

    /* renamed from: k */
    public int f160266k;

    /* renamed from: l */
    public int f160267l;

    /* renamed from: m */
    public bwme f160268m;

    /* renamed from: o */
    private byte f160269o = 2;

    static {
        bwmg bwmg = new bwmg();
        f160254n = bwmg;
        GeneratedMessageLite.m124024a(bwmg.class, bwmg);
    }

    private bwmg() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160269o);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160269o = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160254n, "\u0001\r\u0001\u0001\u0002\u001a\r\u0000\u0000\u0002\u0002ᐉ\u0000\u0004ᐼ\u0000\u0007ဈ\u0004\bဌ\u0005\tဂ\u0006\nြ\u0000\u000bဂ\u0007\rဇ\t\u0014ြ\u0000\u0015ဉ\u000e\u0016ဂ\b\u0019င\u000b\u001aင\f", new Object[]{"c", "b", "a", "d", bwmb.class, "e", "f", bwmf.f160253a, "g", bwma.class, "h", "j", bwlm.class, "m", "i", "k", "l"});
        } else if (i2 == 3) {
            return new bwmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f160254n);
            }
            if (i2 == 5) {
                return f160254n;
            }
            bxxk bxxk = f160255p;
            if (bxxk == null) {
                synchronized (bwmg.class) {
                    bxxk = f160255p;
                    if (bxxk == null) {
                        bxxk = new bxve(f160254n);
                        f160255p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
