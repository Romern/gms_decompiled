package p000;

/* renamed from: abqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abqu f58016d;

    /* renamed from: e */
    private static volatile bxxk f58017e;

    /* renamed from: a */
    public String f58018a = "";

    /* renamed from: b */
    public String f58019b = "";

    /* renamed from: c */
    public caef f58020c;

    static {
        abqu abqu = new abqu();
        f58016d = abqu;
        bxvk.m124024a(abqu.class, abqu);
    }

    private abqu() {
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
            return bxvk.m124022a(f58016d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f58016d);
            }
            if (i2 == 5) {
                return f58016d;
            }
            bxxk bxxk = f58017e;
            if (bxxk == null) {
                synchronized (abqu.class) {
                    bxxk = f58017e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58016d);
                        f58017e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
