package p000;

/* renamed from: bwxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxe extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwxe f161335d;

    /* renamed from: e */
    private static volatile bxxk f161336e;

    /* renamed from: a */
    public int f161337a;

    /* renamed from: b */
    public int f161338b;

    /* renamed from: c */
    public int f161339c;

    static {
        bwxe bwxe = new bwxe();
        f161335d = bwxe;
        bxvk.m124024a(bwxe.class, bwxe);
    }

    private bwxe() {
        bxuz bxuz = bxuz.f164939b;
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
            return bxvk.m124022a(f161335d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f161335d);
            }
            if (i2 == 5) {
                return f161335d;
            }
            bxxk bxxk = f161336e;
            if (bxxk == null) {
                synchronized (bwxe.class) {
                    bxxk = f161336e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161335d);
                        f161336e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
