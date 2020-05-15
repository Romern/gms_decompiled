package p000;

/* renamed from: btwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btwb f152683c;

    /* renamed from: d */
    private static volatile bxxk f152684d;

    /* renamed from: a */
    public btwa f152685a;

    /* renamed from: b */
    public btvz f152686b;

    static {
        btwb btwb = new btwb();
        f152683c = btwb;
        bxvk.m124024a(btwb.class, btwb);
    }

    private btwb() {
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
            return bxvk.m124022a(f152683c, "\u0000\u0002\u0000\u0000\u0006\u0007\u0002\u0000\u0000\u0000\u0006\t\u0007\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f152683c);
            }
            if (i2 == 5) {
                return f152683c;
            }
            bxxk bxxk = f152684d;
            if (bxxk == null) {
                synchronized (btwb.class) {
                    bxxk = f152684d;
                    if (bxxk == null) {
                        bxxk = new bxve(f152683c);
                        f152684d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
