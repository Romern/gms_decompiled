package p000;

/* renamed from: bree */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bree extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bree f142590e;

    /* renamed from: g */
    private static volatile bxxk f142591g;

    /* renamed from: a */
    public int f142592a;

    /* renamed from: b */
    public bxwc f142593b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f142594c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f142595d = bxxn.f165040b;

    /* renamed from: f */
    private int f142596f;

    static {
        bree bree = new bree();
        f142590e = bree;
        GeneratedMessageLite.m124024a(bree.class, bree);
    }

    private bree() {
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
            return GeneratedMessageLite.m124022a(f142590e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"f", "a", brec.f142589a, "b", brdy.class, "c", breb.class, "d", brdx.class});
        } else if (i2 == 3) {
            return new bree();
        } else {
            if (i2 == 4) {
                return new bxvd(f142590e);
            }
            if (i2 == 5) {
                return f142590e;
            }
            bxxk bxxk = f142591g;
            if (bxxk == null) {
                synchronized (bree.class) {
                    bxxk = f142591g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142590e);
                        f142591g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
