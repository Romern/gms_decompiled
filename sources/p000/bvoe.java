package p000;

/* renamed from: bvoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvoe f157019e;

    /* renamed from: f */
    private static volatile bxxk f157020f;

    /* renamed from: a */
    public int f157021a;

    /* renamed from: b */
    public long f157022b;

    /* renamed from: c */
    public int f157023c;

    /* renamed from: d */
    public int f157024d;

    static {
        bvoe bvoe = new bvoe();
        f157019e = bvoe;
        bxvk.m124024a(bvoe.class, bvoe);
    }

    private bvoe() {
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
            return bxvk.m124022a(f157019e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0004ဋ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvoe();
        } else {
            if (i2 == 4) {
                return new bxvd(f157019e);
            }
            if (i2 == 5) {
                return f157019e;
            }
            bxxk bxxk = f157020f;
            if (bxxk == null) {
                synchronized (bvoe.class) {
                    bxxk = f157020f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157019e);
                        f157020f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
