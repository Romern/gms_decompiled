package p000;

/* renamed from: bpbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpbu f135624e;

    /* renamed from: f */
    private static volatile bxxk f135625f;

    /* renamed from: a */
    public int f135626a;

    /* renamed from: b */
    public bpbr f135627b;

    /* renamed from: c */
    public bpbj f135628c;

    /* renamed from: d */
    public bpbq f135629d;

    static {
        bpbu bpbu = new bpbu();
        f135624e = bpbu;
        bxvk.m124024a(bpbu.class, bpbu);
    }

    private bpbu() {
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
            return bxvk.m124022a(f135624e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f135624e);
            }
            if (i2 == 5) {
                return f135624e;
            }
            bxxk bxxk = f135625f;
            if (bxxk == null) {
                synchronized (bpbu.class) {
                    bxxk = f135625f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135624e);
                        f135625f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
