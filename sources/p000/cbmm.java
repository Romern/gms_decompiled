package p000;

/* renamed from: cbmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbmm f177646c;

    /* renamed from: d */
    private static volatile bxxk f177647d;

    /* renamed from: a */
    public String f177648a = "";

    /* renamed from: b */
    public cbma f177649b;

    static {
        cbmm cbmm = new cbmm();
        f177646c = cbmm;
        bxvk.m124024a(cbmm.class, cbmm);
    }

    private cbmm() {
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
            return bxvk.m124022a(f177646c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f177646c);
            }
            if (i2 == 5) {
                return f177646c;
            }
            bxxk bxxk = f177647d;
            if (bxxk == null) {
                synchronized (cbmm.class) {
                    bxxk = f177647d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177646c);
                        f177647d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
