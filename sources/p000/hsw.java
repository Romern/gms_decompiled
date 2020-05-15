package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: hsw */
public final /* synthetic */ class hsw implements bmzi {

    /* renamed from: a */
    private final CredentialPickerChimeraActivity f20385a;

    /* renamed from: b */
    private final bmxv f20386b;

    public hsw(CredentialPickerChimeraActivity credentialPickerChimeraActivity, bmxv bmxv) {
        this.f20385a = credentialPickerChimeraActivity;
        this.f20386b = bmxv;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.f20385a;
        return adbb.m50100a(credentialPickerChimeraActivity.f10160j.mo24701a((rpa) new gvz((Account) this.f20386b.mo66814b(), credentialPickerChimeraActivity.f10152b, ((HintRequest) credentialPickerChimeraActivity.f10153c.mo66814b()).f10119g, ((HintRequest) credentialPickerChimeraActivity.f10153c.mo66814b()).f10120h)));
    }
}
