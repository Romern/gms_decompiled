package p000;

/* renamed from: bwuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwuk f161035c;

    /* renamed from: e */
    private static volatile bxxk f161036e;

    /* renamed from: a */
    public int f161037a;

    /* renamed from: b */
    public String f161038b = "";

    /* renamed from: d */
    private int f161039d;

    static {
        bwuk bwuk = new bwuk();
        f161035c = bwuk;
        bxvk.m124024a(bwuk.class, bwuk);
    }

    private bwuk() {
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
            return bxvk.m124022a(f161035c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", bwui.f161034a, "b"});
        } else if (i2 == 3) {
            return new bwuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f161035c);
            }
            if (i2 == 5) {
                return f161035c;
            }
            bxxk bxxk = f161036e;
            if (bxxk == null) {
                synchronized (bwuk.class) {
                    bxxk = f161036e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161035c);
                        f161036e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
