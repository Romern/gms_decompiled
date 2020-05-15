package p000;

/* renamed from: bztn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bztn f171350b;

    /* renamed from: c */
    private static volatile bxxk f171351c;

    /* renamed from: a */
    public String f171352a = "";

    static {
        bztn bztn = new bztn();
        f171350b = bztn;
        GeneratedMessageLite.m124024a(bztn.class, bztn);
    }

    private bztn() {
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
            return GeneratedMessageLite.m124022a(f171350b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171350b);
            }
            if (i2 == 5) {
                return f171350b;
            }
            bxxk bxxk = f171351c;
            if (bxxk == null) {
                synchronized (bztn.class) {
                    bxxk = f171351c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171350b);
                        f171351c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
