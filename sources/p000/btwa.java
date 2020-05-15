package p000;

/* renamed from: btwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwa extends bxvk implements bxxd {

    /* renamed from: m */
    public static final btwa f152669m;

    /* renamed from: n */
    private static volatile bxxk f152670n;

    /* renamed from: a */
    public btwm f152671a;

    /* renamed from: b */
    public btwm f152672b;

    /* renamed from: c */
    public btwi f152673c;

    /* renamed from: d */
    public btwe f152674d;

    /* renamed from: e */
    public btvq f152675e;

    /* renamed from: f */
    public btvu f152676f;

    /* renamed from: g */
    public btvv f152677g;

    /* renamed from: h */
    public btwh f152678h;

    /* renamed from: i */
    public btvs f152679i;

    /* renamed from: j */
    public btwk f152680j;

    /* renamed from: k */
    public btwi f152681k;

    /* renamed from: l */
    public btvw f152682l;

    static {
        btwa btwa = new btwa();
        f152669m = btwa;
        bxvk.m124024a(btwa.class, btwa);
    }

    private btwa() {
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
            return bxvk.m124022a(f152669m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new btwa();
        } else {
            if (i2 == 4) {
                return new bxvd(f152669m);
            }
            if (i2 == 5) {
                return f152669m;
            }
            bxxk bxxk = f152670n;
            if (bxxk == null) {
                synchronized (btwa.class) {
                    bxxk = f152670n;
                    if (bxxk == null) {
                        bxxk = new bxve(f152669m);
                        f152670n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
