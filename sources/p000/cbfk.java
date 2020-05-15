package p000;

/* renamed from: cbfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbfk f176928b;

    /* renamed from: c */
    private static volatile bxxk f176929c;

    /* renamed from: a */
    public String f176930a = "";

    static {
        cbfk cbfk = new cbfk();
        f176928b = cbfk;
        GeneratedMessageLite.m124024a(cbfk.class, cbfk);
    }

    private cbfk() {
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
            return GeneratedMessageLite.m124022a(f176928b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f176928b);
            }
            if (i2 == 5) {
                return f176928b;
            }
            bxxk bxxk = f176929c;
            if (bxxk == null) {
                synchronized (cbfk.class) {
                    bxxk = f176929c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176928b);
                        f176929c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
