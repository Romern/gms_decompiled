package p000;

/* renamed from: bzcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcd extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bzcd f169301c;

    /* renamed from: e */
    private static volatile bxxk f169302e;

    /* renamed from: a */
    public bxwc f169303a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f169304b = bxxn.f165040b;

    /* renamed from: d */
    private byte f169305d = 2;

    static {
        bzcd bzcd = new bzcd();
        f169301c = bzcd;
        bxvk.m124024a(bzcd.class, bzcd);
    }

    private bzcd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169305d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169305d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169301c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001a", new Object[]{"a", byzk.class, "b"});
        } else if (i2 == 3) {
            return new bzcd();
        } else {
            if (i2 == 4) {
                return new bxvf(f169301c);
            }
            if (i2 == 5) {
                return f169301c;
            }
            bxxk bxxk = f169302e;
            if (bxxk == null) {
                synchronized (bzcd.class) {
                    bxxk = f169302e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169301c);
                        f169302e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
