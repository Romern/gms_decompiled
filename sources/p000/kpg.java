package p000;

/* renamed from: kpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kpg f24741c;

    /* renamed from: d */
    private static volatile bxxk f24742d;

    /* renamed from: a */
    public int f24743a;

    /* renamed from: b */
    public String f24744b = "";

    static {
        kpg kpg = new kpg();
        f24741c = kpg;
        GeneratedMessageLite.m124024a(kpg.class, kpg);
    }

    private kpg() {
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
            return GeneratedMessageLite.m124022a(f24741c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kpg();
        } else {
            if (i2 == 4) {
                return new bxvd(f24741c);
            }
            if (i2 == 5) {
                return f24741c;
            }
            bxxk bxxk = f24742d;
            if (bxxk == null) {
                synchronized (kpg.class) {
                    bxxk = f24742d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24741c);
                        f24742d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
