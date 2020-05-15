package p000;

/* renamed from: kpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kpa f24655c;

    /* renamed from: d */
    private static volatile bxxk f24656d;

    /* renamed from: a */
    public int f24657a;

    /* renamed from: b */
    public int f24658b;

    static {
        kpa kpa = new kpa();
        f24655c = kpa;
        GeneratedMessageLite.m124024a(kpa.class, kpa);
    }

    private kpa() {
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
            return GeneratedMessageLite.m124022a(f24655c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kpa();
        } else {
            if (i2 == 4) {
                return new bxvd(f24655c);
            }
            if (i2 == 5) {
                return f24655c;
            }
            bxxk bxxk = f24656d;
            if (bxxk == null) {
                synchronized (kpa.class) {
                    bxxk = f24656d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24655c);
                        f24656d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
