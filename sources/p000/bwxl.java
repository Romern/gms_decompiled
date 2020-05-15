package p000;

/* renamed from: bwxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxl extends bxvg implements bxvh {

    /* renamed from: i */
    public static final bwxl f161383i;

    /* renamed from: k */
    private static volatile bxxk f161384k;

    /* renamed from: a */
    public int f161385a;

    /* renamed from: b */
    public long f161386b;

    /* renamed from: c */
    public bwxs f161387c;

    /* renamed from: d */
    public long f161388d;

    /* renamed from: e */
    public bxwc f161389e = bxxn.f165040b;

    /* renamed from: f */
    public int f161390f;

    /* renamed from: g */
    public bxbb f161391g;

    /* renamed from: h */
    public bwwr f161392h;

    /* renamed from: j */
    private byte f161393j = 2;

    static {
        bwxl bwxl = new bwxl();
        f161383i = bwxl;
        bxvk.m124024a(bwxl.class, bwxl);
    }

    private bwxl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161393j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161393j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161383i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004Л\u0005င\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"a", "b", "c", "d", "e", bwou.class, "f", "g", "h"});
        } else if (i2 == 3) {
            return new bwxl();
        } else {
            if (i2 == 4) {
                return new bxvf(f161383i);
            }
            if (i2 == 5) {
                return f161383i;
            }
            bxxk bxxk = f161384k;
            if (bxxk == null) {
                synchronized (bwxl.class) {
                    bxxk = f161384k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161383i);
                        f161384k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
