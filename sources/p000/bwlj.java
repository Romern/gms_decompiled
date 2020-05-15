package p000;

/* renamed from: bwlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwlj f160137d;

    /* renamed from: e */
    private static volatile bxxk f160138e;

    /* renamed from: a */
    public int f160139a;

    /* renamed from: b */
    public bmaj f160140b;

    /* renamed from: c */
    public bxtx f160141c = bxtx.f164797b;

    static {
        bwlj bwlj = new bwlj();
        f160137d = bwlj;
        bxvk.m124024a(bwlj.class, bwlj);
    }

    private bwlj() {
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
            return bxvk.m124022a(f160137d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwlj();
        } else {
            if (i2 == 4) {
                return new bxvd(f160137d);
            }
            if (i2 == 5) {
                return f160137d;
            }
            bxxk bxxk = f160138e;
            if (bxxk == null) {
                synchronized (bwlj.class) {
                    bxxk = f160138e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160137d);
                        f160138e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
