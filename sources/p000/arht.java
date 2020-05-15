package p000;

import java.security.SignatureException;

/* renamed from: arht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arht implements arhp {

    /* renamed from: b */
    private final byqy f87747b;

    public arht(byqy byqy) {
        this.f87747b = byqy;
    }

    /* renamed from: a */
    public final byte[] mo48552a(byte[] bArr) {
        return this.f87747b.mo74476a(bArr);
    }

    /* renamed from: b */
    public final byte[] mo48553b(byte[] bArr) {
        try {
            return this.f87747b.mo74478b(bArr);
        } catch (SignatureException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new SecurityException(valueOf.length() == 0 ? new String("SignatureException when decoding data with the Ukey2 protocol: ") : "SignatureException when decoding data with the Ukey2 protocol: ".concat(valueOf));
        }
    }
}
