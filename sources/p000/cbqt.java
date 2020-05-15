package p000;

/* renamed from: cbqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbqt f178065e;

    /* renamed from: f */
    private static volatile bxxk f178066f;

    /* renamed from: a */
    public String f178067a = "";

    /* renamed from: b */
    public long f178068b;

    /* renamed from: c */
    public cbqc f178069c;

    /* renamed from: d */
    public String f178070d = "";

    static {
        cbqt cbqt = new cbqt();
        f178065e = cbqt;
        GeneratedMessageLite.m124024a(cbqt.class, cbqt);
    }

    private cbqt() {
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
            return GeneratedMessageLite.m124022a(f178065e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\t\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f178065e);
            }
            if (i2 == 5) {
                return f178065e;
            }
            bxxk bxxk = f178066f;
            if (bxxk == null) {
                synchronized (cbqt.class) {
                    bxxk = f178066f;
                    if (bxxk == null) {
                        bxxk = new bxve(f178065e);
                        f178066f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
