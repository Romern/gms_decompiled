package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* renamed from: xpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpf {

    /* renamed from: a */
    public String f52860a;

    /* renamed from: b */
    private ErrorCode f52861b;

    /* renamed from: a */
    public final AuthenticatorErrorResponse mo30000a() {
        return new AuthenticatorErrorResponse(this.f52861b.f31755m, this.f52860a);
    }

    /* renamed from: a */
    public final void mo30001a(ErrorCode errorCode) {
        sdo.m34959a(errorCode);
        this.f52861b = errorCode;
    }
}
