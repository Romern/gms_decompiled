package p000;

/* renamed from: btex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btex extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btex f148588c;

    /* renamed from: e */
    private static volatile bxxk f148589e;

    /* renamed from: a */
    public bxwc f148590a = bxxn.f165040b;

    /* renamed from: b */
    public btcp f148591b;

    /* renamed from: d */
    private byte f148592d = 2;

    static {
        btex btex = new btex();
        f148588c = btex;
        bxvk.m124024a(btex.class, btex);
    }

    private btex() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148592d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148592d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148588c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\t", new Object[]{"a", btcr.class, "b"});
        } else if (i2 == 3) {
            return new btex();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f148588c;
            }
            bxxk bxxk = f148589e;
            if (bxxk == null) {
                synchronized (btex.class) {
                    bxxk = f148589e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148588c);
                        f148589e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
