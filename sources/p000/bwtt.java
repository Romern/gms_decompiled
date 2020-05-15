package p000;

/* renamed from: bwtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwtt f160992e;

    /* renamed from: f */
    private static volatile bxxk f160993f;

    /* renamed from: a */
    public int f160994a;

    /* renamed from: b */
    public int f160995b;

    /* renamed from: c */
    public bxvt f160996c = bxvm.f164965b;

    /* renamed from: d */
    public bwya f160997d;

    static {
        bwtt bwtt = new bwtt();
        f160992e = bwtt;
        GeneratedMessageLite.m124024a(bwtt.class, bwtt);
    }

    private bwtt() {
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
            return GeneratedMessageLite.m124022a(f160992e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001d\u0003ဉ\u0001", new Object[]{"a", "b", bwtr.f160991a, "c", "d"});
        } else if (i2 == 3) {
            return new bwtt();
        } else {
            if (i2 == 4) {
                return new bxvd(f160992e);
            }
            if (i2 == 5) {
                return f160992e;
            }
            bxxk bxxk = f160993f;
            if (bxxk == null) {
                synchronized (bwtt.class) {
                    bxxk = f160993f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160992e);
                        f160993f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
