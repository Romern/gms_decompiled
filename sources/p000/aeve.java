package p000;

import android.net.Uri;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity;

/* renamed from: aeve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeve implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSettingsChimeraActivity f63882a;

    public aeve(LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity) {
        this.f63882a = locationSharingSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i;
        this.f63882a.f79710d.mo34553b(11);
        Uri a = aexs.m52660a(this.f63882a, this.f63882a.getString(C0126R.string.location_sharing_url_param_help_location));
        if (!cfaz.m138553b()) {
            i = C0126R.string.location_sharing_onboarding_expanded;
        } else {
            i = C0126R.string.location_sharing_onboarding_expanded_huxley_version;
        }
        aesv.m52523a(" ", this.f63882a.getString(i, new Object[]{a.toString()}), this.f63882a.getString(C0126R.string.common_got_it), null).show(this.f63882a.getSupportFragmentManager(), "help_dialog");
        return true;
    }
}
