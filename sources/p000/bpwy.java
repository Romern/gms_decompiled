package p000;

/* renamed from: bpwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpwy f139590c;

    /* renamed from: d */
    private static volatile bxxk f139591d;

    /* renamed from: a */
    public int f139592a;

    /* renamed from: b */
    public String f139593b = "";

    static {
        bpwy bpwy = new bpwy();
        f139590c = bpwy;
        GeneratedMessageLite.m124024a(bpwy.class, bpwy);
    }

    private bpwy() {
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
            return GeneratedMessageLite.m124022a(f139590c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpwy();
        } else {
            if (i2 == 4) {
                return new bxvd(f139590c);
            }
            if (i2 == 5) {
                return f139590c;
            }
            bxxk bxxk = f139591d;
            if (bxxk == null) {
                synchronized (bpwy.class) {
                    bxxk = f139591d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139590c);
                        f139591d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
