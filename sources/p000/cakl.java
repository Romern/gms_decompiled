package p000;

/* renamed from: cakl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakl extends bxvk implements bxxd {

    /* renamed from: l */
    public static final cakl f175006l;

    /* renamed from: m */
    private static volatile bxxk f175007m;

    /* renamed from: a */
    public int f175008a;

    /* renamed from: b */
    public long f175009b;

    /* renamed from: c */
    public int f175010c;

    /* renamed from: d */
    public int f175011d;

    /* renamed from: e */
    public String f175012e = "";

    /* renamed from: f */
    public caju f175013f;

    /* renamed from: g */
    public int f175014g;

    /* renamed from: h */
    public int f175015h;

    /* renamed from: i */
    public int f175016i;

    /* renamed from: j */
    public String f175017j = "";

    /* renamed from: k */
    public boolean f175018k;

    static {
        cakl cakl = new cakl();
        f175006l = cakl;
        bxvk.m124024a(cakl.class, cakl);
    }

    private cakl() {
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
            return bxvk.m124022a(f175006l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0004ဈ\u0004\u0005ဉ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\bင\u0002\tင\b\nဈ\t\fဇ\u000b", new Object[]{"a", "b", "c", "e", "f", "g", cakk.m126725b(), "h", cakk.m126725b(), "d", "i", "j", "k"});
        } else if (i2 == 3) {
            return new cakl();
        } else {
            if (i2 == 4) {
                return new bxvd(f175006l);
            }
            if (i2 == 5) {
                return f175006l;
            }
            bxxk bxxk = f175007m;
            if (bxxk == null) {
                synchronized (cakl.class) {
                    bxxk = f175007m;
                    if (bxxk == null) {
                        bxxk = new bxve(f175006l);
                        f175007m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
