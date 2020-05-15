package p000;

/* renamed from: bwtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwtn f160974a;

    /* renamed from: b */
    private static volatile bxxk f160975b;

    static {
        bwtn bwtn = new bwtn();
        f160974a = bwtn;
        GeneratedMessageLite.m124024a(bwtn.class, bwtn);
    }

    private bwtn() {
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
            return GeneratedMessageLite.m124022a(f160974a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwtn();
        }
        if (i2 == 4) {
            return new bxvd(f160974a);
        }
        if (i2 == 5) {
            return f160974a;
        }
        bxxk bxxk = f160975b;
        if (bxxk == null) {
            synchronized (bwtn.class) {
                bxxk = f160975b;
                if (bxxk == null) {
                    bxxk = new bxve(f160974a);
                    f160975b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
