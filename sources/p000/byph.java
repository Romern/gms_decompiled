package p000;

/* renamed from: byph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byph extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byph f167342b;

    /* renamed from: c */
    private static volatile bxxk f167343c;

    /* renamed from: a */
    public bxvn f167344a = bxtk.f164779b;

    static {
        byph byph = new byph();
        f167342b = byph;
        bxvk.m124024a(byph.class, byph);
    }

    private byph() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f167342b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0019", new Object[]{"a"});
        } else if (i2 == 3) {
            return new byph();
        } else {
            if (i2 == 4) {
                return new bxvd(f167342b);
            }
            if (i2 == 5) {
                return f167342b;
            }
            bxxk bxxk = f167343c;
            if (bxxk == null) {
                synchronized (byph.class) {
                    bxxk = f167343c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167342b);
                        f167343c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
