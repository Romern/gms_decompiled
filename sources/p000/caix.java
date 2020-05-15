package p000;

/* renamed from: caix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caix extends bxvk implements bxxd {

    /* renamed from: l */
    public static final caix f174776l;

    /* renamed from: m */
    private static volatile bxxk f174777m;

    /* renamed from: a */
    public int f174778a;

    /* renamed from: b */
    public int f174779b;

    /* renamed from: c */
    public cajj f174780c;

    /* renamed from: d */
    public caje f174781d;

    /* renamed from: e */
    public cajf f174782e;

    /* renamed from: f */
    public caiu f174783f;

    /* renamed from: g */
    public caja f174784g;

    /* renamed from: h */
    public cais f174785h;

    /* renamed from: i */
    public cajh f174786i;

    /* renamed from: j */
    public cajc f174787j;

    /* renamed from: k */
    public cajn f174788k;

    static {
        caix caix = new caix();
        f174776l = caix;
        bxvk.m124024a(caix.class, caix);
    }

    private caix() {
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
            return bxvk.m124022a(f174776l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e", new Object[]{"a", "b", caiv.f174775a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new caix();
        } else {
            if (i2 == 4) {
                return new bxvd(f174776l);
            }
            if (i2 == 5) {
                return f174776l;
            }
            bxxk bxxk = f174777m;
            if (bxxk == null) {
                synchronized (caix.class) {
                    bxxk = f174777m;
                    if (bxxk == null) {
                        bxxk = new bxve(f174776l);
                        f174777m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
