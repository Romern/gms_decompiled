package p000;

import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.onboarding.OnboardingChimeraActivity;
import com.google.android.gms.locationsharing.onboarding.TosUiDescription;

/* renamed from: aets */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aets implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ OnboardingChimeraActivity f63790a;

    public aets(OnboardingChimeraActivity onboardingChimeraActivity) {
        this.f63790a = onboardingChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        OnboardingChimeraActivity onboardingChimeraActivity = this.f63790a;
        return new aetn(onboardingChimeraActivity, onboardingChimeraActivity.f79657b, !bundle.getBoolean("is_location_history_enabled"));
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        TosUiDescription tosUiDescription = (TosUiDescription) obj;
        aexw.m52662a(this.f63790a);
        if (tosUiDescription == null) {
            Toast.makeText(this.f63790a, (int) C0126R.string.location_sharing_onboarding_error, 0).show();
            this.f63790a.finish();
            return;
        }
        Bundle extras = this.f63790a.getIntent().getExtras();
        extras.putString("tos_ui_description", sef.m35075b(tosUiDescription));
        OnboardingChimeraActivity onboardingChimeraActivity = this.f63790a;
        aetw aetw = new aetw();
        aetw.setArguments(extras);
        onboardingChimeraActivity.f79656a = aetw;
        FragmentTransaction beginTransaction = this.f63790a.getSupportFragmentManager().beginTransaction();
        beginTransaction.add((int) C0126R.C0129id.fragment_container, this.f63790a.f79656a);
        beginTransaction.commit();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
