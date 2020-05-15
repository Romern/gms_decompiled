package p000;

/* renamed from: camg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final camg f175267d;

    /* renamed from: e */
    private static volatile bxxk f175268e;

    /* renamed from: a */
    public camm f175269a;

    /* renamed from: b */
    public String f175270b = "";

    /* renamed from: c */
    public String f175271c = "";

    static {
        camg camg = new camg();
        f175267d = camg;
        GeneratedMessageLite.m124024a(camg.class, camg);
    }

    private camg() {
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
            return GeneratedMessageLite.m124022a(f175267d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new camg();
        } else {
            if (i2 == 4) {
                return new bxvd(f175267d);
            }
            if (i2 == 5) {
                return f175267d;
            }
            bxxk bxxk = f175268e;
            if (bxxk == null) {
                synchronized (camg.class) {
                    bxxk = f175268e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175267d);
                        f175268e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
