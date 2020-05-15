package p000;

/* renamed from: bwll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwll extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwll f160150c;

    /* renamed from: e */
    private static volatile bxxk f160151e;

    /* renamed from: a */
    public int f160152a;

    /* renamed from: b */
    public bmkw f160153b;

    /* renamed from: d */
    private byte f160154d = 2;

    static {
        bwll bwll = new bwll();
        f160150c = bwll;
        GeneratedMessageLite.m124024a(bwll.class, bwll);
    }

    private bwll() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160154d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160154d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160150c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwll();
        } else {
            if (i2 == 4) {
                return new bxvd(f160150c);
            }
            if (i2 == 5) {
                return f160150c;
            }
            bxxk bxxk = f160151e;
            if (bxxk == null) {
                synchronized (bwll.class) {
                    bxxk = f160151e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160150c);
                        f160151e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
