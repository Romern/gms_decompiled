package p000;

/* renamed from: brcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brcn f142396c;

    /* renamed from: d */
    private static volatile bxxk f142397d;

    /* renamed from: a */
    public int f142398a;

    /* renamed from: b */
    public bree f142399b;

    static {
        brcn brcn = new brcn();
        f142396c = brcn;
        bxvk.m124024a(brcn.class, brcn);
    }

    private brcn() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f142396c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brcn();
        } else {
            if (i2 == 4) {
                return new bxvd(f142396c);
            }
            if (i2 == 5) {
                return f142396c;
            }
            bxxk bxxk = f142397d;
            if (bxxk == null) {
                synchronized (brcn.class) {
                    bxxk = f142397d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142396c);
                        f142397d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
