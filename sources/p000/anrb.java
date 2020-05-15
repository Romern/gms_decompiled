package p000;

import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* renamed from: anrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrb implements rkl {

    /* renamed from: a */
    final /* synthetic */ UpdateCirclesChimeraActivity f77487a;

    public anrb(UpdateCirclesChimeraActivity updateCirclesChimeraActivity) {
        this.f77487a = updateCirclesChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        AddToCircleConsentData addToCircleConsentData;
        alld alld = (alld) rkk;
        this.f77487a.f82331z = alld.mo7183bo();
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity = this.f77487a;
        if (alld.mo7183bo().mo17710c()) {
            addToCircleConsentData = new AddToCircleConsentData(alld.mo40478b(), alld.mo40479c(), alld.mo40480d(), alld.mo40481e());
        } else {
            addToCircleConsentData = null;
        }
        updateCirclesChimeraActivity.f82330y = addToCircleConsentData;
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity2 = this.f77487a;
        if (updateCirclesChimeraActivity2.f82322A) {
            updateCirclesChimeraActivity2.f82322A = false;
            if (!updateCirclesChimeraActivity2.mo46562s()) {
                this.f77487a.mo46563t();
            }
        }
    }
}
