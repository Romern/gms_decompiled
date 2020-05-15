package p000;

/* renamed from: bwgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwgi f159203e;

    /* renamed from: f */
    private static volatile bxxk f159204f;

    /* renamed from: a */
    public int f159205a;

    /* renamed from: b */
    public bxwc f159206b = bxxn.f165040b;

    /* renamed from: c */
    public bxtx f159207c = bxtx.f164797b;

    /* renamed from: d */
    public bwiv f159208d;

    static {
        bwgi bwgi = new bwgi();
        f159203e = bwgi;
        bxvk.m124024a(bwgi.class, bwgi);
    }

    private bwgi() {
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
            return bxvk.m124022a(f159203e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000\u0004ဉ\u0001", new Object[]{"a", "b", bmnr.class, "c", "d"});
        } else if (i2 == 3) {
            return new bwgi();
        } else {
            if (i2 == 4) {
                return new bxvd(f159203e);
            }
            if (i2 == 5) {
                return f159203e;
            }
            bxxk bxxk = f159204f;
            if (bxxk == null) {
                synchronized (bwgi.class) {
                    bxxk = f159204f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159203e);
                        f159204f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
