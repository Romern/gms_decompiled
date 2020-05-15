package p000;

/* renamed from: bzmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzmx f170673d;

    /* renamed from: e */
    private static volatile bxxk f170674e;

    /* renamed from: a */
    public int f170675a;

    /* renamed from: b */
    public bzmh f170676b;

    /* renamed from: c */
    public bzmf f170677c;

    static {
        bzmx bzmx = new bzmx();
        f170673d = bzmx;
        GeneratedMessageLite.m124024a(bzmx.class, bzmx);
    }

    private bzmx() {
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
            return GeneratedMessageLite.m124022a(f170673d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0000", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new bzmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f170673d);
            }
            if (i2 == 5) {
                return f170673d;
            }
            bxxk bxxk = f170674e;
            if (bxxk == null) {
                synchronized (bzmx.class) {
                    bxxk = f170674e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170673d);
                        f170674e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
