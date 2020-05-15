package p000;

/* renamed from: bvxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxc extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bvxc f158036l;

    /* renamed from: m */
    private static volatile bxxk f158037m;

    /* renamed from: a */
    public int f158038a;

    /* renamed from: b */
    public long f158039b;

    /* renamed from: c */
    public long f158040c;

    /* renamed from: d */
    public int f158041d;

    /* renamed from: e */
    public int f158042e;

    /* renamed from: f */
    public long f158043f;

    /* renamed from: g */
    public int f158044g;

    /* renamed from: h */
    public int f158045h;

    /* renamed from: i */
    public bvvx f158046i;

    /* renamed from: j */
    public String f158047j = "";

    /* renamed from: k */
    public boolean f158048k;

    static {
        bvxc bvxc = new bvxc();
        f158036l = bvxc;
        GeneratedMessageLite.m124024a(bvxc.class, bvxc);
    }

    private bvxc() {
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
            return GeneratedMessageLite.m124022a(f158036l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဂ\u0004\u0005ဌ\u0005\u0006ဈ\b\u0007ဌ\u0003\bဌ\u0006\tဇ\t\nဉ\u0007", new Object[]{"a", "b", "c", "d", bvwy.f158034a, "f", "g", bvwy.f158034a, "j", "e", bvxa.f158035a, "h", bvxa.f158035a, "k", "i"});
        } else if (i2 == 3) {
            return new bvxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f158036l);
            }
            if (i2 == 5) {
                return f158036l;
            }
            bxxk bxxk = f158037m;
            if (bxxk == null) {
                synchronized (bvxc.class) {
                    bxxk = f158037m;
                    if (bxxk == null) {
                        bxxk = new bxve(f158036l);
                        f158037m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
