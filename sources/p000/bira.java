package p000;

/* renamed from: bira */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bira extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bira f121370d;

    /* renamed from: e */
    private static volatile bxxk f121371e;

    /* renamed from: a */
    public int f121372a;

    /* renamed from: b */
    public int f121373b;

    /* renamed from: c */
    public int f121374c;

    static {
        bira bira = new bira();
        f121370d = bira;
        GeneratedMessageLite.m124024a(bira.class, bira);
    }

    private bira() {
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
            return GeneratedMessageLite.m124022a(f121370d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bira();
        } else {
            if (i2 == 4) {
                return new bxvd(f121370d);
            }
            if (i2 == 5) {
                return f121370d;
            }
            bxxk bxxk = f121371e;
            if (bxxk == null) {
                synchronized (bira.class) {
                    bxxk = f121371e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121370d);
                        f121371e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
