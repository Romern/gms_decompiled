package p000;

/* renamed from: bynb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bynb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bynb f167101a;

    /* renamed from: b */
    private static volatile bxxk f167102b;

    static {
        bynb bynb = new bynb();
        f167101a = bynb;
        GeneratedMessageLite.m124024a(bynb.class, bynb);
    }

    private bynb() {
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
            return GeneratedMessageLite.m124022a(f167101a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bynb();
        }
        if (i2 == 4) {
            return new bxvd(f167101a);
        }
        if (i2 == 5) {
            return f167101a;
        }
        bxxk bxxk = f167102b;
        if (bxxk == null) {
            synchronized (bynb.class) {
                bxxk = f167102b;
                if (bxxk == null) {
                    bxxk = new bxve(f167101a);
                    f167102b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
