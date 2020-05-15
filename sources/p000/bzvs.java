package p000;

/* renamed from: bzvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzvs f171544b;

    /* renamed from: c */
    private static volatile bxxk f171545c;

    /* renamed from: a */
    public bxwc f171546a = bxxn.f165040b;

    static {
        bzvs bzvs = new bzvs();
        f171544b = bzvs;
        GeneratedMessageLite.m124024a(bzvs.class, bzvs);
    }

    private bzvs() {
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
            return GeneratedMessageLite.m124022a(f171544b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzvq.class});
        } else if (i2 == 3) {
            return new bzvs();
        } else {
            if (i2 == 4) {
                return new bzvr();
            }
            if (i2 == 5) {
                return f171544b;
            }
            bxxk bxxk = f171545c;
            if (bxxk == null) {
                synchronized (bzvs.class) {
                    bxxk = f171545c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171544b);
                        f171545c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
