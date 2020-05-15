package p000;

/* renamed from: bpgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpgl f137508c;

    /* renamed from: d */
    private static volatile bxxk f137509d;

    /* renamed from: a */
    public int f137510a;

    /* renamed from: b */
    public int f137511b;

    static {
        bpgl bpgl = new bpgl();
        f137508c = bpgl;
        GeneratedMessageLite.m124024a(bpgl.class, bpgl);
    }

    private bpgl() {
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
            return GeneratedMessageLite.m124022a(f137508c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f137508c);
            }
            if (i2 == 5) {
                return f137508c;
            }
            bxxk bxxk = f137509d;
            if (bxxk == null) {
                synchronized (bpgl.class) {
                    bxxk = f137509d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137508c);
                        f137509d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
