package p000;

/* renamed from: buek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buek extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buek f153599c;

    /* renamed from: d */
    private static volatile bxxk f153600d;

    /* renamed from: a */
    public int f153601a;

    /* renamed from: b */
    public buef f153602b;

    static {
        buek buek = new buek();
        f153599c = buek;
        GeneratedMessageLite.m124024a(buek.class, buek);
    }

    private buek() {
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
            return GeneratedMessageLite.m124022a(f153599c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buek();
        } else {
            if (i2 == 4) {
                return new bxvd(f153599c);
            }
            if (i2 == 5) {
                return f153599c;
            }
            bxxk bxxk = f153600d;
            if (bxxk == null) {
                synchronized (buek.class) {
                    bxxk = f153600d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153599c);
                        f153600d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
