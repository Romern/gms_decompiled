package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.p044ui.AuthenticateChimeraActivity;

/* renamed from: xuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuw extends aaab {

    /* renamed from: a */
    private final xsk f53197a;

    /* renamed from: b */
    private final PublicKeyCredentialRequestOptions f53198b;

    public xuw(xsk xsk, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        super(148, "SignApp");
        this.f53197a = xsk;
        this.f53198b = publicKeyCredentialRequestOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f53197a.mo30101a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23558a(context, xwi.FIDO2_API, this.f53198b), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53197a.mo30101a(status, null);
    }
}
