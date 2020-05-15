package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajof */
final /* synthetic */ class ajof implements aubt {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71054a;

    public ajof(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71054a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71054a;
        if (cfov.m142044T()) {
            Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_enable_failed_location), 0).show();
        } else {
            receiveSurfaceChimeraActivity.mo44461a(receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_required_service_location));
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Location.");
    }
}
