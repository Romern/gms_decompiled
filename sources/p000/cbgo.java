package p000;

/* renamed from: cbgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbgo f177056f;

    /* renamed from: g */
    private static volatile bxxk f177057g;

    /* renamed from: a */
    public cbmo f177058a;

    /* renamed from: b */
    public String f177059b = "";

    /* renamed from: c */
    public String f177060c = "";

    /* renamed from: d */
    public String f177061d = "";

    /* renamed from: e */
    public int f177062e;

    static {
        cbgo cbgo = new cbgo();
        f177056f = cbgo;
        GeneratedMessageLite.m124024a(cbgo.class, cbgo);
    }

    private cbgo() {
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
            return GeneratedMessageLite.m124022a(f177056f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f177056f);
            }
            if (i2 == 5) {
                return f177056f;
            }
            bxxk bxxk = f177057g;
            if (bxxk == null) {
                synchronized (cbgo.class) {
                    bxxk = f177057g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177056f);
                        f177057g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
