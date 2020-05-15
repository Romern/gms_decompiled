package p000;

import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: hss */
public final /* synthetic */ class hss implements bmzi {

    /* renamed from: a */
    private final CredentialPickerChimeraActivity f20379a;

    public hss(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.f20379a = credentialPickerChimeraActivity;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.f20379a;
        if (credentialPickerChimeraActivity.f10154d.mo66813a()) {
            return adbb.m50100a(credentialPickerChimeraActivity.f10160j.mo24701a((rpa) new gvw(credentialPickerChimeraActivity.f10152b, (CredentialRequest) credentialPickerChimeraActivity.f10154d.mo66814b())));
        }
        return bqdx.m112673a(adbb.m50100a(credentialPickerChimeraActivity.f10160j.mo24701a((rpa) new gvx((HintRequest) credentialPickerChimeraActivity.f10153c.mo66814b()))), hsy.f20388a, bqfb.INSTANCE);
    }
}
