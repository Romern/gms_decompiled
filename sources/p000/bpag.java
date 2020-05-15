package p000;

/* renamed from: bpag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpag extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpag f135480d;

    /* renamed from: e */
    private static volatile bxxk f135481e;

    /* renamed from: a */
    public int f135482a;

    /* renamed from: b */
    public int f135483b;

    /* renamed from: c */
    public int f135484c;

    static {
        bpag bpag = new bpag();
        f135480d = bpag;
        GeneratedMessageLite.m124024a(bpag.class, bpag);
    }

    private bpag() {
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
            return GeneratedMessageLite.m124022a(f135480d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002", new Object[]{"a", "b", bpae.f135478a, "c", bpaf.f135479a});
        } else if (i2 == 3) {
            return new bpag();
        } else {
            if (i2 == 4) {
                return new bxvd(f135480d);
            }
            if (i2 == 5) {
                return f135480d;
            }
            bxxk bxxk = f135481e;
            if (bxxk == null) {
                synchronized (bpag.class) {
                    bxxk = f135481e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135480d);
                        f135481e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
