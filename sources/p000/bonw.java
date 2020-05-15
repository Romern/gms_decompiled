package p000;

/* renamed from: bonw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bonw f133865c;

    /* renamed from: d */
    private static volatile bxxk f133866d;

    /* renamed from: a */
    public long f133867a;

    /* renamed from: b */
    public long f133868b;

    static {
        bonw bonw = new bonw();
        f133865c = bonw;
        bxvk.m124024a(bonw.class, bonw);
    }

    private bonw() {
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
            return bxvk.m124022a(f133865c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bonw();
        } else {
            if (i2 == 4) {
                return new bxvd(f133865c);
            }
            if (i2 == 5) {
                return f133865c;
            }
            bxxk bxxk = f133866d;
            if (bxxk == null) {
                synchronized (bonw.class) {
                    bxxk = f133866d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133865c);
                        f133866d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
