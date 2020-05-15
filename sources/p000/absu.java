package p000;

/* renamed from: absu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final absu f58165d;

    /* renamed from: e */
    private static volatile bxxk f58166e;

    /* renamed from: a */
    public int f58167a;

    /* renamed from: b */
    public String f58168b = "";

    /* renamed from: c */
    public int f58169c;

    static {
        absu absu = new absu();
        f58165d = absu;
        bxvk.m124024a(absu.class, absu);
    }

    private absu() {
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
            return bxvk.m124022a(f58165d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new absu();
        } else {
            if (i2 == 4) {
                return new bxvd(f58165d);
            }
            if (i2 == 5) {
                return f58165d;
            }
            bxxk bxxk = f58166e;
            if (bxxk == null) {
                synchronized (absu.class) {
                    bxxk = f58166e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58165d);
                        f58166e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
