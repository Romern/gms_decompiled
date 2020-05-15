package p000;

/* renamed from: cbim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbim extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbim f177266c;

    /* renamed from: d */
    private static volatile bxxk f177267d;

    /* renamed from: a */
    public bxte f177268a;

    /* renamed from: b */
    public String f177269b = "";

    static {
        cbim cbim = new cbim();
        f177266c = cbim;
        bxvk.m124024a(cbim.class, cbim);
    }

    private cbim() {
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
            return bxvk.m124022a(f177266c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbim();
        } else {
            if (i2 == 4) {
                return new bxvd(f177266c);
            }
            if (i2 == 5) {
                return f177266c;
            }
            bxxk bxxk = f177267d;
            if (bxxk == null) {
                synchronized (cbim.class) {
                    bxxk = f177267d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177266c);
                        f177267d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
