package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.phone.p024ui.AutofillConsentChimeraActivity;

/* renamed from: iam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iam implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ AutofillConsentChimeraActivity f20640a;

    public iam(AutofillConsentChimeraActivity autofillConsentChimeraActivity) {
        this.f20640a = autofillConsentChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AutofillConsentChimeraActivity autofillConsentChimeraActivity = this.f20640a;
        autofillConsentChimeraActivity.f10284b.mo12886a(autofillConsentChimeraActivity.f10285c, ibh.m15169a(autofillConsentChimeraActivity.f10286d, bofz.UNKNOWN_ACTION));
        this.f20640a.mo7514e();
        this.f20640a.finish();
    }
}
