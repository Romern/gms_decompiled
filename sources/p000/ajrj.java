package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajrj */
final /* synthetic */ class ajrj implements aubt {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71184a;

    public ajrj(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71184a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71184a;
        Toast.makeText(shareSheetChimeraActivity, shareSheetChimeraActivity.getString(C0126R.string.sharing_enable_failed_wifi), 0).show();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to turn on Wifi.");
    }
}
