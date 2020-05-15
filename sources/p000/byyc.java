package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: byyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyc extends bxvg implements bxvh {

    /* renamed from: g */
    public static final byyc f168888g;

    /* renamed from: p */
    private static volatile bxxk f168889p;

    /* renamed from: a */
    public long f168890a;

    /* renamed from: b */
    public long f168891b = 1100;

    /* renamed from: c */
    public long f168892c = 1500;

    /* renamed from: d */
    public long f168893d = 300;

    /* renamed from: e */
    public long f168894e = 150;

    /* renamed from: f */
    public long f168895f = 400;

    /* renamed from: h */
    private int f168896h;

    /* renamed from: i */
    private long f168897i = 300;

    /* renamed from: j */
    private long f168898j = 500;

    /* renamed from: k */
    private long f168899k = 4000;

    /* renamed from: l */
    private int f168900l = 2000;

    /* renamed from: n */
    private int f168901n = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;

    /* renamed from: o */
    private byte f168902o = 2;

    static {
        byyc byyc = new byyc();
        f168888g = byyc;
        GeneratedMessageLite.m124024a(byyc.class, byyc);
    }

    private byyc() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125502a(byyc byyc) {
        byyc.f168896h |= 1;
        byyc.f168890a = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125503b(byyc byyc) {
        byyc.f168896h |= 2;
        byyc.f168897i = 300;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125504c(byyc byyc) {
        byyc.f168896h |= 4;
        byyc.f168898j = 500;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125505d(byyc byyc) {
        byyc.f168896h |= 8;
        byyc.f168891b = 1100;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125506e(byyc byyc) {
        byyc.f168896h |= 16;
        byyc.f168892c = 1500;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125507f(byyc byyc) {
        byyc.f168896h |= 32;
        byyc.f168899k = 4000;
    }

    /* renamed from: g */
    public static /* synthetic */ void m125508g(byyc byyc) {
        byyc.f168896h |= 64;
        byyc.f168893d = 300;
    }

    /* renamed from: h */
    public static /* synthetic */ void m125509h(byyc byyc) {
        byyc.f168896h |= 128;
        byyc.f168894e = 150;
    }

    /* renamed from: i */
    public static /* synthetic */ void m125510i(byyc byyc) {
        byyc.f168896h |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        byyc.f168895f = 400;
    }

    /* renamed from: j */
    public static /* synthetic */ void m125511j(byyc byyc) {
        byyc.f168896h |= 512;
        byyc.f168900l = 2000;
    }

    /* renamed from: k */
    public static /* synthetic */ void m125512k(byyc byyc) {
        byyc.f168896h |= 1024;
        byyc.f168901n = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168902o);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168902o = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168888g, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bင\t\fင\n", new Object[]{"h", "a", "i", "j", "b", "c", "k", "d", "e", "f", "l", "n"});
        } else if (i2 == 3) {
            return new byyc();
        } else {
            if (i2 == 4) {
                return new bxvf(f168888g);
            }
            if (i2 == 5) {
                return f168888g;
            }
            bxxk bxxk = f168889p;
            if (bxxk == null) {
                synchronized (byyc.class) {
                    bxxk = f168889p;
                    if (bxxk == null) {
                        bxxk = new bxve(f168888g);
                        f168889p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
