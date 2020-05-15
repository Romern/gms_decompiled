package p000;

/* renamed from: bvwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvwj f157938h;

    /* renamed from: i */
    private static volatile bxxk f157939i;

    /* renamed from: a */
    public int f157940a;

    /* renamed from: b */
    public bxtx f157941b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f157942c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f157943d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f157944e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f157945f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f157946g = bxxn.f165040b;

    static {
        bvwj bvwj = new bvwj();
        f157938h = bvwj;
        bxvk.m124024a(bvwj.class, bvwj);
    }

    private bvwj() {
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
            return bxvk.m124022a(f157938h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0000\u0001ည\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvwj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157938h;
            }
            bxxk bxxk = f157939i;
            if (bxxk == null) {
                synchronized (bvwj.class) {
                    bxxk = f157939i;
                    if (bxxk == null) {
                        bxxk = new bxve(f157938h);
                        f157939i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
