package p000;

/* renamed from: butn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final butn f154857c;

    /* renamed from: d */
    private static volatile bxxk f154858d;

    /* renamed from: a */
    public int f154859a;

    /* renamed from: b */
    public String f154860b = "";

    static {
        butn butn = new butn();
        f154857c = butn;
        GeneratedMessageLite.m124024a(butn.class, butn);
    }

    private butn() {
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
            return GeneratedMessageLite.m124022a(f154857c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new butn();
        } else {
            if (i2 == 4) {
                return new bxvd(f154857c);
            }
            if (i2 == 5) {
                return f154857c;
            }
            bxxk bxxk = f154858d;
            if (bxxk == null) {
                synchronized (butn.class) {
                    bxxk = f154858d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154857c);
                        f154858d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
