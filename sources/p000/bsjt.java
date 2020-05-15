package p000;

/* renamed from: bsjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsjt f144845c;

    /* renamed from: d */
    private static volatile bxxk f144846d;

    /* renamed from: a */
    public int f144847a = 0;

    /* renamed from: b */
    public Object f144848b;

    static {
        bsjt bsjt = new bsjt();
        f144845c = bsjt;
        GeneratedMessageLite.m124024a(bsjt.class, bsjt);
    }

    private bsjt() {
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
            return GeneratedMessageLite.m124022a(f144845c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", bsjo.class});
        } else if (i2 == 3) {
            return new bsjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f144845c);
            }
            if (i2 == 5) {
                return f144845c;
            }
            bxxk bxxk = f144846d;
            if (bxxk == null) {
                synchronized (bsjt.class) {
                    bxxk = f144846d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144845c);
                        f144846d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
