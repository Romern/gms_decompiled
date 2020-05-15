package p000;

/* renamed from: bxfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxfy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxfy f163211d;

    /* renamed from: e */
    private static volatile bxxk f163212e;

    /* renamed from: a */
    public int f163213a;

    /* renamed from: b */
    public bxhw f163214b;

    /* renamed from: c */
    public bxfu f163215c;

    static {
        bxfy bxfy = new bxfy();
        f163211d = bxfy;
        GeneratedMessageLite.m124024a(bxfy.class, bxfy);
    }

    private bxfy() {
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
            return GeneratedMessageLite.m124022a(f163211d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f163211d);
            }
            if (i2 == 5) {
                return f163211d;
            }
            bxxk bxxk = f163212e;
            if (bxxk == null) {
                synchronized (bxfy.class) {
                    bxxk = f163212e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163211d);
                        f163212e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
