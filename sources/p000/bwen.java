package p000;

/* renamed from: bwen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwen extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bwen f159007i;

    /* renamed from: j */
    private static volatile bxxk f159008j;

    /* renamed from: a */
    public int f159009a;

    /* renamed from: b */
    public bweh f159010b;

    /* renamed from: c */
    public int f159011c = 7;

    /* renamed from: d */
    public String f159012d = "";

    /* renamed from: e */
    public String f159013e = "";

    /* renamed from: f */
    public String f159014f = "";

    /* renamed from: g */
    public bwej f159015g;

    /* renamed from: h */
    public boolean f159016h = true;

    static {
        bwen bwen = new bwen();
        f159007i = bwen;
        GeneratedMessageLite.m124024a(bwen.class, bwen);
    }

    private bwen() {
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
            return GeneratedMessageLite.m124022a(f159007i, "\u0001\u0007\u0000\u0001\u0003\u0010\u0007\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဌ\u0001\u000bဈ\u0003\fဈ\u0002\rဉ\u0005\u000eဈ\u0004\u0010ဇ\u0006", new Object[]{"a", "b", "c", bweo.f159017a, "e", "d", "g", "f", "h"});
        } else if (i2 == 3) {
            return new bwen();
        } else {
            if (i2 == 4) {
                return new bxvd(f159007i);
            }
            if (i2 == 5) {
                return f159007i;
            }
            bxxk bxxk = f159008j;
            if (bxxk == null) {
                synchronized (bwen.class) {
                    bxxk = f159008j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159007i);
                        f159008j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
