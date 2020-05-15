package p000;

/* renamed from: ahyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ahyu f68386b;

    /* renamed from: c */
    private static volatile bxxk f68387c;

    /* renamed from: a */
    public bxwc f68388a = bxxn.f165040b;

    static {
        ahyu ahyu = new ahyu();
        f68386b = ahyu;
        GeneratedMessageLite.m124024a(ahyu.class, ahyu);
    }

    private ahyu() {
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
            return GeneratedMessageLite.m124022a(f68386b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvkr.class});
        } else if (i2 == 3) {
            return new ahyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f68386b);
            }
            if (i2 == 5) {
                return f68386b;
            }
            bxxk bxxk = f68387c;
            if (bxxk == null) {
                synchronized (ahyu.class) {
                    bxxk = f68387c;
                    if (bxxk == null) {
                        bxxk = new bxve(f68386b);
                        f68387c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
