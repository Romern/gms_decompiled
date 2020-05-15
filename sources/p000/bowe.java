package p000;

/* renamed from: bowe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowe extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bowe f135103h;

    /* renamed from: i */
    private static volatile bxxk f135104i;

    /* renamed from: a */
    public int f135105a;

    /* renamed from: b */
    public int f135106b;

    /* renamed from: c */
    public int f135107c;

    /* renamed from: d */
    public int f135108d;

    /* renamed from: e */
    public bowd f135109e;

    /* renamed from: f */
    public bxwc f135110f = bxxn.f165040b;

    /* renamed from: g */
    public int f135111g;

    static {
        bowe bowe = new bowe();
        f135103h = bowe;
        bxvk.m124024a(bowe.class, bowe);
    }

    private bowe() {
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
            return bxvk.m124022a(f135103h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bowc.class, "g"});
        } else if (i2 == 3) {
            return new bowe();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f135103h;
            }
            bxxk bxxk = f135104i;
            if (bxxk == null) {
                synchronized (bowe.class) {
                    bxxk = f135104i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135103h);
                        f135104i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
