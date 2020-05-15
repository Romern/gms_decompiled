package p000;

/* renamed from: abul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abul extends bxvk implements bxxd {

    /* renamed from: n */
    public static final abul f58412n;

    /* renamed from: o */
    private static volatile bxxk f58413o;

    /* renamed from: a */
    public int f58414a;

    /* renamed from: b */
    public String f58415b = "";

    /* renamed from: c */
    public boolean f58416c;

    /* renamed from: d */
    public abtd f58417d;

    /* renamed from: e */
    public int f58418e;

    /* renamed from: f */
    public String f58419f = "";

    /* renamed from: g */
    public boolean f58420g;

    /* renamed from: h */
    public long f58421h;

    /* renamed from: i */
    public int f58422i;

    /* renamed from: j */
    public int f58423j;

    /* renamed from: k */
    public String f58424k = "";

    /* renamed from: l */
    public boolean f58425l;

    /* renamed from: m */
    public long f58426m;

    static {
        abul abul = new abul();
        f58412n = abul;
        bxvk.m124024a(abul.class, abul);
    }

    private abul() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m48284a(abul abul) {
        abul.f58414a |= 2;
        abul.f58416c = true;
    }

    /* renamed from: b */
    public static /* synthetic */ void m48285b(abul abul) {
        abul.f58414a |= 32;
        abul.f58420g = true;
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
            return bxvk.m124022a(f58412n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဌ\u0007\tင\b\nဈ\t\u000bဇ\n\fဂ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", abtf.m48247b(), "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new abul();
        } else {
            if (i2 == 4) {
                return new bxvd(f58412n);
            }
            if (i2 == 5) {
                return f58412n;
            }
            bxxk bxxk = f58413o;
            if (bxxk == null) {
                synchronized (abul.class) {
                    bxxk = f58413o;
                    if (bxxk == null) {
                        bxxk = new bxve(f58412n);
                        f58413o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
