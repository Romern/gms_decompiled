package p000;

/* renamed from: brem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brem extends bxvk implements bxxd {

    /* renamed from: f */
    public static final brem f142677f;

    /* renamed from: g */
    private static volatile bxxk f142678g;

    /* renamed from: a */
    public int f142679a;

    /* renamed from: b */
    public brak f142680b;

    /* renamed from: c */
    public String f142681c = "";

    /* renamed from: d */
    public int f142682d;

    /* renamed from: e */
    public boolean f142683e;

    static {
        brem brem = new brem();
        f142677f = brem;
        bxvk.m124024a(brem.class, brem);
    }

    private brem() {
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
            return bxvk.m124022a(f142677f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", brcm.m113876b(), "e"});
        } else if (i2 == 3) {
            return new brem();
        } else {
            if (i2 == 4) {
                return new bxvd(f142677f);
            }
            if (i2 == 5) {
                return f142677f;
            }
            bxxk bxxk = f142678g;
            if (bxxk == null) {
                synchronized (brem.class) {
                    bxxk = f142678g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142677f);
                        f142678g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
