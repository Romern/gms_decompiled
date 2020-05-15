package p000;

/* renamed from: bwsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwsm f160880b;

    /* renamed from: c */
    public static final bxvj f160881c;

    /* renamed from: e */
    private static volatile bxxk f160882e;

    /* renamed from: a */
    public int f160883a;

    /* renamed from: d */
    private int f160884d;

    static {
        bwsm bwsm = new bwsm();
        f160880b = bwsm;
        GeneratedMessageLite.m124024a(bwsm.class, bwsm);
        bwou bwou = bwou.f160492e;
        bwsm bwsm2 = f160880b;
        f160881c = GeneratedMessageLite.m124006a(bwou, bwsm2, bwsm2, 260579079, bxzf.MESSAGE);
    }

    private bwsm() {
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
            return GeneratedMessageLite.m124022a(f160880b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwsk.f160879a});
        } else if (i2 == 3) {
            return new bwsm();
        } else {
            if (i2 == 4) {
                return new bxvd(f160880b);
            }
            if (i2 == 5) {
                return f160880b;
            }
            bxxk bxxk = f160882e;
            if (bxxk == null) {
                synchronized (bwsm.class) {
                    bxxk = f160882e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160880b);
                        f160882e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
