package p000;

/* renamed from: cbhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbhm f177150c;

    /* renamed from: d */
    private static volatile bxxk f177151d;

    /* renamed from: a */
    public long f177152a;

    /* renamed from: b */
    public String f177153b = "";

    static {
        cbhm cbhm = new cbhm();
        f177150c = cbhm;
        GeneratedMessageLite.m124024a(cbhm.class, cbhm);
    }

    private cbhm() {
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
            return GeneratedMessageLite.m124022a(f177150c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f177150c);
            }
            if (i2 == 5) {
                return f177150c;
            }
            bxxk bxxk = f177151d;
            if (bxxk == null) {
                synchronized (cbhm.class) {
                    bxxk = f177151d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177150c);
                        f177151d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
