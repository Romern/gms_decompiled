package p000;

/* renamed from: bvtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvtv f157621d;

    /* renamed from: e */
    private static volatile bxxk f157622e;

    /* renamed from: a */
    public int f157623a;

    /* renamed from: b */
    public String f157624b = "";

    /* renamed from: c */
    public bxvt f157625c = bxvm.f164965b;

    static {
        bvtv bvtv = new bvtv();
        f157621d = bvtv;
        bxvk.m124024a(bvtv.class, bvtv);
    }

    private bvtv() {
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
            return bxvk.m124022a(f157621d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"a", "b", "c", bvuc.m121469b()});
        } else if (i2 == 3) {
            return new bvtv();
        } else {
            if (i2 == 4) {
                return new bvtu();
            }
            if (i2 == 5) {
                return f157621d;
            }
            bxxk bxxk = f157622e;
            if (bxxk == null) {
                synchronized (bvtv.class) {
                    bxxk = f157622e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157621d);
                        f157622e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
