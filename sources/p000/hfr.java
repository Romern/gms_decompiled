package p000;

import com.google.android.gms.auth.api.credentials.credentialsaving.p021ui.PasswordSavingChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: hfr */
public final /* synthetic */ class hfr implements C0038ax {

    /* renamed from: a */
    private final PasswordSavingChimeraActivity f19682a;

    public hfr(PasswordSavingChimeraActivity passwordSavingChimeraActivity) {
        this.f19682a = passwordSavingChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        PasswordSavingChimeraActivity passwordSavingChimeraActivity = this.f19682a;
        Status status = (Status) obj;
        if (!status.equals(Status.f30107a)) {
            i = 0;
        } else {
            i = -1;
        }
        passwordSavingChimeraActivity.mo7417a(status, i);
    }
}
