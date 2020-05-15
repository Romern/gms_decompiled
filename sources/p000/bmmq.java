package p000;

/* renamed from: bmmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmmq f130039c;

    /* renamed from: d */
    private static volatile bxxk f130040d;

    /* renamed from: a */
    public int f130041a = 0;

    /* renamed from: b */
    public Object f130042b;

    static {
        bmmq bmmq = new bmmq();
        f130039c = bmmq;
        bxvk.m124024a(bmmq.class, bmmq);
    }

    private bmmq() {
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
            return bxvk.m124022a(f130039c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဵ\u0000", new Object[]{"b", "a", bmqk.class, bmog.class});
        } else if (i2 == 3) {
            return new bmmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130039c);
            }
            if (i2 == 5) {
                return f130039c;
            }
            bxxk bxxk = f130040d;
            if (bxxk == null) {
                synchronized (bmmq.class) {
                    bxxk = f130040d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130039c);
                        f130040d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
