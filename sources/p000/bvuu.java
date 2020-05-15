package p000;

/* renamed from: bvuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvuu f157741e;

    /* renamed from: f */
    private static volatile bxxk f157742f;

    /* renamed from: a */
    public int f157743a;

    /* renamed from: b */
    public byel f157744b;

    /* renamed from: c */
    public bxwc f157745c = bxxn.f165040b;

    /* renamed from: d */
    public String f157746d = "";

    static {
        bvuu bvuu = new bvuu();
        f157741e = bvuu;
        bxvk.m124024a(bvuu.class, bvuu);
    }

    private bvuu() {
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
            return bxvk.m124022a(f157741e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvuu();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f157741e;
            }
            bxxk bxxk = f157742f;
            if (bxxk == null) {
                synchronized (bvuu.class) {
                    bxxk = f157742f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157741e);
                        f157742f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
