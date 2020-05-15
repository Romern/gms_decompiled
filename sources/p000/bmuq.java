package p000;

/* renamed from: bmuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmuq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmuq f130966d;

    /* renamed from: e */
    private static volatile bxxk f130967e;

    /* renamed from: a */
    public int f130968a;

    /* renamed from: b */
    public String f130969b = "";

    /* renamed from: c */
    public bztn f130970c;

    static {
        bmuq bmuq = new bmuq();
        f130966d = bmuq;
        bxvk.m124024a(bmuq.class, bmuq);
    }

    private bmuq() {
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
            return bxvk.m124022a(f130966d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130966d);
            }
            if (i2 == 5) {
                return f130966d;
            }
            bxxk bxxk = f130967e;
            if (bxxk == null) {
                synchronized (bmuq.class) {
                    bxxk = f130967e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130966d);
                        f130967e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
