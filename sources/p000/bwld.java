package p000;

/* renamed from: bwld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwld extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwld f160092d;

    /* renamed from: e */
    private static volatile bxxk f160093e;

    /* renamed from: a */
    public int f160094a;

    /* renamed from: b */
    public bmaj f160095b;

    /* renamed from: c */
    public bxtx f160096c = bxtx.f164797b;

    static {
        bwld bwld = new bwld();
        f160092d = bwld;
        bxvk.m124024a(bwld.class, bwld);
    }

    private bwld() {
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
            return bxvk.m124022a(f160092d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwld();
        } else {
            if (i2 == 4) {
                return new bxvd(f160092d);
            }
            if (i2 == 5) {
                return f160092d;
            }
            bxxk bxxk = f160093e;
            if (bxxk == null) {
                synchronized (bwld.class) {
                    bxxk = f160093e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160092d);
                        f160093e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
