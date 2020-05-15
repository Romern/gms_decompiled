package p000;

/* renamed from: bpat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpat extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpat f135536c;

    /* renamed from: d */
    private static volatile bxxk f135537d;

    /* renamed from: a */
    public int f135538a;

    /* renamed from: b */
    public boolean f135539b;

    static {
        bpat bpat = new bpat();
        f135536c = bpat;
        bxvk.m124024a(bpat.class, bpat);
    }

    private bpat() {
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
            return bxvk.m124022a(f135536c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpat();
        } else {
            if (i2 == 4) {
                return new bxvd(f135536c);
            }
            if (i2 == 5) {
                return f135536c;
            }
            bxxk bxxk = f135537d;
            if (bxxk == null) {
                synchronized (bpat.class) {
                    bxxk = f135537d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135536c);
                        f135537d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
