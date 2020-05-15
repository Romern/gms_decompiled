package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.p044ui.AuthenticateChimeraActivity;

/* renamed from: xux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xux extends aaab {

    /* renamed from: a */
    private final xsc f53199a;

    /* renamed from: b */
    private final BrowserPublicKeyCredentialRequestOptions f53200b;

    public xux(xsc xsc, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        super(149, "SignPrivileged");
        this.f53199a = xsc;
        this.f53200b = browserPublicKeyCredentialRequestOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f53199a.mo30097a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23558a(context, xwi.FIDO2_PRIVILEGED_API, this.f53200b), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53199a.mo30097a(status, null);
    }
}
