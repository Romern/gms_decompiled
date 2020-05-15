package p000;

/* renamed from: bptj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bptj f139124h;

    /* renamed from: i */
    private static volatile bxxk f139125i;

    /* renamed from: a */
    public int f139126a;

    /* renamed from: b */
    public int f139127b;

    /* renamed from: c */
    public int f139128c;

    /* renamed from: d */
    public boolean f139129d;

    /* renamed from: e */
    public boolean f139130e;

    /* renamed from: f */
    public int f139131f;

    /* renamed from: g */
    public int f139132g;

    static {
        bptj bptj = new bptj();
        f139124h = bptj;
        bxvk.m124024a(bptj.class, bptj);
    }

    private bptj() {
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
            return bxvk.m124022a(f139124h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"a", "b", "c", bpfb.f137373a, "d", "e", "f", bpeo.f137305a, "g"});
        } else if (i2 == 3) {
            return new bptj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139124h);
            }
            if (i2 == 5) {
                return f139124h;
            }
            bxxk bxxk = f139125i;
            if (bxxk == null) {
                synchronized (bptj.class) {
                    bxxk = f139125i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139124h);
                        f139125i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
