package p000;

/* renamed from: bwyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyx extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bwyx f161551h;

    /* renamed from: j */
    private static volatile bxxk f161552j;

    /* renamed from: a */
    public int f161553a;

    /* renamed from: b */
    public int f161554b;

    /* renamed from: c */
    public long f161555c;

    /* renamed from: d */
    public long f161556d;

    /* renamed from: e */
    public bwny f161557e;

    /* renamed from: f */
    public long f161558f;

    /* renamed from: g */
    public bwny f161559g;

    /* renamed from: i */
    private byte f161560i = 2;

    static {
        bwyx bwyx = new bwyx();
        f161551h = bwyx;
        bxvk.m124024a(bwyx.class, bwyx);
    }

    private bwyx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161560i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161560i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161551h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bwyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f161551h);
            }
            if (i2 == 5) {
                return f161551h;
            }
            bxxk bxxk = f161552j;
            if (bxxk == null) {
                synchronized (bwyx.class) {
                    bxxk = f161552j;
                    if (bxxk == null) {
                        bxxk = new bxve(f161551h);
                        f161552j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
