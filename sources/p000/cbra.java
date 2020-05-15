package p000;

/* renamed from: cbra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbra extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbra f178095c;

    /* renamed from: d */
    private static volatile bxxk f178096d;

    /* renamed from: a */
    public String f178097a = "";

    /* renamed from: b */
    public bxyk f178098b;

    static {
        cbra cbra = new cbra();
        f178095c = cbra;
        GeneratedMessageLite.m124024a(cbra.class, cbra);
    }

    private cbra() {
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
            return GeneratedMessageLite.m124022a(f178095c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbra();
        } else {
            if (i2 == 4) {
                return new bxvd(f178095c);
            }
            if (i2 == 5) {
                return f178095c;
            }
            bxxk bxxk = f178096d;
            if (bxxk == null) {
                synchronized (cbra.class) {
                    bxxk = f178096d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178095c);
                        f178096d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
