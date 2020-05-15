package p000;

/* renamed from: bxcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxcs f162983c;

    /* renamed from: e */
    private static volatile bxxk f162984e;

    /* renamed from: a */
    public int f162985a;

    /* renamed from: b */
    public String f162986b = "";

    /* renamed from: d */
    private int f162987d;

    static {
        bxcs bxcs = new bxcs();
        f162983c = bxcs;
        bxvk.m124024a(bxcs.class, bxcs);
    }

    private bxcs() {
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
            return bxvk.m124022a(f162983c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", bxcq.f162982a, "b"});
        } else if (i2 == 3) {
            return new bxcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f162983c);
            }
            if (i2 == 5) {
                return f162983c;
            }
            bxxk bxxk = f162984e;
            if (bxxk == null) {
                synchronized (bxcs.class) {
                    bxxk = f162984e;
                    if (bxxk == null) {
                        bxxk = new bxve(f162983c);
                        f162984e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
