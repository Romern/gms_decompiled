package p000;

/* renamed from: bsoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsoo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsoo f146410c;

    /* renamed from: d */
    private static volatile bxxk f146411d;

    /* renamed from: a */
    public int f146412a;

    /* renamed from: b */
    public int f146413b;

    static {
        bsoo bsoo = new bsoo();
        f146410c = bsoo;
        GeneratedMessageLite.m124024a(bsoo.class, bsoo);
    }

    private bsoo() {
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
            return GeneratedMessageLite.m124022a(f146410c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bsop.f146414a});
        } else if (i2 == 3) {
            return new bsoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f146410c);
            }
            if (i2 == 5) {
                return f146410c;
            }
            bxxk bxxk = f146411d;
            if (bxxk == null) {
                synchronized (bsoo.class) {
                    bxxk = f146411d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146410c);
                        f146411d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
