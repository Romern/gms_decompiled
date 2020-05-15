package p000;

/* renamed from: cioh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cioh f191060e;

    /* renamed from: f */
    private static volatile bxxk f191061f;

    /* renamed from: a */
    public int f191062a;

    /* renamed from: b */
    public int f191063b;

    /* renamed from: c */
    public int f191064c;

    /* renamed from: d */
    public int f191065d;

    static {
        cioh cioh = new cioh();
        f191060e = cioh;
        GeneratedMessageLite.m124024a(cioh.class, cioh);
    }

    private cioh() {
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
            return GeneratedMessageLite.m124022a(f191060e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cioh();
        } else {
            if (i2 == 4) {
                return new bxvd(f191060e);
            }
            if (i2 == 5) {
                return f191060e;
            }
            bxxk bxxk = f191061f;
            if (bxxk == null) {
                synchronized (cioh.class) {
                    bxxk = f191061f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191060e);
                        f191061f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
