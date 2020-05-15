package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialPickerChimeraActivity;

/* renamed from: hsu */
public final /* synthetic */ class hsu implements bmzi {

    /* renamed from: a */
    private final CredentialPickerChimeraActivity f20381a;

    /* renamed from: b */
    private final Account f20382b;

    /* renamed from: c */
    private final InternalCredentialWrapper f20383c;

    public hsu(CredentialPickerChimeraActivity credentialPickerChimeraActivity, Account account, InternalCredentialWrapper internalCredentialWrapper) {
        this.f20381a = credentialPickerChimeraActivity;
        this.f20382b = account;
        this.f20383c = internalCredentialWrapper;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.f20381a;
        return adbb.m50100a(credentialPickerChimeraActivity.f10160j.mo24701a((rpa) new gvy(this.f20382b, credentialPickerChimeraActivity.f10152b, this.f20383c.f10139a, ((CredentialRequest) credentialPickerChimeraActivity.f10154d.mo66814b()).f10109f, ((CredentialRequest) credentialPickerChimeraActivity.f10154d.mo66814b()).f10110g, ((CredentialRequest) credentialPickerChimeraActivity.f10154d.mo66814b()).f10111h)));
    }
}
