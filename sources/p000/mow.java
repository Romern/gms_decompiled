package p000;

/* renamed from: mow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mow extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mow f34080c;

    /* renamed from: d */
    private static volatile bxxk f34081d;

    /* renamed from: a */
    public int f34082a;

    /* renamed from: b */
    public String f34083b = "";

    static {
        mow mow = new mow();
        f34080c = mow;
        GeneratedMessageLite.m124024a(mow.class, mow);
    }

    private mow() {
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
            return GeneratedMessageLite.m124022a(f34080c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new mow();
        } else {
            if (i2 == 4) {
                return new bxvd(f34080c);
            }
            if (i2 == 5) {
                return f34080c;
            }
            bxxk bxxk = f34081d;
            if (bxxk == null) {
                synchronized (mow.class) {
                    bxxk = f34081d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34080c);
                        f34081d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
