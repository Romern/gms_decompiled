package p000;

/* renamed from: cbmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbmk f177636e;

    /* renamed from: f */
    private static volatile bxxk f177637f;

    /* renamed from: a */
    public String f177638a = "";

    /* renamed from: b */
    public String f177639b = "";

    /* renamed from: c */
    public bxtx f177640c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f177641d = bxtx.f164797b;

    static {
        cbmk cbmk = new cbmk();
        f177636e = cbmk;
        bxvk.m124024a(cbmk.class, cbmk);
    }

    private cbmk() {
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
            return bxvk.m124022a(f177636e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\b\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f177636e);
            }
            if (i2 == 5) {
                return f177636e;
            }
            bxxk bxxk = f177637f;
            if (bxxk == null) {
                synchronized (cbmk.class) {
                    bxxk = f177637f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177636e);
                        f177637f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
