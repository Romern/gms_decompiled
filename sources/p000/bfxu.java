package p000;

/* renamed from: bfxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bfxu f115623c;

    /* renamed from: d */
    private static volatile bxxk f115624d;

    /* renamed from: a */
    public bgow f115625a;

    /* renamed from: b */
    public int f115626b;

    static {
        bfxu bfxu = new bfxu();
        f115623c = bfxu;
        bxvk.m124024a(bfxu.class, bfxu);
    }

    private bfxu() {
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
            return bxvk.m124022a(f115623c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f115623c);
            }
            if (i2 == 5) {
                return f115623c;
            }
            bxxk bxxk = f115624d;
            if (bxxk == null) {
                synchronized (bfxu.class) {
                    bxxk = f115624d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115623c);
                        f115624d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
