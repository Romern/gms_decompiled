package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;

/* renamed from: xpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpd {

    /* renamed from: a */
    private byte[] f52857a;

    /* renamed from: b */
    private byte[] f52858b;

    /* renamed from: c */
    private byte[] f52859c;

    /* renamed from: a */
    public final AuthenticatorAttestationResponse mo29994a() {
        return new AuthenticatorAttestationResponse(this.f52857a, this.f52858b, this.f52859c);
    }

    /* renamed from: b */
    public final void mo29996b(byte[] bArr) {
        this.f52858b = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: c */
    public final void mo29997c(byte[] bArr) {
        this.f52857a = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: a */
    public final void mo29995a(byte[] bArr) {
        this.f52859c = (byte[]) sdo.m34959a(bArr);
    }
}
