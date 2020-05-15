package p000;

/* renamed from: byrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byrl f167492d;

    /* renamed from: f */
    private static volatile bxxk f167493f;

    /* renamed from: a */
    public int f167494a;

    /* renamed from: b */
    public bytb f167495b;

    /* renamed from: c */
    public int f167496c;

    /* renamed from: e */
    private byte f167497e = 2;

    static {
        byrl byrl = new byrl();
        f167492d = byrl;
        GeneratedMessageLite.m124024a(byrl.class, byrl);
    }

    private byrl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167497e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167497e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167492d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byrl();
        } else {
            if (i2 == 4) {
                return new bxvd(f167492d);
            }
            if (i2 == 5) {
                return f167492d;
            }
            bxxk bxxk = f167493f;
            if (bxxk == null) {
                synchronized (byrl.class) {
                    bxxk = f167493f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167492d);
                        f167493f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
