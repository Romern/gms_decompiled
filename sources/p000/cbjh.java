package p000;

/* renamed from: cbjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbjh f177327c;

    /* renamed from: d */
    private static volatile bxxk f177328d;

    /* renamed from: a */
    public String f177329a = "";

    /* renamed from: b */
    public String f177330b = "";

    static {
        cbjh cbjh = new cbjh();
        f177327c = cbjh;
        GeneratedMessageLite.m124024a(cbjh.class, cbjh);
    }

    private cbjh() {
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
            return GeneratedMessageLite.m124022a(f177327c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbjh();
        } else {
            if (i2 == 4) {
                return new bxvd(f177327c);
            }
            if (i2 == 5) {
                return f177327c;
            }
            bxxk bxxk = f177328d;
            if (bxxk == null) {
                synchronized (cbjh.class) {
                    bxxk = f177328d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177327c);
                        f177328d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
