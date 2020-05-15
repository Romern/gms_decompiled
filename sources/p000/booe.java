package p000;

/* renamed from: booe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final booe f133904c;

    /* renamed from: d */
    private static volatile bxxk f133905d;

    /* renamed from: a */
    public bxwc f133906a = bxxn.f165040b;

    /* renamed from: b */
    public int f133907b;

    static {
        booe booe = new booe();
        f133904c = booe;
        bxvk.m124024a(booe.class, booe);
    }

    private booe() {
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
            return bxvk.m124022a(f133904c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"a", bopk.class, "b"});
        } else if (i2 == 3) {
            return new booe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133904c;
            }
            bxxk bxxk = f133905d;
            if (bxxk == null) {
                synchronized (booe.class) {
                    bxxk = f133905d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133904c);
                        f133905d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
