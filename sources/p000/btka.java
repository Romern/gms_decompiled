package p000;

/* renamed from: btka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btka extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btka f149211f;

    /* renamed from: g */
    private static volatile bxxk f149212g;

    /* renamed from: a */
    public String f149213a = "";

    /* renamed from: b */
    public String f149214b = "";

    /* renamed from: c */
    public String f149215c = "";

    /* renamed from: d */
    public btjz f149216d;

    /* renamed from: e */
    public String f149217e = "";

    static {
        btka btka = new btka();
        f149211f = btka;
        bxvk.m124024a(btka.class, btka);
    }

    private btka() {
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
            return bxvk.m124022a(f149211f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btka();
        } else {
            if (i2 == 4) {
                return new bxvd(f149211f);
            }
            if (i2 == 5) {
                return f149211f;
            }
            bxxk bxxk = f149212g;
            if (bxxk == null) {
                synchronized (btka.class) {
                    bxxk = f149212g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149211f);
                        f149212g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
