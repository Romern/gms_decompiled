package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.p044ui.AuthenticateChimeraActivity;

/* renamed from: xur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xur extends aaab {

    /* renamed from: a */
    private final xsk f53183a;

    /* renamed from: b */
    private final PublicKeyCredentialCreationOptions f53184b;

    public xur(xsk xsk, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        super(148, "RegisterApp");
        this.f53183a = xsk;
        this.f53184b = publicKeyCredentialCreationOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f53183a.mo30101a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23558a(context, xwi.FIDO2_API, this.f53184b), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53183a.mo30101a(status, null);
    }
}
