package p000;

import java.security.GeneralSecurityException;

/* renamed from: bqua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqua {
    /* renamed from: a */
    public static int m113406a(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "SHA512" : "SHA256" : "SHA384" : "SHA1" : "UNKNOWN_HASH" : "UNRECOGNIZED";
        throw new GeneralSecurityException(str.length() == 0 ? new String("unsupported hash type: ") : "unsupported hash type: ".concat(str));
    }

    /* renamed from: b */
    public static int m113410b(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        String valueOf = String.valueOf(bqrw.m113301c(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: c */
    public static int m113411c(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        String valueOf = String.valueOf(Integer.toString(bqrm.m113288a(i)));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("unknown ECDSA encoding: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static void m113407a(bqrj bqrj) {
        int b = bqrm.m113289b(bqrj.f141442c);
        if (b == 0) {
            b = 1;
        }
        int b2 = bqry.m113304b(bqrj.f141440a);
        if (b2 == 0) {
            b2 = 1;
        }
        int b3 = bqrw.m113300b(bqrj.f141441b);
        if (b3 == 0) {
            b3 = 1;
        }
        int i = b - 2;
        if (i == 1 || i == 2) {
            int i2 = b3 - 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    } else if (b2 != 6) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    }
                } else if (b2 != 4 && b2 != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            } else if (b2 != 5) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    /* renamed from: a */
    public static void m113408a(bqst bqst) {
        int b = bqry.m113304b(bqst.f141570a);
        if (b == 0) {
            b = 1;
        }
        m113406a(b);
    }

    /* renamed from: a */
    public static void m113409a(bqsx bqsx) {
        int b = bqry.m113304b(bqsx.f141594a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        m113406a(b);
        int b2 = bqry.m113304b(bqsx.f141594a);
        if (b2 == 0) {
            b2 = 1;
        }
        int b3 = bqry.m113304b(bqsx.f141595b);
        if (b3 != 0) {
            i = b3;
        }
        if (b2 != i) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
    }
}
