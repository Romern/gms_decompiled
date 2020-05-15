package p000;

/* renamed from: bpih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpih extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bpih f137746i;

    /* renamed from: j */
    private static volatile bxxk f137747j;

    /* renamed from: a */
    public int f137748a;

    /* renamed from: b */
    public int f137749b;

    /* renamed from: c */
    public int f137750c = -1;

    /* renamed from: d */
    public int f137751d;

    /* renamed from: e */
    public String f137752e = "";

    /* renamed from: f */
    public int f137753f;

    /* renamed from: g */
    public String f137754g = "";

    /* renamed from: h */
    public bwev f137755h;

    static {
        bpih bpih = new bpih();
        f137746i = bpih;
        bxvk.m124024a(bpih.class, bpih);
    }

    private bpih() {
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
            return bxvk.m124022a(f137746i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", bphy.f137713a, "c", "d", "e", "f", bpii.f137756a, "g", "h"});
        } else if (i2 == 3) {
            return new bpih();
        } else {
            if (i2 == 4) {
                return new bxvd(f137746i);
            }
            if (i2 == 5) {
                return f137746i;
            }
            bxxk bxxk = f137747j;
            if (bxxk == null) {
                synchronized (bpih.class) {
                    bxxk = f137747j;
                    if (bxxk == null) {
                        bxxk = new bxve(f137746i);
                        f137747j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
