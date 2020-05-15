package p000;

/* renamed from: bvet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvet extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvet f155791d;

    /* renamed from: e */
    private static volatile bxxk f155792e;

    /* renamed from: a */
    public int f155793a;

    /* renamed from: b */
    public int f155794b;

    /* renamed from: c */
    public int f155795c;

    static {
        bvet bvet = new bvet();
        f155791d = bvet;
        bxvk.m124024a(bvet.class, bvet);
    }

    private bvet() {
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
            return bxvk.m124022a(f155791d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bviv.f156296a, "c"});
        } else if (i2 == 3) {
            return new bvet();
        } else {
            if (i2 == 4) {
                return new bxvd(f155791d);
            }
            if (i2 == 5) {
                return f155791d;
            }
            bxxk bxxk = f155792e;
            if (bxxk == null) {
                synchronized (bvet.class) {
                    bxxk = f155792e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155791d);
                        f155792e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
