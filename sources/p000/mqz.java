package p000;

/* renamed from: mqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mqz f34374c;

    /* renamed from: d */
    private static volatile bxxk f34375d;

    /* renamed from: a */
    public int f34376a;

    /* renamed from: b */
    public String f34377b = "";

    static {
        mqz mqz = new mqz();
        f34374c = mqz;
        GeneratedMessageLite.m124024a(mqz.class, mqz);
    }

    private mqz() {
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
            return GeneratedMessageLite.m124022a(f34374c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new mqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f34374c);
            }
            if (i2 == 5) {
                return f34374c;
            }
            bxxk bxxk = f34375d;
            if (bxxk == null) {
                synchronized (mqz.class) {
                    bxxk = f34375d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34374c);
                        f34375d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
