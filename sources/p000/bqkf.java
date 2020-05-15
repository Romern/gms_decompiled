package p000;

/* renamed from: bqkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqkf f140977e;

    /* renamed from: f */
    private static volatile bxxk f140978f;

    /* renamed from: a */
    public int f140979a;

    /* renamed from: b */
    public String f140980b = "";

    /* renamed from: c */
    public boolean f140981c;

    /* renamed from: d */
    public boolean f140982d;

    static {
        bqkf bqkf = new bqkf();
        f140977e = bqkf;
        bxvk.m124024a(bqkf.class, bqkf);
    }

    private bqkf() {
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
            return bxvk.m124022a(f140977e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f140977e);
            }
            if (i2 == 5) {
                return f140977e;
            }
            bxxk bxxk = f140978f;
            if (bxxk == null) {
                synchronized (bqkf.class) {
                    bxxk = f140978f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140977e);
                        f140978f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
