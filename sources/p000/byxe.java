package p000;

/* renamed from: byxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byxe f168716e;

    /* renamed from: f */
    private static volatile bxxk f168717f;

    /* renamed from: a */
    public int f168718a;

    /* renamed from: b */
    public byww f168719b;

    /* renamed from: c */
    public bywy f168720c;

    /* renamed from: d */
    public byxs f168721d;

    static {
        byxe byxe = new byxe();
        f168716e = byxe;
        bxvk.m124024a(byxe.class, byxe);
    }

    private byxe() {
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
            return bxvk.m124022a(f168716e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f168716e);
            }
            if (i2 == 5) {
                return f168716e;
            }
            bxxk bxxk = f168717f;
            if (bxxk == null) {
                synchronized (byxe.class) {
                    bxxk = f168717f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168716e);
                        f168717f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
