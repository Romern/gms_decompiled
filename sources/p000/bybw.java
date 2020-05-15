package p000;

/* renamed from: bybw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bybw f165603b;

    /* renamed from: c */
    private static volatile bxxk f165604c;

    /* renamed from: a */
    public String f165605a = "";

    static {
        bybw bybw = new bybw();
        f165603b = bybw;
        GeneratedMessageLite.m124024a(bybw.class, bybw);
    }

    private bybw() {
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
            return GeneratedMessageLite.m124022a(f165603b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bybw();
        } else {
            if (i2 == 4) {
                return new bxvd(f165603b);
            }
            if (i2 == 5) {
                return f165603b;
            }
            bxxk bxxk = f165604c;
            if (bxxk == null) {
                synchronized (bybw.class) {
                    bxxk = f165604c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165603b);
                        f165604c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
