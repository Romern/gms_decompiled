package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoh */
final /* synthetic */ class ajoh implements aubt {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71056a;

    public ajoh(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71056a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71056a;
        Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_enable_failed_wifi), 0).show();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Wifi.");
    }
}
