package p000;

/* renamed from: cbee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbee extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbee f176834b;

    /* renamed from: c */
    private static volatile bxxk f176835c;

    /* renamed from: a */
    public String f176836a = "";

    static {
        cbee cbee = new cbee();
        f176834b = cbee;
        GeneratedMessageLite.m124024a(cbee.class, cbee);
    }

    private cbee() {
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
            return GeneratedMessageLite.m124022a(f176834b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbee();
        } else {
            if (i2 == 4) {
                return new bxvd(f176834b);
            }
            if (i2 == 5) {
                return f176834b;
            }
            bxxk bxxk = f176835c;
            if (bxxk == null) {
                synchronized (cbee.class) {
                    bxxk = f176835c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176834b);
                        f176835c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
