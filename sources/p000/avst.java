package p000;

/* renamed from: avst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avst extends bxvk implements bxxd {

    /* renamed from: b */
    public static final avst f93854b;

    /* renamed from: d */
    private static volatile bxxk f93855d;

    /* renamed from: a */
    public int f93856a;

    /* renamed from: c */
    private int f93857c;

    static {
        avst avst = new avst();
        f93854b = avst;
        bxvk.m124024a(avst.class, avst);
    }

    private avst() {
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
            return bxvk.m124022a(f93854b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", avsr.f93853a});
        } else if (i2 == 3) {
            return new avst();
        } else {
            if (i2 == 4) {
                return new bxvd(f93854b);
            }
            if (i2 == 5) {
                return f93854b;
            }
            bxxk bxxk = f93855d;
            if (bxxk == null) {
                synchronized (avst.class) {
                    bxxk = f93855d;
                    if (bxxk == null) {
                        bxxk = new bxve(f93854b);
                        f93855d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
