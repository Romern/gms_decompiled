package p000;

/* renamed from: bpyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyl extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpyl f139877i;

    /* renamed from: j */
    private static volatile bxxk f139878j;

    /* renamed from: a */
    public int f139879a;

    /* renamed from: b */
    public int f139880b;

    /* renamed from: c */
    public long f139881c;

    /* renamed from: d */
    public int f139882d;

    /* renamed from: e */
    public long f139883e;

    /* renamed from: f */
    public String f139884f = "";

    /* renamed from: g */
    public String f139885g = "";

    /* renamed from: h */
    public boolean f139886h;

    static {
        bpyl bpyl = new bpyl();
        f139877i = bpyl;
        GeneratedMessageLite.m124024a(bpyl.class, bpyl);
    }

    private bpyl() {
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
            return GeneratedMessageLite.m124022a(f139877i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003င\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f139877i);
            }
            if (i2 == 5) {
                return f139877i;
            }
            bxxk bxxk = f139878j;
            if (bxxk == null) {
                synchronized (bpyl.class) {
                    bxxk = f139878j;
                    if (bxxk == null) {
                        bxxk = new bxve(f139877i);
                        f139878j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
