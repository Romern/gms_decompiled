package p000;

/* renamed from: bwkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwkt f160035d;

    /* renamed from: e */
    private static volatile bxxk f160036e;

    /* renamed from: a */
    public int f160037a;

    /* renamed from: b */
    public bmaj f160038b;

    /* renamed from: c */
    public bwks f160039c;

    static {
        bwkt bwkt = new bwkt();
        f160035d = bwkt;
        GeneratedMessageLite.m124024a(bwkt.class, bwkt);
    }

    private bwkt() {
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
            return GeneratedMessageLite.m124022a(f160035d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwkt();
        } else {
            if (i2 == 4) {
                return new bxvd(f160035d);
            }
            if (i2 == 5) {
                return f160035d;
            }
            bxxk bxxk = f160036e;
            if (bxxk == null) {
                synchronized (bwkt.class) {
                    bxxk = f160036e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160035d);
                        f160036e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
