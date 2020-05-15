package p000;

/* renamed from: koz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class koz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final koz f24650c;

    /* renamed from: d */
    private static volatile bxxk f24651d;

    /* renamed from: a */
    public int f24652a;

    /* renamed from: b */
    public String f24653b = "";

    static {
        koz koz = new koz();
        f24650c = koz;
        GeneratedMessageLite.m124024a(koz.class, koz);
    }

    private koz() {
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
            return GeneratedMessageLite.m124022a(f24650c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new koz();
        } else {
            if (i2 == 4) {
                return new bxvd(f24650c);
            }
            if (i2 == 5) {
                return f24650c;
            }
            bxxk bxxk = f24651d;
            if (bxxk == null) {
                synchronized (koz.class) {
                    bxxk = f24651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24650c);
                        f24651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
