package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajrh */
final /* synthetic */ class ajrh implements aubt {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71182a;

    public ajrh(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71182a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71182a;
        if (cfov.m142044T()) {
            Toast.makeText(shareSheetChimeraActivity, shareSheetChimeraActivity.getString(C0126R.string.sharing_enable_failed_location), 0).show();
        } else {
            shareSheetChimeraActivity.mo44482a(shareSheetChimeraActivity.getString(C0126R.string.sharing_required_service_location));
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Location.");
    }
}
