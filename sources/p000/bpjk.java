package p000;

/* renamed from: bpjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpjk f137872f;

    /* renamed from: g */
    private static volatile bxxk f137873g;

    /* renamed from: a */
    public int f137874a;

    /* renamed from: b */
    public int f137875b;

    /* renamed from: c */
    public int f137876c;

    /* renamed from: d */
    public int f137877d = -1;

    /* renamed from: e */
    public int f137878e;

    static {
        bpjk bpjk = new bpjk();
        f137872f = bpjk;
        GeneratedMessageLite.m124024a(bpjk.class, bpjk);
    }

    private bpjk() {
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
            return GeneratedMessageLite.m124022a(f137872f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", bpji.f137871a, "c", bphy.f137713a, "d", "e", bpka.f137934a});
        } else if (i2 == 3) {
            return new bpjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f137872f);
            }
            if (i2 == 5) {
                return f137872f;
            }
            bxxk bxxk = f137873g;
            if (bxxk == null) {
                synchronized (bpjk.class) {
                    bxxk = f137873g;
                    if (bxxk == null) {
                        bxxk = new bxve(f137872f);
                        f137873g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
