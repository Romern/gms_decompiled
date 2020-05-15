package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.api.credentials.credentialsaving.p021ui.PasswordSavingChimeraActivity;

/* renamed from: hfq */
public final /* synthetic */ class hfq implements bmyl {

    /* renamed from: a */
    private final PasswordSavingChimeraActivity f19680a;

    /* renamed from: b */
    private final String f19681b;

    public hfq(PasswordSavingChimeraActivity passwordSavingChimeraActivity, String str) {
        this.f19680a = passwordSavingChimeraActivity;
        this.f19681b = str;
    }

    /* renamed from: a */
    public final void mo12292a(Object obj) {
        this.f19680a.f10130b.mo24333a(adbu.m50141a((int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, (adbt) obj, this.f19681b)).mo24327b();
    }
}
