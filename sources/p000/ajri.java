package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajri */
final /* synthetic */ class ajri implements aubt {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71183a;

    public ajri(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71183a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71183a;
        if (cfov.m142044T()) {
            Toast.makeText(shareSheetChimeraActivity, shareSheetChimeraActivity.getString(C0126R.string.sharing_enable_failed_bluetooth), 0).show();
        } else {
            shareSheetChimeraActivity.mo44482a(shareSheetChimeraActivity.getString(C0126R.string.sharing_required_service_bluetooth));
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Bluetooth.");
    }
}
