package p000;

/* renamed from: cbhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbhl f177143f;

    /* renamed from: g */
    private static volatile bxxk f177144g;

    /* renamed from: a */
    public String f177145a = "";

    /* renamed from: b */
    public cbht f177146b;

    /* renamed from: c */
    public cbhr f177147c;

    /* renamed from: d */
    public cbhk f177148d;

    /* renamed from: e */
    public cbhq f177149e;

    static {
        cbhl cbhl = new cbhl();
        f177143f = cbhl;
        GeneratedMessageLite.m124024a(cbhl.class, cbhl);
    }

    private cbhl() {
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
            return GeneratedMessageLite.m124022a(f177143f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbhl();
        } else {
            if (i2 == 4) {
                return new bxvd(f177143f);
            }
            if (i2 == 5) {
                return f177143f;
            }
            bxxk bxxk = f177144g;
            if (bxxk == null) {
                synchronized (cbhl.class) {
                    bxxk = f177144g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177143f);
                        f177144g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
