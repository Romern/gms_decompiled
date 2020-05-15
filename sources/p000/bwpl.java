package p000;

/* renamed from: bwpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwpl f160564d;

    /* renamed from: e */
    public static final bxvj f160565e;

    /* renamed from: f */
    private static volatile bxxk f160566f;

    /* renamed from: a */
    public int f160567a;

    /* renamed from: b */
    public long f160568b;

    /* renamed from: c */
    public int f160569c;

    static {
        bwpl bwpl = new bwpl();
        f160564d = bwpl;
        GeneratedMessageLite.m124024a(bwpl.class, bwpl);
        bwny bwny = bwny.f160414k;
        bwpl bwpl2 = f160564d;
        f160565e = GeneratedMessageLite.m124006a(bwny, bwpl2, bwpl2, 277984631, bxzf.MESSAGE);
    }

    private bwpl() {
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
            return GeneratedMessageLite.m124022a(f160564d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwpl();
        } else {
            if (i2 == 4) {
                return new bxvd(f160564d);
            }
            if (i2 == 5) {
                return f160564d;
            }
            bxxk bxxk = f160566f;
            if (bxxk == null) {
                synchronized (bwpl.class) {
                    bxxk = f160566f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160564d);
                        f160566f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
