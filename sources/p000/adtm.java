package p000;

import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: adtm */
final /* synthetic */ class adtm implements View.OnClickListener {

    /* renamed from: a */
    private final adto f62718a;

    public adtm(adto adto) {
        this.f62718a = adto;
    }

    public void onClick(View view) {
        adto adto = this.f62718a;
        Intent launchIntentForPackage = adto.getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.kids.familylink");
        if (launchIntentForPackage != null) {
            adto.f62720a.mo33821a(603);
            adto.getActivity().startActivity(launchIntentForPackage);
            adto.getActivity().finish();
            return;
        }
        adto.getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(C0126R.anim.sud_slide_next_in, C0126R.anim.sud_slide_next_out, C0126R.anim.sud_slide_back_in, C0126R.anim.sud_slide_back_out).replace(16908290, new adtu()).addToBackStack("install_fl").commit();
    }
}
