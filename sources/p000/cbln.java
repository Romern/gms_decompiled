package p000;

/* renamed from: cbln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbln extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbln f177535e;

    /* renamed from: f */
    private static volatile bxxk f177536f;

    /* renamed from: a */
    public cbmo f177537a;

    /* renamed from: b */
    public cbld f177538b;

    /* renamed from: c */
    public int f177539c;

    /* renamed from: d */
    public String f177540d = "";

    static {
        cbln cbln = new cbln();
        f177535e = cbln;
        GeneratedMessageLite.m124024a(cbln.class, cbln);
    }

    private cbln() {
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
            return GeneratedMessageLite.m124022a(f177535e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbln();
        } else {
            if (i2 == 4) {
                return new bxvd(f177535e);
            }
            if (i2 == 5) {
                return f177535e;
            }
            bxxk bxxk = f177536f;
            if (bxxk == null) {
                synchronized (cbln.class) {
                    bxxk = f177536f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177535e);
                        f177536f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
