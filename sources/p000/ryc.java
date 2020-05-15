package p000;

import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;
import java.io.File;

/* renamed from: ryc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryc implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final DownloadServiceSettingsChimeraActivity f43845a;

    public ryc(DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity) {
        this.f43845a = downloadServiceSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        DownloadDetails e = DownloadServiceSettingsChimeraActivity.m22572e();
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity = this.f43845a;
            downloadServiceSettingsChimeraActivity.startService(rye.m34649a(downloadServiceSettingsChimeraActivity));
            return true;
        } else if (itemId == 2) {
            if (DownloadIntentOperation.m22564c(this.f43845a, e.f30175a)) {
                Toast.makeText(this.f43845a, "Already enabled", 0).show();
            } else if (!DownloadIntentOperation.m22563c(this.f43845a, e)) {
                bnsl bnsl = (bnsl) DownloadServiceSettingsChimeraActivity.f30190b.mo68387b();
                bnsl.mo68432a("ryc", "onMenuItemClick", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to enable file!");
            } else {
                this.f43845a.mo17783g();
            }
            return true;
        } else if (itemId == 3) {
            if (DownloadIntentOperation.m22564c(this.f43845a, e.f30175a)) {
                File b = DownloadIntentOperation.m22560b(this.f43845a, e.f30175a);
                if (b != null && b.exists()) {
                    b.delete();
                }
                DownloadIntentOperation.m22565d(this.f43845a, e.f30175a);
            } else {
                Toast.makeText(this.f43845a, "Already disabled", 0).show();
            }
            return true;
        } else if (itemId != 4) {
            return false;
        } else {
            if (!DownloadIntentOperation.m22564c(this.f43845a, e.f30175a)) {
                Toast.makeText(this.f43845a, "Not enabled.", 0).show();
            } else {
                new ryb().show(this.f43845a.getSupportFragmentManager(), "image");
            }
            return true;
        }
    }
}
