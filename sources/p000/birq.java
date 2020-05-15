package p000;

/* renamed from: birq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final birq f121445e;

    /* renamed from: f */
    private static volatile bxxk f121446f;

    /* renamed from: a */
    public int f121447a;

    /* renamed from: b */
    public int f121448b = 1;

    /* renamed from: c */
    public int f121449c = 1;

    /* renamed from: d */
    public boolean f121450d;

    static {
        birq birq = new birq();
        f121445e = birq;
        bxvk.m124024a(birq.class, birq);
    }

    private birq() {
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
            return bxvk.m124022a(f121445e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", biqy.f121369a, "c", bivz.f122065a, "d"});
        } else if (i2 == 3) {
            return new birq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121445e);
            }
            if (i2 == 5) {
                return f121445e;
            }
            bxxk bxxk = f121446f;
            if (bxxk == null) {
                synchronized (birq.class) {
                    bxxk = f121446f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121445e);
                        f121446f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
