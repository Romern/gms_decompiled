package p000;

/* renamed from: bwwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwi extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bwwi f161240i;

    /* renamed from: k */
    private static volatile bxxk f161241k;

    /* renamed from: a */
    public boolean f161242a;

    /* renamed from: b */
    public boolean f161243b;

    /* renamed from: c */
    public boolean f161244c;

    /* renamed from: d */
    public boolean f161245d;

    /* renamed from: e */
    public boolean f161246e;

    /* renamed from: f */
    public boolean f161247f;

    /* renamed from: g */
    public boolean f161248g;

    /* renamed from: h */
    public boolean f161249h;

    /* renamed from: j */
    private int f161250j;

    static {
        bwwi bwwi = new bwwi();
        f161240i = bwwi;
        GeneratedMessageLite.m124024a(bwwi.class, bwwi);
    }

    private bwwi() {
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
            return GeneratedMessageLite.m124022a(f161240i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bwwi();
        } else {
            if (i2 == 4) {
                return new bxvd(f161240i);
            }
            if (i2 == 5) {
                return f161240i;
            }
            bxxk bxxk = f161241k;
            if (bxxk == null) {
                synchronized (bwwi.class) {
                    bxxk = f161241k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161240i);
                        f161241k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
