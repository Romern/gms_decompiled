package p000;

/* renamed from: cbhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbhw f177204e;

    /* renamed from: f */
    private static volatile bxxk f177205f;

    /* renamed from: a */
    public String f177206a = "";

    /* renamed from: b */
    public String f177207b = "";

    /* renamed from: c */
    public String f177208c = "";

    /* renamed from: d */
    public cbhl f177209d;

    static {
        cbhw cbhw = new cbhw();
        f177204e = cbhw;
        bxvk.m124024a(cbhw.class, cbhw);
    }

    private cbhw() {
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
            return bxvk.m124022a(f177204e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f177204e);
            }
            if (i2 == 5) {
                return f177204e;
            }
            bxxk bxxk = f177205f;
            if (bxxk == null) {
                synchronized (cbhw.class) {
                    bxxk = f177205f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177204e);
                        f177205f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
