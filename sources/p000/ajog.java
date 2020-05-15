package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajog */
final /* synthetic */ class ajog implements aubt {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71055a;

    public ajog(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71055a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71055a;
        if (cfov.m142044T()) {
            Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_enable_failed_bluetooth), 0).show();
        } else {
            receiveSurfaceChimeraActivity.mo44461a(receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_required_service_bluetooth));
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Bluetooth.");
    }
}
