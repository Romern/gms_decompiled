package p000;

/* renamed from: bkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkf f4957d;

    /* renamed from: f */
    private static volatile bxxk f4958f;

    /* renamed from: a */
    public int f4959a = 0;

    /* renamed from: b */
    public Object f4960b;

    /* renamed from: c */
    public long f4961c;

    /* renamed from: e */
    private int f4962e;

    static {
        bkf bkf = new bkf();
        f4957d = bkf;
        bxvk.m124024a(bkf.class, bkf);
    }

    private bkf() {
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
            return bxvk.m124022a(f4957d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", "c", bkv.class, bke.class});
        } else if (i2 == 3) {
            return new bkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f4957d);
            }
            if (i2 == 5) {
                return f4957d;
            }
            bxxk bxxk = f4958f;
            if (bxxk == null) {
                synchronized (bkf.class) {
                    bxxk = f4958f;
                    if (bxxk == null) {
                        bxxk = new bxve(f4957d);
                        f4958f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
