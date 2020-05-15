package p000;

/* renamed from: bqiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqiv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqiv f140904d;

    /* renamed from: e */
    private static volatile bxxk f140905e;

    /* renamed from: a */
    public int f140906a;

    /* renamed from: b */
    public int f140907b;

    /* renamed from: c */
    public String f140908c = "";

    static {
        bqiv bqiv = new bqiv();
        f140904d = bqiv;
        GeneratedMessageLite.m124024a(bqiv.class, bqiv);
    }

    private bqiv() {
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
            return GeneratedMessageLite.m124022a(f140904d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bqjj.f140965a, "c"});
        } else if (i2 == 3) {
            return new bqiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f140904d);
            }
            if (i2 == 5) {
                return f140904d;
            }
            bxxk bxxk = f140905e;
            if (bxxk == null) {
                synchronized (bqiv.class) {
                    bxxk = f140905e;
                    if (bxxk == null) {
                        bxxk = new bxve(f140904d);
                        f140905e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
