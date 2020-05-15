package p000;

/* renamed from: cbdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbdi f176736c;

    /* renamed from: d */
    private static volatile bxxk f176737d;

    /* renamed from: a */
    public String f176738a = "";

    /* renamed from: b */
    public String f176739b = "";

    static {
        cbdi cbdi = new cbdi();
        f176736c = cbdi;
        GeneratedMessageLite.m124024a(cbdi.class, cbdi);
    }

    private cbdi() {
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
            return GeneratedMessageLite.m124022a(f176736c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbdi();
        } else {
            if (i2 == 4) {
                return new bxvd(f176736c);
            }
            if (i2 == 5) {
                return f176736c;
            }
            bxxk bxxk = f176737d;
            if (bxxk == null) {
                synchronized (cbdi.class) {
                    bxxk = f176737d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176736c);
                        f176737d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
