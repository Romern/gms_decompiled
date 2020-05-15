package p000;

/* renamed from: btlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btlx f149451b;

    /* renamed from: c */
    private static volatile bxxk f149452c;

    /* renamed from: a */
    public String f149453a = "";

    static {
        btlx btlx = new btlx();
        f149451b = btlx;
        GeneratedMessageLite.m124024a(btlx.class, btlx);
    }

    private btlx() {
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
            return GeneratedMessageLite.m124022a(f149451b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btlx();
        } else {
            if (i2 == 4) {
                return new bxvd(f149451b);
            }
            if (i2 == 5) {
                return f149451b;
            }
            bxxk bxxk = f149452c;
            if (bxxk == null) {
                synchronized (btlx.class) {
                    bxxk = f149452c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149451b);
                        f149452c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
