package p000;

/* renamed from: bvzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvzz f158595e;

    /* renamed from: f */
    private static volatile bxxk f158596f;

    /* renamed from: a */
    public int f158597a;

    /* renamed from: b */
    public int f158598b;

    /* renamed from: c */
    public long f158599c;

    /* renamed from: d */
    public String f158600d = "";

    static {
        bvzz bvzz = new bvzz();
        f158595e = bvzz;
        bxvk.m124024a(bvzz.class, bvzz);
    }

    private bvzz() {
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
            return bxvk.m124022a(f158595e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f158595e);
            }
            if (i2 == 5) {
                return f158595e;
            }
            bxxk bxxk = f158596f;
            if (bxxk == null) {
                synchronized (bvzz.class) {
                    bxxk = f158596f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158595e);
                        f158596f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
