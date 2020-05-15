package p000;

/* renamed from: cbkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbkg f177400d;

    /* renamed from: e */
    private static volatile bxxk f177401e;

    /* renamed from: a */
    public int f177402a = 0;

    /* renamed from: b */
    public Object f177403b;

    /* renamed from: c */
    public int f177404c;

    static {
        cbkg cbkg = new cbkg();
        f177400d = cbkg;
        bxvk.m124024a(cbkg.class, cbkg);
    }

    private cbkg() {
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
            return bxvk.m124022a(f177400d, "\u0000\u0006\u0001\u0000\u0001m\u0006\u0000\u0000\u0000\u0001\fi<\u0000j<\u0000k<\u0000l<\u0000m<\u0000", new Object[]{"b", "a", "c", cbmw.class, cbmt.class, cbmz.class, cbmv.class, cbmu.class});
        } else if (i2 == 3) {
            return new cbkg();
        } else {
            if (i2 == 4) {
                return new bxvd(f177400d);
            }
            if (i2 == 5) {
                return f177400d;
            }
            bxxk bxxk = f177401e;
            if (bxxk == null) {
                synchronized (cbkg.class) {
                    bxxk = f177401e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177400d);
                        f177401e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
