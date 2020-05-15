package p000;

/* renamed from: bwxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwxc f161321f;

    /* renamed from: g */
    private static volatile bxxk f161322g;

    /* renamed from: a */
    public int f161323a;

    /* renamed from: b */
    public bwya f161324b;

    /* renamed from: c */
    public bwya f161325c;

    /* renamed from: d */
    public bwya f161326d;

    /* renamed from: e */
    public bwya f161327e;

    static {
        bwxc bwxc = new bwxc();
        f161321f = bwxc;
        GeneratedMessageLite.m124024a(bwxc.class, bwxc);
    }

    private bwxc() {
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
            return GeneratedMessageLite.m124022a(f161321f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f161321f);
            }
            if (i2 == 5) {
                return f161321f;
            }
            bxxk bxxk = f161322g;
            if (bxxk == null) {
                synchronized (bwxc.class) {
                    bxxk = f161322g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161321f);
                        f161322g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
