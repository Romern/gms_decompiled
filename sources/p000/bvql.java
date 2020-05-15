package p000;

/* renamed from: bvql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvql extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bvql f157381l;

    /* renamed from: m */
    private static volatile bxxk f157382m;

    /* renamed from: a */
    public int f157383a;

    /* renamed from: b */
    public boolean f157384b;

    /* renamed from: c */
    public boolean f157385c;

    /* renamed from: d */
    public boolean f157386d;

    /* renamed from: e */
    public boolean f157387e;

    /* renamed from: f */
    public boolean f157388f;

    /* renamed from: g */
    public int f157389g;

    /* renamed from: h */
    public boolean f157390h;

    /* renamed from: i */
    public int f157391i;

    /* renamed from: j */
    public boolean f157392j;

    /* renamed from: k */
    public boolean f157393k;

    static {
        bvql bvql = new bvql();
        f157381l = bvql;
        bxvk.m124024a(bvql.class, bvql);
    }

    private bvql() {
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
            return bxvk.m124022a(f157381l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bဌ\u0007\tဇ\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bvzf.m121619b(), "j", "k"});
        } else if (i2 == 3) {
            return new bvql();
        } else {
            if (i2 == 4) {
                return new bxvd(f157381l);
            }
            if (i2 == 5) {
                return f157381l;
            }
            bxxk bxxk = f157382m;
            if (bxxk == null) {
                synchronized (bvql.class) {
                    bxxk = f157382m;
                    if (bxxk == null) {
                        bxxk = new bxve(f157381l);
                        f157382m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
