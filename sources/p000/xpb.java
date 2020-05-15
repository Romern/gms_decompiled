package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* renamed from: xpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpb {

    /* renamed from: a */
    public byte[] f52852a;

    /* renamed from: b */
    private byte[] f52853b;

    /* renamed from: c */
    private byte[] f52854c;

    /* renamed from: d */
    private byte[] f52855d;

    /* renamed from: e */
    private byte[] f52856e;

    /* renamed from: a */
    public final AuthenticatorAssertionResponse mo29987a() {
        return new AuthenticatorAssertionResponse(this.f52853b, this.f52854c, this.f52855d, this.f52856e, this.f52852a);
    }

    /* renamed from: b */
    public final void mo29989b(byte[] bArr) {
        this.f52854c = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: c */
    public final void mo29990c(byte[] bArr) {
        this.f52853b = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: d */
    public final void mo29991d(byte[] bArr) {
        this.f52856e = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: a */
    public final void mo29988a(byte[] bArr) {
        this.f52855d = (byte[]) sdo.m34959a(bArr);
    }
}
