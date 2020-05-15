package p000;

/* renamed from: bwrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwrq f160790c;

    /* renamed from: d */
    public static final bxvj f160791d;

    /* renamed from: e */
    private static volatile bxxk f160792e;

    /* renamed from: a */
    public int f160793a = 0;

    /* renamed from: b */
    public Object f160794b;

    static {
        bwrq bwrq = new bwrq();
        f160790c = bwrq;
        bxvk.m124024a(bwrq.class, bwrq);
        bwog bwog = bwog.f160437f;
        bwrq bwrq2 = f160790c;
        f160791d = bxvk.m124006a(bwog, bwrq2, bwrq2, 267547473, bxzf.MESSAGE);
    }

    private bwrq() {
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
            return bxvk.m124022a(f160790c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwrq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160790c);
            }
            if (i2 == 5) {
                return f160790c;
            }
            bxxk bxxk = f160792e;
            if (bxxk == null) {
                synchronized (bwrq.class) {
                    bxxk = f160792e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160790c);
                        f160792e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
