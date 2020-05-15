package p000;

/* renamed from: apyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final apyl f85146d;

    /* renamed from: e */
    private static volatile bxxk f85147e;

    /* renamed from: a */
    public int f85148a;

    /* renamed from: b */
    public apym f85149b;

    /* renamed from: c */
    public int f85150c;

    static {
        apyl apyl = new apyl();
        f85146d = apyl;
        bxvk.m124024a(apyl.class, apyl);
    }

    private apyl() {
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
            return bxvk.m124022a(f85146d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f85146d);
            }
            if (i2 == 5) {
                return f85146d;
            }
            bxxk bxxk = f85147e;
            if (bxxk == null) {
                synchronized (apyl.class) {
                    bxxk = f85147e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85146d);
                        f85147e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
