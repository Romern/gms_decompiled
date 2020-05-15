package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajip */
public final /* synthetic */ class ajip implements aubg {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70719a;

    public ajip(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70719a = contactSelectChimeraActivity;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70719a;
        if (aucb.mo50386d() == null) {
            return aucu.m76777a((Exception) new rjp(new Status(4, "Account is null")));
        }
        return new ajvw(contactSelectChimeraActivity).mo38980a((Account) aucb.mo50386d());
    }
}
