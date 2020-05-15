package p000;

/* renamed from: bxmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxmb f163919d;

    /* renamed from: e */
    public static final bxvj f163920e;

    /* renamed from: f */
    private static volatile bxxk f163921f;

    /* renamed from: a */
    public int f163922a;

    /* renamed from: b */
    public int f163923b;

    /* renamed from: c */
    public int f163924c;

    static {
        bxmb bxmb = new bxmb();
        f163919d = bxmb;
        GeneratedMessageLite.m124024a(bxmb.class, bxmb);
        bxcf bxcf = bxcf.f162779a;
        bxmb bxmb2 = f163919d;
        f163920e = GeneratedMessageLite.m124006a(bxcf, bxmb2, bxmb2, 95555291, bxzf.MESSAGE);
    }

    private bxmb() {
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
            return GeneratedMessageLite.m124022a(f163919d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bxly.m122853b(), "c", bxma.m122857b()});
        } else if (i2 == 3) {
            return new bxmb();
        } else {
            if (i2 == 4) {
                return new bxvd(f163919d);
            }
            if (i2 == 5) {
                return f163919d;
            }
            bxxk bxxk = f163921f;
            if (bxxk == null) {
                synchronized (bxmb.class) {
                    bxxk = f163921f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163919d);
                        f163921f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
