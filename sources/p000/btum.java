package p000;

/* renamed from: btum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btum extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btum f150505c;

    /* renamed from: d */
    private static volatile bxxk f150506d;

    /* renamed from: a */
    public int f150507a = 0;

    /* renamed from: b */
    public Object f150508b;

    static {
        btum btum = new btum();
        f150505c = btum;
        bxvk.m124024a(btum.class, btum);
    }

    private btum() {
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
            return bxvk.m124022a(f150505c, "\u0001\u0005\u0001\u0000\u0002\u0007\u0005\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", btuk.class, btuo.class, btul.class, btun.class, btuj.class});
        } else if (i2 == 3) {
            return new btum();
        } else {
            if (i2 == 4) {
                return new bxvd(f150505c);
            }
            if (i2 == 5) {
                return f150505c;
            }
            bxxk bxxk = f150506d;
            if (bxxk == null) {
                synchronized (btum.class) {
                    bxxk = f150506d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150505c);
                        f150506d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
