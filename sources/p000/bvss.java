package p000;

/* renamed from: bvss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvss extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvss f157525a;

    /* renamed from: b */
    private static volatile bxxk f157526b;

    static {
        bvss bvss = new bvss();
        f157525a = bvss;
        GeneratedMessageLite.m124024a(bvss.class, bvss);
    }

    private bvss() {
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
            return GeneratedMessageLite.m124022a(f157525a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvss();
        }
        if (i2 == 4) {
            return new bxvd(f157525a);
        }
        if (i2 == 5) {
            return f157525a;
        }
        bxxk bxxk = f157526b;
        if (bxxk == null) {
            synchronized (bvss.class) {
                bxxk = f157526b;
                if (bxxk == null) {
                    bxxk = new bxve(f157525a);
                    f157526b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
