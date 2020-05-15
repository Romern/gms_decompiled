package p000;

/* renamed from: blde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blde extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blde f126049d;

    /* renamed from: f */
    private static volatile bxxk f126050f;

    /* renamed from: a */
    public int f126051a;

    /* renamed from: b */
    public String f126052b = "";

    /* renamed from: c */
    public bldd f126053c;

    /* renamed from: e */
    private byte f126054e = 2;

    static {
        blde blde = new blde();
        f126049d = blde;
        GeneratedMessageLite.m124024a(blde.class, blde);
    }

    private blde() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126054e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126054e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126049d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0001\u0005ဈ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blde();
        } else {
            if (i2 == 4) {
                return new bxvd(f126049d);
            }
            if (i2 == 5) {
                return f126049d;
            }
            bxxk bxxk = f126050f;
            if (bxxk == null) {
                synchronized (blde.class) {
                    bxxk = f126050f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126049d);
                        f126050f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
