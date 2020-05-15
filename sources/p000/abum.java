package p000;

/* renamed from: abum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abum extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abum f58427c;

    /* renamed from: e */
    private static volatile bxxk f58428e;

    /* renamed from: a */
    public String f58429a = "";

    /* renamed from: b */
    public String f58430b = "";

    /* renamed from: d */
    private int f58431d;

    static {
        abum abum = new abum();
        f58427c = abum;
        bxvk.m124024a(abum.class, abum);
    }

    private abum() {
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
            return bxvk.m124022a(f58427c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new abum();
        } else {
            if (i2 == 4) {
                return new bxvd(f58427c);
            }
            if (i2 == 5) {
                return f58427c;
            }
            bxxk bxxk = f58428e;
            if (bxxk == null) {
                synchronized (abum.class) {
                    bxxk = f58428e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58427c);
                        f58428e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
