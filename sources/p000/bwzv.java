package p000;

/* renamed from: bwzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwzv f161643d;

    /* renamed from: e */
    public static final bxvj f161644e;

    /* renamed from: g */
    private static volatile bxxk f161645g;

    /* renamed from: a */
    public int f161646a = 0;

    /* renamed from: b */
    public Object f161647b;

    /* renamed from: c */
    public int f161648c;

    /* renamed from: f */
    private int f161649f;

    static {
        bwzv bwzv = new bwzv();
        f161643d = bwzv;
        bxvk.m124024a(bwzv.class, bwzv);
        bwoi bwoi = bwoi.f160451f;
        bwzv bwzv2 = f161643d;
        f161644e = bxvk.m124006a(bwoi, bwzv2, bwzv2, 254279473, bxzf.MESSAGE);
    }

    private bwzv() {
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
            return bxvk.m124022a(f161643d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwzt.f161642a, bwzs.class});
        } else if (i2 == 3) {
            return new bwzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f161643d);
            }
            if (i2 == 5) {
                return f161643d;
            }
            bxxk bxxk = f161645g;
            if (bxxk == null) {
                synchronized (bwzv.class) {
                    bxxk = f161645g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161643d);
                        f161645g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
