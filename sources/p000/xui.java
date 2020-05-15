package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xui extends xsm implements aaai {

    /* renamed from: a */
    private final aaag f53162a;

    /* renamed from: b */
    private final String f53163b;

    public xui(aaag aaag, String str) {
        this.f53162a = aaag;
        this.f53163b = str;
    }

    /* renamed from: a */
    public final void mo30102a(xoh xoh) {
        this.f53162a.mo16658a(new xuq(148, xoh));
    }

    /* renamed from: a */
    public final void mo30103a(xoh xoh, String str, byte[] bArr) {
        this.f53162a.mo16658a(new xup(xoh, this.f53163b, str, bArr));
    }

    /* renamed from: a */
    public final void mo30104a(xsk xsk, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.f53162a.mo16658a(new xur(xsk, publicKeyCredentialCreationOptions));
    }

    /* renamed from: a */
    public final void mo30105a(xsk xsk, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        this.f53162a.mo16658a(new xuw(xsk, publicKeyCredentialRequestOptions));
    }
}
