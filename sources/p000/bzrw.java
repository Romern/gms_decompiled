package p000;

/* renamed from: bzrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzrw f171210d;

    /* renamed from: e */
    private static volatile bxxk f171211e;

    /* renamed from: a */
    public String f171212a = "";

    /* renamed from: b */
    public long f171213b;

    /* renamed from: c */
    public int f171214c;

    static {
        bzrw bzrw = new bzrw();
        f171210d = bzrw;
        bxvk.m124024a(bzrw.class, bzrw);
    }

    private bzrw() {
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
            return bxvk.m124022a(f171210d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzrw();
        } else {
            if (i2 == 4) {
                return new bxvd(f171210d);
            }
            if (i2 == 5) {
                return f171210d;
            }
            bxxk bxxk = f171211e;
            if (bxxk == null) {
                synchronized (bzrw.class) {
                    bxxk = f171211e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171210d);
                        f171211e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
