package p000;

/* renamed from: cbgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbgm f177046c;

    /* renamed from: d */
    private static volatile bxxk f177047d;

    /* renamed from: a */
    public int f177048a;

    /* renamed from: b */
    public String f177049b = "";

    static {
        cbgm cbgm = new cbgm();
        f177046c = cbgm;
        GeneratedMessageLite.m124024a(cbgm.class, cbgm);
    }

    private cbgm() {
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
            return GeneratedMessageLite.m124022a(f177046c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f177046c);
            }
            if (i2 == 5) {
                return f177046c;
            }
            bxxk bxxk = f177047d;
            if (bxxk == null) {
                synchronized (cbgm.class) {
                    bxxk = f177047d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177046c);
                        f177047d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
