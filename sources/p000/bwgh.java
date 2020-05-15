package p000;

/* renamed from: bwgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwgh f159199c;

    /* renamed from: d */
    private static volatile bxxk f159200d;

    /* renamed from: a */
    public int f159201a;

    /* renamed from: b */
    public long f159202b;

    static {
        bwgh bwgh = new bwgh();
        f159199c = bwgh;
        bxvk.m124024a(bwgh.class, bwgh);
    }

    private bwgh() {
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
            return bxvk.m124022a(f159199c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f159199c);
            }
            if (i2 == 5) {
                return f159199c;
            }
            bxxk bxxk = f159200d;
            if (bxxk == null) {
                synchronized (bwgh.class) {
                    bxxk = f159200d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159199c);
                        f159200d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
