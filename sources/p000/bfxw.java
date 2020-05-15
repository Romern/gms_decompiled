package p000;

/* renamed from: bfxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bfxw f115630e;

    /* renamed from: f */
    private static volatile bxxk f115631f;

    /* renamed from: a */
    public int f115632a = 0;

    /* renamed from: b */
    public Object f115633b;

    /* renamed from: c */
    public int f115634c;

    /* renamed from: d */
    public long f115635d;

    static {
        bfxw bfxw = new bfxw();
        f115630e = bfxw;
        bxvk.m124024a(bfxw.class, bfxw);
    }

    private bfxw() {
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
            return bxvk.m124022a(f115630e, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0006\u0002\u0002\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"b", "a", "c", "d", bfxp.class, bfxt.class, bfxu.class, bfyb.class, bfya.class, bfxy.class, bfxo.class, bfxv.class, bfxz.class});
        } else if (i2 == 3) {
            return new bfxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f115630e);
            }
            if (i2 == 5) {
                return f115630e;
            }
            bxxk bxxk = f115631f;
            if (bxxk == null) {
                synchronized (bfxw.class) {
                    bxxk = f115631f;
                    if (bxxk == null) {
                        bxxk = new bxve(f115630e);
                        f115631f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
