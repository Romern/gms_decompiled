package p000;

/* renamed from: bqqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqqu f141386b;

    /* renamed from: c */
    private static volatile bxxk f141387c;

    /* renamed from: a */
    public int f141388a;

    static {
        bqqu bqqu = new bqqu();
        f141386b = bqqu;
        bxvk.m124024a(bqqu.class, bqqu);
    }

    private bqqu() {
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
            return bxvk.m124022a(f141386b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f141386b);
            }
            if (i2 == 5) {
                return f141386b;
            }
            bxxk bxxk = f141387c;
            if (bxxk == null) {
                synchronized (bqqu.class) {
                    bxxk = f141387c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141386b);
                        f141387c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
