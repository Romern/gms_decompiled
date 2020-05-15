package p000;

/* renamed from: bplh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bplh f138088d;

    /* renamed from: f */
    private static volatile bxxk f138089f;

    /* renamed from: a */
    public int f138090a;

    /* renamed from: b */
    public int f138091b;

    /* renamed from: c */
    public int f138092c;

    /* renamed from: e */
    private byte f138093e = 2;

    static {
        bplh bplh = new bplh();
        f138088d = bplh;
        bxvk.m124024a(bplh.class, bplh);
    }

    private bplh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138093e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138093e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f138088d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bplh();
        } else {
            if (i2 == 4) {
                return new bxvd(f138088d);
            }
            if (i2 == 5) {
                return f138088d;
            }
            bxxk bxxk = f138089f;
            if (bxxk == null) {
                synchronized (bplh.class) {
                    bxxk = f138089f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138088d);
                        f138089f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
