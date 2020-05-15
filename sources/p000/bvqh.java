package p000;

/* renamed from: bvqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqh f157371a;

    /* renamed from: b */
    private static volatile bxxk f157372b;

    static {
        bvqh bvqh = new bvqh();
        f157371a = bvqh;
        GeneratedMessageLite.m124024a(bvqh.class, bvqh);
    }

    private bvqh() {
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
            return GeneratedMessageLite.m124022a(f157371a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqh();
        }
        if (i2 == 4) {
            return new bxvd(f157371a);
        }
        if (i2 == 5) {
            return f157371a;
        }
        bxxk bxxk = f157372b;
        if (bxxk == null) {
            synchronized (bvqh.class) {
                bxxk = f157372b;
                if (bxxk == null) {
                    bxxk = new bxve(f157371a);
                    f157372b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
