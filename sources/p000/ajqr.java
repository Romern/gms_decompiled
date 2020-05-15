package p000;

import android.app.ActivityOptions;
import android.util.Pair;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqr */
final /* synthetic */ class ajqr implements aubq {

    /* renamed from: a */
    private final SetupChimeraActivity f71162a;

    public ajqr(SetupChimeraActivity setupChimeraActivity) {
        this.f71162a = setupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        SetupChimeraActivity setupChimeraActivity = this.f71162a;
        if (!aucb.mo50384b()) {
            Toast.makeText(setupChimeraActivity, setupChimeraActivity.getResources().getString(C0126R.string.sharing_setup_toast_contact_mode_not_available), 0).show();
            setupChimeraActivity.f70615c.mo38899a(0);
            setupChimeraActivity.mo44476i();
        } else if (((Boolean) aucb.mo50386d()).booleanValue()) {
            setupChimeraActivity.mo44475h();
        } else {
            setupChimeraActivity.startActivityForResult(ConsentsChimeraActivity.m67439a(setupChimeraActivity), 1004, ActivityOptions.makeSceneTransitionAnimation(setupChimeraActivity.getContainerActivity(), new Pair(setupChimeraActivity.f70617e, "card")).toBundle());
        }
    }
}
