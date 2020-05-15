package p000;

/* renamed from: bvsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvsh f157488c;

    /* renamed from: d */
    private static volatile bxxk f157489d;

    /* renamed from: a */
    public int f157490a;

    /* renamed from: b */
    public int f157491b;

    static {
        bvsh bvsh = new bvsh();
        f157488c = bvsh;
        GeneratedMessageLite.m124024a(bvsh.class, bvsh);
    }

    private bvsh() {
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
            return GeneratedMessageLite.m124022a(f157488c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0002", new Object[]{"a", "b", bvzc.f158280a});
        } else if (i2 == 3) {
            return new bvsh();
        } else {
            if (i2 == 4) {
                return new bxvd(f157488c);
            }
            if (i2 == 5) {
                return f157488c;
            }
            bxxk bxxk = f157489d;
            if (bxxk == null) {
                synchronized (bvsh.class) {
                    bxxk = f157489d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157488c);
                        f157489d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
