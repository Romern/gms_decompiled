package p000;

/* renamed from: cbdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbdm f176759c;

    /* renamed from: d */
    private static volatile bxxk f176760d;

    /* renamed from: a */
    public int f176761a;

    /* renamed from: b */
    public bxte f176762b;

    static {
        cbdm cbdm = new cbdm();
        f176759c = cbdm;
        bxvk.m124024a(cbdm.class, cbdm);
    }

    private cbdm() {
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
            return bxvk.m124022a(f176759c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbdm();
        } else {
            if (i2 == 4) {
                return new bxvd(f176759c);
            }
            if (i2 == 5) {
                return f176759c;
            }
            bxxk bxxk = f176760d;
            if (bxxk == null) {
                synchronized (cbdm.class) {
                    bxxk = f176760d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176759c);
                        f176760d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
