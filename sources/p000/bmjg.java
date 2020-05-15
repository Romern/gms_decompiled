package p000;

/* renamed from: bmjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmjg f129695c;

    /* renamed from: e */
    private static volatile bxxk f129696e;

    /* renamed from: a */
    public String f129697a = "";

    /* renamed from: b */
    public bmjf f129698b;

    /* renamed from: d */
    private int f129699d;

    static {
        bmjg bmjg = new bmjg();
        f129695c = bmjg;
        bxvk.m124024a(bmjg.class, bmjg);
    }

    private bmjg() {
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
            return bxvk.m124022a(f129695c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmjg();
        } else {
            if (i2 == 4) {
                return new bxvd(f129695c);
            }
            if (i2 == 5) {
                return f129695c;
            }
            bxxk bxxk = f129696e;
            if (bxxk == null) {
                synchronized (bmjg.class) {
                    bxxk = f129696e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129695c);
                        f129696e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
