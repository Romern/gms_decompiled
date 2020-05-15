package p000;

/* renamed from: bpeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpeh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpeh f137274e;

    /* renamed from: f */
    private static volatile bxxk f137275f;

    /* renamed from: a */
    public int f137276a;

    /* renamed from: b */
    public int f137277b;

    /* renamed from: c */
    public int f137278c;

    /* renamed from: d */
    public int f137279d;

    static {
        bpeh bpeh = new bpeh();
        f137274e = bpeh;
        GeneratedMessageLite.m124024a(bpeh.class, bpeh);
    }

    private bpeh() {
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
            return GeneratedMessageLite.m124022a(f137274e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f137274e);
            }
            if (i2 == 5) {
                return f137274e;
            }
            bxxk bxxk = f137275f;
            if (bxxk == null) {
                synchronized (bpeh.class) {
                    bxxk = f137275f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137274e);
                        f137275f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
