package p000;

/* renamed from: bmvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmvc f131016c;

    /* renamed from: d */
    private static volatile bxxk f131017d;

    /* renamed from: a */
    public int f131018a;

    /* renamed from: b */
    public bmvd f131019b;

    static {
        bmvc bmvc = new bmvc();
        f131016c = bmvc;
        bxvk.m124024a(bmvc.class, bmvc);
    }

    private bmvc() {
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
            return bxvk.m124022a(f131016c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmvc();
        } else {
            if (i2 == 4) {
                return new bxvd(f131016c);
            }
            if (i2 == 5) {
                return f131016c;
            }
            bxxk bxxk = f131017d;
            if (bxxk == null) {
                synchronized (bmvc.class) {
                    bxxk = f131017d;
                    if (bxxk == null) {
                        bxxk = new bxve(f131016c);
                        f131017d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
