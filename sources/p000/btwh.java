package p000;

/* renamed from: btwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btwh f152703a;

    /* renamed from: b */
    private static volatile bxxk f152704b;

    static {
        btwh btwh = new btwh();
        f152703a = btwh;
        GeneratedMessageLite.m124024a(btwh.class, btwh);
    }

    private btwh() {
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
            return GeneratedMessageLite.m124022a(f152703a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwh();
        }
        if (i2 == 4) {
            return new bxvd(f152703a);
        }
        if (i2 == 5) {
            return f152703a;
        }
        bxxk bxxk = f152704b;
        if (bxxk == null) {
            synchronized (btwh.class) {
                bxxk = f152704b;
                if (bxxk == null) {
                    bxxk = new bxve(f152703a);
                    f152704b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
