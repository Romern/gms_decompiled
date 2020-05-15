package p000;

/* renamed from: bmmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmmw f130060c;

    /* renamed from: e */
    private static volatile bxxk f130061e;

    /* renamed from: a */
    public bxvw f130062a = bxwq.f165002b;

    /* renamed from: b */
    public String f130063b = "";

    /* renamed from: d */
    private int f130064d;

    static {
        bmmw bmmw = new bmmw();
        f130060c = bmmw;
        bxvk.m124024a(bmmw.class, bmmw);
    }

    private bmmw() {
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
            return bxvk.m124022a(f130060c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001%\u0002ဈ\u0000", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130060c);
            }
            if (i2 == 5) {
                return f130060c;
            }
            bxxk bxxk = f130061e;
            if (bxxk == null) {
                synchronized (bmmw.class) {
                    bxxk = f130061e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130060c);
                        f130061e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
