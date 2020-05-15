package p000;

/* renamed from: bzvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzvc f171507c;

    /* renamed from: d */
    private static volatile bxxk f171508d;

    /* renamed from: a */
    public bzts f171509a;

    /* renamed from: b */
    public String f171510b = "";

    static {
        bzvc bzvc = new bzvc();
        f171507c = bzvc;
        GeneratedMessageLite.m124024a(bzvc.class, bzvc);
    }

    private bzvc() {
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
            return GeneratedMessageLite.m124022a(f171507c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzvc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171507c);
            }
            if (i2 == 5) {
                return f171507c;
            }
            bxxk bxxk = f171508d;
            if (bxxk == null) {
                synchronized (bzvc.class) {
                    bxxk = f171508d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171507c);
                        f171508d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
