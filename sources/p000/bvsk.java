package p000;

/* renamed from: bvsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsk f157496a;

    /* renamed from: b */
    private static volatile bxxk f157497b;

    static {
        bvsk bvsk = new bvsk();
        f157496a = bvsk;
        GeneratedMessageLite.m124024a(bvsk.class, bvsk);
    }

    private bvsk() {
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
            return GeneratedMessageLite.m124022a(f157496a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsk();
        }
        if (i2 == 4) {
            return new bxvd(f157496a);
        }
        if (i2 == 5) {
            return f157496a;
        }
        bxxk bxxk = f157497b;
        if (bxxk == null) {
            synchronized (bvsk.class) {
                bxxk = f157497b;
                if (bxxk == null) {
                    bxxk = new bxve(f157496a);
                    f157497b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
