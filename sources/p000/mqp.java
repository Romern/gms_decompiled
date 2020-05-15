package p000;

/* renamed from: mqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final mqp f34333g;

    /* renamed from: h */
    private static volatile bxxk f34334h;

    /* renamed from: a */
    public int f34335a;

    /* renamed from: b */
    public long f34336b;

    /* renamed from: c */
    public long f34337c;

    /* renamed from: d */
    public int f34338d;

    /* renamed from: e */
    public int f34339e;

    /* renamed from: f */
    public int f34340f;

    static {
        mqp mqp = new mqp();
        f34333g = mqp;
        GeneratedMessageLite.m124024a(mqp.class, mqp);
    }

    private mqp() {
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
            return GeneratedMessageLite.m124022a(f34333g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new mqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f34333g);
            }
            if (i2 == 5) {
                return f34333g;
            }
            bxxk bxxk = f34334h;
            if (bxxk == null) {
                synchronized (mqp.class) {
                    bxxk = f34334h;
                    if (bxxk == null) {
                        bxxk = new bxve(f34333g);
                        f34334h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
