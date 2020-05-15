package p000;

/* renamed from: cbdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbdg f176729b;

    /* renamed from: c */
    private static volatile bxxk f176730c;

    /* renamed from: a */
    public String f176731a = "";

    static {
        cbdg cbdg = new cbdg();
        f176729b = cbdg;
        bxvk.m124024a(cbdg.class, cbdg);
    }

    private cbdg() {
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
            return bxvk.m124022a(f176729b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbdg();
        } else {
            if (i2 == 4) {
                return new bxvd(f176729b);
            }
            if (i2 == 5) {
                return f176729b;
            }
            bxxk bxxk = f176730c;
            if (bxxk == null) {
                synchronized (cbdg.class) {
                    bxxk = f176730c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176729b);
                        f176730c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
