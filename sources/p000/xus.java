package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.p044ui.AuthenticateChimeraActivity;

/* renamed from: xus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xus extends aaab {

    /* renamed from: a */
    private final xsc f53185a;

    /* renamed from: b */
    private final BrowserPublicKeyCredentialCreationOptions f53186b;

    public xus(xsc xsc, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        super(149, "RegisterPrivileged");
        this.f53185a = xsc;
        this.f53186b = browserPublicKeyCredentialCreationOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f53185a.mo30097a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23558a(context, xwi.FIDO2_PRIVILEGED_API, this.f53186b), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53185a.mo30097a(status, null);
    }
}
