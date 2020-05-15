package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: ral */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ral {

    /* renamed from: a */
    public static final int f42547a;

    /* renamed from: h */
    private static final int f42548h;

    /* renamed from: i */
    private static final int f42549i;

    /* renamed from: b */
    public final int f42550b;

    /* renamed from: c */
    public final int f42551c;

    /* renamed from: d */
    public final ran f42552d;

    /* renamed from: e */
    public final ran f42553e;

    /* renamed from: f */
    public int f42554f = 1;

    /* renamed from: g */
    public final qxy f42555g;

    /* renamed from: j */
    private final int f42556j;

    /* renamed from: k */
    private final int f42557k;

    /* renamed from: l */
    private final int f42558l;

    /* renamed from: m */
    private final int f42559m;

    static {
        raj raj = raj.values()[0];
        int ordinal = (raj.RESERVED_8.ordinal() + 1) * 4;
        f42548h = ordinal;
        int i = ordinal + 80;
        f42547a = i;
        f42549i = i + ordinal;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qxy.a(int, long):void
     arg types: [int, int]
     candidates:
      qxy.a(int, byte):void
      qxy.a(int, int):void
      qxy.a(int, long):void */
    public ral(qya qya, qya qya2, qxy qxy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sdo.m34959a(qya);
        sdo.m34959a(qya2);
        sdo.m34974b(true);
        sdo.m34959a(qxy);
        int a = qxy.mo24396a();
        int i = f42549i;
        int b = qya.mo24403b() + qya2.mo24403b() + 7;
        if (a > i + b + b) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        int b2 = qya.mo24403b();
        this.f42556j = b2;
        int i2 = f42549i;
        this.f42557k = i2;
        this.f42558l = i2 + b2;
        int b3 = qya2.mo24403b();
        this.f42559m = b3;
        int i3 = this.f42558l + this.f42556j;
        this.f42550b = i3;
        int i4 = i3 + b3;
        this.f42551c = i4;
        int i5 = i4 + b3;
        int a2 = (qxy.mo24396a() - i5) / 2;
        int i6 = i5 + a2;
        if (this.f42557k % 4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (this.f42558l % 4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34974b(z3);
        if (this.f42550b % 4 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34974b(z4);
        if (this.f42551c % 4 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        sdo.m34974b(z5);
        if (a2 > 7) {
            z6 = true;
        } else {
            z6 = false;
        }
        sdo.m34974b(z6);
        this.f42555g = qxy;
        try {
            if (qxy.mo24400b(0) != 2 || this.f42555g.mo24400b(4) != 1) {
                qxy qxy2 = this.f42555g;
                qxz.m33087a(qxy2, 0, qxy2.mo24396a());
                this.f42555g.mo24398a(0, 2);
                this.f42555g.mo24398a(4, 1);
            }
            ran ran = new ran(qxy, i5, a2, qya2);
            ran ran2 = new ran(qxy, i6, a2, qya2);
            this.f42552d = ran;
            this.f42553e = ran2;
            try {
                int e = mo24420e();
                if (e == 5) {
                    this.f42555g.mo24398a(8, 1);
                    mo24415a();
                } else if (e == 6) {
                    this.f42555g.mo24398a(8, 0);
                    mo24415a();
                }
                try {
                    if (qxy.mo24401c(32) == 0 && qxy.mo24401c(40) == 0) {
                        qxy.mo24399a(32, SystemClock.elapsedRealtime());
                        qxy.mo24399a(40, -1L);
                    }
                } catch (IOException e2) {
                    this.f42554f = 3;
                }
            } catch (IOException e3) {
                this.f42554f = 3;
            } catch (qyb e4) {
                this.f42554f = 4;
            }
        } catch (IOException e5) {
            this.f42554f = 3;
            this.f42552d = null;
            this.f42553e = null;
        }
    }

    /* renamed from: a */
    public final int mo24413a(qya qya, int i, int i2) {
        if (rak.m33169b(mo24421f())) {
            i = i2;
        }
        return this.f42555g.mo24400b(i + qya.mo24402a());
    }

    /* renamed from: b */
    public final void mo24417b() {
        if (this.f42554f == 1) {
            try {
                int e = mo24420e();
                if (e == 3) {
                    this.f42555g.mo24398a(8, 0);
                } else if (e == 4) {
                    this.f42555g.mo24398a(8, 1);
                }
                qxz.m33087a(this.f42555g, 12, 16);
                qxz.m33087a(this.f42555g, 48, 32);
            } catch (IOException e2) {
                this.f42554f = 3;
            } catch (qyb e3) {
                this.f42554f = 4;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo24418c() {
        return rak.m33168a(mo24420e());
    }

    /* renamed from: d */
    public final int mo24419d() {
        mo24421f();
        return this.f42555g.mo24400b(28);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo24420e() {
        try {
            int b = this.f42555g.mo24400b(8);
            if (b == 0) {
                return 1;
            }
            if (b == 1) {
                return 2;
            }
            if (b == 2) {
                return 3;
            }
            if (b == 3) {
                return 4;
            }
            if (b == 4) {
                return 5;
            }
            if (b == 5) {
                return 6;
            }
            throw new qyb("Invalid state");
        } catch (IOException e) {
            this.f42554f = 3;
            throw e;
        } catch (qyb e2) {
            this.f42554f = 4;
            throw e2;
        }
    }

    /* renamed from: f */
    public final int mo24421f() {
        int i = this.f42554f;
        if (i == 3) {
            throw new IOException("Attempt to read after an IOException");
        } else if (i == 4) {
            throw new qyb("Attempt to read after a FormatException");
        } else if (i == 1) {
            int e = mo24420e();
            if (rak.m33168a(e)) {
                return e;
            }
            throw new IllegalStateException("Attempt to read when there is no snapshot");
        } else {
            throw new IllegalStateException("Attempt to read when status is not ok");
        }
    }

    /* renamed from: a */
    public final int mo24414a(raj raj) {
        return mo24413a(raj, 80, f42547a);
    }

    /* renamed from: a */
    public final void mo24415a() {
        int i;
        int i2;
        int i3;
        ran ran;
        if (this.f42554f == 1) {
            try {
                int e = mo24420e();
                if (!rak.m33168a(e)) {
                    boolean b = rak.m33169b(e);
                    if (!b) {
                        this.f42555g.mo24398a(8, 4);
                        i = 3;
                    } else {
                        this.f42555g.mo24398a(8, 5);
                        i = 4;
                    }
                    boolean z = true ^ b;
                    qxz.m33087a(this.f42555g, !z ? f42547a : 80, f42548h);
                    if (!z) {
                        i2 = this.f42558l;
                    } else {
                        i2 = this.f42557k;
                    }
                    qxz.m33087a(this.f42555g, i2, this.f42556j);
                    if (!z) {
                        i3 = this.f42551c;
                    } else {
                        i3 = this.f42550b;
                    }
                    qxz.m33087a(this.f42555g, i3, this.f42559m);
                    if (!z) {
                        ran = this.f42553e;
                    } else {
                        ran = this.f42552d;
                    }
                    ran.f42569e.mo24398a(ran.f42565a, 0);
                    qxy qxy = this.f42555g;
                    UUID randomUUID = UUID.randomUUID();
                    qxy.mo24399a(12, randomUUID.getMostSignificantBits());
                    qxy.mo24399a(20, randomUUID.getLeastSignificantBits());
                    this.f42555g.mo24398a(28, 0);
                    if (this.f42555g.mo24401c(40) >= 0) {
                        qxy qxy2 = this.f42555g;
                        qxy2.mo24399a(32, qxy2.mo24401c(40));
                    }
                    this.f42555g.mo24399a(40, SystemClock.elapsedRealtime());
                    this.f42555g.mo24398a(8, i - 1);
                    return;
                }
                qxz.m33088b(this.f42555g, 28, 1);
            } catch (IOException e2) {
                this.f42554f = 3;
            } catch (qyb e3) {
                this.f42554f = 4;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24416a(String str) {
        int i;
        try {
            if (this.f42554f == 1 && mo24418c()) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
                if (digest.length == 32) {
                    boolean z = true;
                    boolean z2 = true;
                    for (int i2 = 0; i2 < 32; i2++) {
                        byte a = this.f42555g.mo24395a(i2 + 48);
                        if (digest[i2] != a) {
                            z2 = false;
                        }
                        if (a != 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        return z2;
                    }
                    for (int i3 = 0; i3 < 32; i3++) {
                        this.f42555g.mo24397a(i3 + 48, digest[i3]);
                    }
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            i = 3;
            this.f42554f = i;
            return false;
        } catch (qyb e2) {
            i = 4;
            this.f42554f = i;
            return false;
        } catch (NoSuchAlgorithmException e3) {
            return false;
        }
    }
}
