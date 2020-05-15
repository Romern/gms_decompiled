package p000;

/* renamed from: bwbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwbw f158785c;

    /* renamed from: d */
    private static volatile bxxk f158786d;

    /* renamed from: a */
    public bxyk f158787a;

    /* renamed from: b */
    public bwbt f158788b;

    static {
        bwbw bwbw = new bwbw();
        f158785c = bwbw;
        GeneratedMessageLite.m124024a(bwbw.class, bwbw);
    }

    private bwbw() {
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
            return GeneratedMessageLite.m124022a(f158785c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwbw();
        } else {
            if (i2 == 4) {
                return new bxvd(f158785c);
            }
            if (i2 == 5) {
                return f158785c;
            }
            bxxk bxxk = f158786d;
            if (bxxk == null) {
                synchronized (bwbw.class) {
                    bxxk = f158786d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158785c);
                        f158786d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
