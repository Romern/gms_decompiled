package p000;

/* renamed from: cbga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbga extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbga f177002e;

    /* renamed from: f */
    private static volatile bxxk f177003f;

    /* renamed from: a */
    public String f177004a = "";

    /* renamed from: b */
    public bxtx f177005b = bxtx.f164797b;

    /* renamed from: c */
    public cbdj f177006c;

    /* renamed from: d */
    public cbdr f177007d;

    static {
        cbga cbga = new cbga();
        f177002e = cbga;
        bxvk.m124024a(cbga.class, cbga);
    }

    private cbga() {
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
            return bxvk.m124022a(f177002e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbga();
        } else {
            if (i2 == 4) {
                return new bxvd(f177002e);
            }
            if (i2 == 5) {
                return f177002e;
            }
            bxxk bxxk = f177003f;
            if (bxxk == null) {
                synchronized (cbga.class) {
                    bxxk = f177003f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177002e);
                        f177003f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
