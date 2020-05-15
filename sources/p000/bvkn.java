package p000;

/* renamed from: bvkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvkn f156444c;

    /* renamed from: d */
    private static volatile bxxk f156445d;

    /* renamed from: a */
    public int f156446a;

    /* renamed from: b */
    public String f156447b = "";

    static {
        bvkn bvkn = new bvkn();
        f156444c = bvkn;
        bxvk.m124024a(bvkn.class, bvkn);
    }

    private bvkn() {
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
            return bxvk.m124022a(f156444c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f156444c);
            }
            if (i2 == 5) {
                return f156444c;
            }
            bxxk bxxk = f156445d;
            if (bxxk == null) {
                synchronized (bvkn.class) {
                    bxxk = f156445d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156444c);
                        f156445d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
