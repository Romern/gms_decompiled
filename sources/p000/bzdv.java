package p000;

/* renamed from: bzdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzdv f169582g;

    /* renamed from: h */
    private static volatile bxxk f169583h;

    /* renamed from: a */
    public int f169584a;

    /* renamed from: b */
    public int f169585b;

    /* renamed from: c */
    public int f169586c;

    /* renamed from: d */
    public int f169587d;

    /* renamed from: e */
    public boolean f169588e;

    /* renamed from: f */
    public int f169589f;

    static {
        bzdv bzdv = new bzdv();
        f169582g = bzdv;
        GeneratedMessageLite.m124024a(bzdv.class, bzdv);
    }

    private bzdv() {
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
            return GeneratedMessageLite.m124022a(f169582g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0007\u0006\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f169582g);
            }
            if (i2 == 5) {
                return f169582g;
            }
            bxxk bxxk = f169583h;
            if (bxxk == null) {
                synchronized (bzdv.class) {
                    bxxk = f169583h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169582g);
                        f169583h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
