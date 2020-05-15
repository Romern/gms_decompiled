package p000;

/* renamed from: cbmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbmi f177625e;

    /* renamed from: f */
    private static volatile bxxk f177626f;

    /* renamed from: a */
    public bxye f177627a;

    /* renamed from: b */
    public cbme f177628b;

    /* renamed from: c */
    public bxty f177629c;

    /* renamed from: d */
    public bxye f177630d;

    static {
        cbmi cbmi = new cbmi();
        f177625e = cbmi;
        GeneratedMessageLite.m124024a(cbmi.class, cbmi);
    }

    private cbmi() {
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
            return GeneratedMessageLite.m124022a(f177625e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0003\t\u0005\t\u0006\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f177625e);
            }
            if (i2 == 5) {
                return f177625e;
            }
            bxxk bxxk = f177626f;
            if (bxxk == null) {
                synchronized (cbmi.class) {
                    bxxk = f177626f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177625e);
                        f177626f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
