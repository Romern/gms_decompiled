package p000;

/* renamed from: bosl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bosl f134609e;

    /* renamed from: f */
    private static volatile bxxk f134610f;

    /* renamed from: a */
    public int f134611a;

    /* renamed from: b */
    public bosk f134612b;

    /* renamed from: c */
    public bosj f134613c;

    /* renamed from: d */
    public bosi f134614d;

    static {
        bosl bosl = new bosl();
        f134609e = bosl;
        GeneratedMessageLite.m124024a(bosl.class, bosl);
    }

    private bosl() {
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
            return GeneratedMessageLite.m124022a(f134609e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bosl();
        } else {
            if (i2 == 4) {
                return new bxvd(f134609e);
            }
            if (i2 == 5) {
                return f134609e;
            }
            bxxk bxxk = f134610f;
            if (bxxk == null) {
                synchronized (bosl.class) {
                    bxxk = f134610f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134609e);
                        f134610f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
