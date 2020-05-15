package p000;

/* renamed from: bpod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpod extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpod f138479i;

    /* renamed from: j */
    private static volatile bxxk f138480j;

    /* renamed from: a */
    public int f138481a;

    /* renamed from: b */
    public int f138482b;

    /* renamed from: c */
    public int f138483c;

    /* renamed from: d */
    public int f138484d;

    /* renamed from: e */
    public int f138485e;

    /* renamed from: f */
    public int f138486f;

    /* renamed from: g */
    public int f138487g;

    /* renamed from: h */
    public int f138488h;

    static {
        bpod bpod = new bpod();
        f138479i = bpod;
        GeneratedMessageLite.m124024a(bpod.class, bpod);
    }

    private bpod() {
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
            return GeneratedMessageLite.m124022a(f138479i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpod();
        } else {
            if (i2 == 4) {
                return new bxvd(f138479i);
            }
            if (i2 == 5) {
                return f138479i;
            }
            bxxk bxxk = f138480j;
            if (bxxk == null) {
                synchronized (bpod.class) {
                    bxxk = f138480j;
                    if (bxxk == null) {
                        bxxk = new bxve(f138479i);
                        f138480j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
