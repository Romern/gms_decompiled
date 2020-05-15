package p000;

/* renamed from: bmfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmfh f129095c;

    /* renamed from: d */
    private static volatile bxxk f129096d;

    /* renamed from: a */
    public int f129097a;

    /* renamed from: b */
    public String f129098b = "";

    static {
        bmfh bmfh = new bmfh();
        f129095c = bmfh;
        bxvk.m124024a(bmfh.class, bmfh);
    }

    private bmfh() {
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
            return bxvk.m124022a(f129095c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmfh();
        } else {
            if (i2 == 4) {
                return new bxvd(f129095c);
            }
            if (i2 == 5) {
                return f129095c;
            }
            bxxk bxxk = f129096d;
            if (bxxk == null) {
                synchronized (bmfh.class) {
                    bxxk = f129096d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129095c);
                        f129096d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
