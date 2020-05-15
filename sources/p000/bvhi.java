package p000;

/* renamed from: bvhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvhi f156070c;

    /* renamed from: e */
    private static volatile bxxk f156071e;

    /* renamed from: a */
    public int f156072a;

    /* renamed from: b */
    public bzbz f156073b;

    /* renamed from: d */
    private byte f156074d = 2;

    static {
        bvhi bvhi = new bvhi();
        f156070c = bvhi;
        bxvk.m124024a(bvhi.class, bvhi);
    }

    private bvhi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156074d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156074d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f156070c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvhi();
        } else {
            if (i2 == 4) {
                return new bxvd(f156070c);
            }
            if (i2 == 5) {
                return f156070c;
            }
            bxxk bxxk = f156071e;
            if (bxxk == null) {
                synchronized (bvhi.class) {
                    bxxk = f156071e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156070c);
                        f156071e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
