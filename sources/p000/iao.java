package p000;

import android.view.View;
import com.google.android.gms.auth.api.phone.p024ui.AutofillConsentChimeraActivity;

/* renamed from: iao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iao implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AutofillConsentChimeraActivity f20642a;

    public iao(AutofillConsentChimeraActivity autofillConsentChimeraActivity) {
        this.f20642a = autofillConsentChimeraActivity;
    }

    public void onClick(View view) {
        AutofillConsentChimeraActivity autofillConsentChimeraActivity = this.f20642a;
        autofillConsentChimeraActivity.f10284b.mo12886a(autofillConsentChimeraActivity.f10285c, ibh.m15169a(autofillConsentChimeraActivity.f10286d, bofz.CLICK_AGREE));
        AutofillConsentChimeraActivity autofillConsentChimeraActivity2 = this.f20642a;
        autofillConsentChimeraActivity2.f10287e.mo12858c();
        autofillConsentChimeraActivity2.setResult(-1);
        this.f20642a.finish();
    }
}
