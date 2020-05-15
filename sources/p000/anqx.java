package p000;

import com.google.android.gms.plus.audience.UpdateActionOnlyChimeraActivity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* renamed from: anqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqx implements rkl {

    /* renamed from: a */
    final /* synthetic */ UpdateActionOnlyChimeraActivity f77483a;

    public anqx(UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity) {
        this.f77483a = updateActionOnlyChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alld alld = (alld) rkk;
        UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity = this.f77483a;
        updateActionOnlyChimeraActivity.f82311b = alld;
        if (!alld.mo7183bo().mo17710c()) {
            updateActionOnlyChimeraActivity.f82310a = null;
            updateActionOnlyChimeraActivity.mo46560a(alld.mo7183bo());
            return;
        }
        updateActionOnlyChimeraActivity.f82310a = new AddToCircleConsentData(alld.mo40478b(), alld.mo40479c(), alld.mo40480d(), alld.mo40481e());
        AddToCircleConsentData addToCircleConsentData = updateActionOnlyChimeraActivity.f82310a;
        if (addToCircleConsentData.f82336a) {
            updateActionOnlyChimeraActivity.startActivityForResult(ansi.m65104a(updateActionOnlyChimeraActivity.f82312c, updateActionOnlyChimeraActivity.f82313d, addToCircleConsentData.f82337b, addToCircleConsentData.f82338c, addToCircleConsentData.f82339d, updateActionOnlyChimeraActivity.mo46558a()), 2000);
        } else {
            updateActionOnlyChimeraActivity.mo46561b();
        }
    }
}
