package p000;

/* renamed from: bsiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsiz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsiz f144769c;

    /* renamed from: d */
    private static volatile bxxk f144770d;

    /* renamed from: a */
    public int f144771a = 0;

    /* renamed from: b */
    public Object f144772b;

    static {
        bsiz bsiz = new bsiz();
        f144769c = bsiz;
        bxvk.m124024a(bsiz.class, bsiz);
    }

    private bsiz() {
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
            return bxvk.m124022a(f144769c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", bsjg.class, bsjh.class});
        } else if (i2 == 3) {
            return new bsiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f144769c);
            }
            if (i2 == 5) {
                return f144769c;
            }
            bxxk bxxk = f144770d;
            if (bxxk == null) {
                synchronized (bsiz.class) {
                    bxxk = f144770d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144769c);
                        f144770d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
