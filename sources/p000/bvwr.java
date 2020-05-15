package p000;

/* renamed from: bvwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvwr f158002d;

    /* renamed from: e */
    private static volatile bxxk f158003e;

    /* renamed from: a */
    public int f158004a;

    /* renamed from: b */
    public int f158005b;

    /* renamed from: c */
    public int f158006c;

    static {
        bvwr bvwr = new bvwr();
        f158002d = bvwr;
        bxvk.m124024a(bvwr.class, bvwr);
    }

    private bvwr() {
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
            return bxvk.m124022a(f158002d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvwr();
        } else {
            if (i2 == 4) {
                return new bxvd(f158002d);
            }
            if (i2 == 5) {
                return f158002d;
            }
            bxxk bxxk = f158003e;
            if (bxxk == null) {
                synchronized (bvwr.class) {
                    bxxk = f158003e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158002d);
                        f158003e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
