package p000;

/* renamed from: bowu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bowu f135194c;

    /* renamed from: d */
    private static volatile bxxk f135195d;

    /* renamed from: a */
    public int f135196a;

    /* renamed from: b */
    public bowt f135197b;

    static {
        bowu bowu = new bowu();
        f135194c = bowu;
        bxvk.m124024a(bowu.class, bowu);
    }

    private bowu() {
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
            return bxvk.m124022a(f135194c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bowu();
        } else {
            if (i2 == 4) {
                return new bxvd(f135194c);
            }
            if (i2 == 5) {
                return f135194c;
            }
            bxxk bxxk = f135195d;
            if (bxxk == null) {
                synchronized (bowu.class) {
                    bxxk = f135195d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135194c);
                        f135195d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
