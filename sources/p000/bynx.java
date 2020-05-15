package p000;

/* renamed from: bynx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bynx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bynx f167143b;

    /* renamed from: c */
    private static volatile bxxk f167144c;

    /* renamed from: a */
    public int f167145a;

    static {
        bynx bynx = new bynx();
        f167143b = bynx;
        GeneratedMessageLite.m124024a(bynx.class, bynx);
    }

    private bynx() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f167143b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bynx();
        } else {
            if (i2 == 4) {
                return new bxvd(f167143b);
            }
            if (i2 == 5) {
                return f167143b;
            }
            bxxk bxxk = f167144c;
            if (bxxk == null) {
                synchronized (bynx.class) {
                    bxxk = f167144c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167143b);
                        f167144c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
