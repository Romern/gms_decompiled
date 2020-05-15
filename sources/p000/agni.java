package p000;

/* renamed from: agni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agni extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final agni f66064g;

    /* renamed from: h */
    private static volatile bxxk f66065h;

    /* renamed from: a */
    public int f66066a;

    /* renamed from: b */
    public bxwc f66067b = bxxn.f165040b;

    /* renamed from: c */
    public String f66068c = "";

    /* renamed from: d */
    public long f66069d;

    /* renamed from: e */
    public long f66070e;

    /* renamed from: f */
    public int f66071f;

    static {
        agni agni = new agni();
        f66064g = agni;
        GeneratedMessageLite.m124024a(agni.class, agni);
    }

    private agni() {
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
            return GeneratedMessageLite.m124022a(f66064g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"a", "b", agnk.class, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new agni();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f66064g;
            }
            bxxk bxxk = f66065h;
            if (bxxk == null) {
                synchronized (agni.class) {
                    bxxk = f66065h;
                    if (bxxk == null) {
                        bxxk = new bxve(f66064g);
                        f66065h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo35756a() {
        if (!this.f66067b.mo73666a()) {
            this.f66067b = GeneratedMessageLite.m124021a(this.f66067b);
        }
    }
}
