package p000;

/* renamed from: bwse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwse extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwse f160846c;

    /* renamed from: d */
    public static final bxvj f160847d;

    /* renamed from: e */
    private static volatile bxxk f160848e;

    /* renamed from: a */
    public bxwc f160849a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f160850b = bxxn.f165040b;

    static {
        bwse bwse = new bwse();
        f160846c = bwse;
        bxvk.m124024a(bwse.class, bwse);
        bwog bwog = bwog.f160437f;
        bwse bwse2 = f160846c;
        f160847d = bxvk.m124006a(bwog, bwse2, bwse2, 296094322, bxzf.MESSAGE);
    }

    private bwse() {
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
            return bxvk.m124022a(f160846c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bwsh.class, "b", bwsi.class});
        } else if (i2 == 3) {
            return new bwse();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f160846c;
            }
            bxxk bxxk = f160848e;
            if (bxxk == null) {
                synchronized (bwse.class) {
                    bxxk = f160848e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160846c);
                        f160848e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
