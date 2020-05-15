package p000;

/* renamed from: bvkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkv extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bvkv f156470i;

    /* renamed from: j */
    private static volatile bxxk f156471j;

    /* renamed from: a */
    public int f156472a;

    /* renamed from: b */
    public bvov f156473b;

    /* renamed from: c */
    public bxwc f156474c = bxxn.f165040b;

    /* renamed from: d */
    public String f156475d = "";

    /* renamed from: e */
    public String f156476e = "";

    /* renamed from: f */
    public String f156477f = "";

    /* renamed from: g */
    public bzrv f156478g;

    /* renamed from: h */
    public String f156479h = "";

    static {
        bvkv bvkv = new bvkv();
        f156470i = bvkv;
        bxvk.m124024a(bvkv.class, bvkv);
    }

    private bvkv() {
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
            return bxvk.m124022a(f156470i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bvkv();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156470i;
            }
            bxxk bxxk = f156471j;
            if (bxxk == null) {
                synchronized (bvkv.class) {
                    bxxk = f156471j;
                    if (bxxk == null) {
                        bxxk = new bxve(f156470i);
                        f156471j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
