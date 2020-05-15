package p000;

/* renamed from: brdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brdx f142574b;

    /* renamed from: c */
    private static volatile bxxk f142575c;

    /* renamed from: a */
    public bxwc f142576a = bxxn.f165040b;

    static {
        brdx brdx = new brdx();
        f142574b = brdx;
        GeneratedMessageLite.m124024a(brdx.class, brdx);
    }

    private brdx() {
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
            return GeneratedMessageLite.m124022a(f142574b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", brdy.class});
        } else if (i2 == 3) {
            return new brdx();
        } else {
            if (i2 == 4) {
                return new bxvd(f142574b);
            }
            if (i2 == 5) {
                return f142574b;
            }
            bxxk bxxk = f142575c;
            if (bxxk == null) {
                synchronized (brdx.class) {
                    bxxk = f142575c;
                    if (bxxk == null) {
                        bxxk = new bxve(f142574b);
                        f142575c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
