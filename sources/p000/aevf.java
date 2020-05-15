package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity;

/* renamed from: aevf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevf implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSettingsChimeraActivity f63883a;

    public aevf(LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity) {
        this.f63883a = locationSharingSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f63883a.f79710d.mo34553b(12);
        Uri a = aexs.m52660a(this.f63883a, this.f63883a.getString(C0126R.string.location_sharing_url_param_help_location));
        LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity = this.f63883a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(a);
        locationSharingSettingsChimeraActivity.startActivity(intent);
        return true;
    }
}
