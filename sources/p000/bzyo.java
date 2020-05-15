package p000;

/* renamed from: bzyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzyo f171909c;

    /* renamed from: d */
    private static volatile bxxk f171910d;

    /* renamed from: a */
    public String f171911a = "";

    /* renamed from: b */
    public String f171912b = "";

    static {
        bzyo bzyo = new bzyo();
        f171909c = bzyo;
        GeneratedMessageLite.m124024a(bzyo.class, bzyo);
    }

    private bzyo() {
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
            return GeneratedMessageLite.m124022a(f171909c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171909c);
            }
            if (i2 == 5) {
                return f171909c;
            }
            bxxk bxxk = f171910d;
            if (bxxk == null) {
                synchronized (bzyo.class) {
                    bxxk = f171910d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171909c);
                        f171910d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
