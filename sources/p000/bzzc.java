package p000;

/* renamed from: bzzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzzc f171952c;

    /* renamed from: e */
    private static volatile bxxk f171953e;

    /* renamed from: a */
    public int f171954a;

    /* renamed from: b */
    public bzyy f171955b;

    /* renamed from: d */
    private int f171956d;

    static {
        bzzc bzzc = new bzzc();
        f171952c = bzzc;
        GeneratedMessageLite.m124024a(bzzc.class, bzzc);
    }

    private bzzc() {
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
            return GeneratedMessageLite.m124022a(f171952c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", bzza.f171951a, "b"});
        } else if (i2 == 3) {
            return new bzzc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171952c);
            }
            if (i2 == 5) {
                return f171952c;
            }
            bxxk bxxk = f171953e;
            if (bxxk == null) {
                synchronized (bzzc.class) {
                    bxxk = f171953e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171952c);
                        f171953e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
