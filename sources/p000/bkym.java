package p000;

/* renamed from: bkym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkym extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkym f125465a;

    /* renamed from: d */
    private static volatile bxxk f125466d;

    /* renamed from: b */
    private int f125467b;

    /* renamed from: c */
    private bkya f125468c;

    static {
        bkym bkym = new bkym();
        f125465a = bkym;
        bxvk.m124024a(bkym.class, bkym);
    }

    private bkym() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f125465a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bkym();
        } else {
            if (i2 == 4) {
                return new bxvd(f125465a);
            }
            if (i2 == 5) {
                return f125465a;
            }
            bxxk bxxk = f125466d;
            if (bxxk == null) {
                synchronized (bkym.class) {
                    bxxk = f125466d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125465a);
                        f125466d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
