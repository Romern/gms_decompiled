package p000;

import android.view.View;
import com.google.android.gms.auth.api.phone.p024ui.AutofillConsentChimeraActivity;

/* renamed from: ian */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ian implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AutofillConsentChimeraActivity f20641a;

    public ian(AutofillConsentChimeraActivity autofillConsentChimeraActivity) {
        this.f20641a = autofillConsentChimeraActivity;
    }

    public void onClick(View view) {
        AutofillConsentChimeraActivity autofillConsentChimeraActivity = this.f20641a;
        autofillConsentChimeraActivity.f10284b.mo12886a(autofillConsentChimeraActivity.f10285c, ibh.m15169a(autofillConsentChimeraActivity.f10286d, bofz.CLICK_CANCEL));
        this.f20641a.mo7514e();
        this.f20641a.finish();
    }
}
