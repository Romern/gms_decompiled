package p000;

/* renamed from: bosk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bosk f134601g;

    /* renamed from: h */
    private static volatile bxxk f134602h;

    /* renamed from: a */
    public int f134603a;

    /* renamed from: b */
    public boolean f134604b;

    /* renamed from: c */
    public int f134605c;

    /* renamed from: d */
    public int f134606d;

    /* renamed from: e */
    public int f134607e;

    /* renamed from: f */
    public int f134608f;

    static {
        bosk bosk = new bosk();
        f134601g = bosk;
        GeneratedMessageLite.m124024a(bosk.class, bosk);
    }

    private bosk() {
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
            return GeneratedMessageLite.m124022a(f134601g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", caek.f172831a, "d", cael.f172832a, "e", "f"});
        } else if (i2 == 3) {
            return new bosk();
        } else {
            if (i2 == 4) {
                return new bxvd(f134601g);
            }
            if (i2 == 5) {
                return f134601g;
            }
            bxxk bxxk = f134602h;
            if (bxxk == null) {
                synchronized (bosk.class) {
                    bxxk = f134602h;
                    if (bxxk == null) {
                        bxxk = new bxve(f134601g);
                        f134602h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
