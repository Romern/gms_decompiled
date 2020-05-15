package p000;

/* renamed from: brcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brcz f142453c;

    /* renamed from: e */
    private static volatile bxxk f142454e;

    /* renamed from: a */
    public boolean f142455a;

    /* renamed from: b */
    public int f142456b;

    /* renamed from: d */
    private int f142457d;

    static {
        brcz brcz = new brcz();
        f142453c = brcz;
        GeneratedMessageLite.m124024a(brcz.class, brcz);
    }

    private brcz() {
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
            return GeneratedMessageLite.m124022a(f142453c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", brcj.f142386a});
        } else if (i2 == 3) {
            return new brcz();
        } else {
            if (i2 == 4) {
                return new bxvd(f142453c);
            }
            if (i2 == 5) {
                return f142453c;
            }
            bxxk bxxk = f142454e;
            if (bxxk == null) {
                synchronized (brcz.class) {
                    bxxk = f142454e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142453c);
                        f142454e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
