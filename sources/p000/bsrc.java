package p000;

/* renamed from: bsrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsrc f146733d;

    /* renamed from: e */
    private static volatile bxxk f146734e;

    /* renamed from: a */
    public int f146735a;

    /* renamed from: b */
    public bsrb f146736b;

    /* renamed from: c */
    public bsra f146737c;

    static {
        bsrc bsrc = new bsrc();
        f146733d = bsrc;
        GeneratedMessageLite.m124024a(bsrc.class, bsrc);
    }

    private bsrc() {
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
            return GeneratedMessageLite.m124022a(f146733d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f146733d);
            }
            if (i2 == 5) {
                return f146733d;
            }
            bxxk bxxk = f146734e;
            if (bxxk == null) {
                synchronized (bsrc.class) {
                    bxxk = f146734e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146733d);
                        f146734e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
