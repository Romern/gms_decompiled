package p000;

/* renamed from: bpxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpxj f139719d;

    /* renamed from: e */
    private static volatile bxxk f139720e;

    /* renamed from: a */
    public int f139721a;

    /* renamed from: b */
    public String f139722b = "";

    /* renamed from: c */
    public String f139723c = "";

    static {
        bpxj bpxj = new bpxj();
        f139719d = bpxj;
        bxvk.m124024a(bpxj.class, bpxj);
    }

    private bpxj() {
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
            return bxvk.m124022a(f139719d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139719d);
            }
            if (i2 == 5) {
                return f139719d;
            }
            bxxk bxxk = f139720e;
            if (bxxk == null) {
                synchronized (bpxj.class) {
                    bxxk = f139720e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139719d);
                        f139720e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
