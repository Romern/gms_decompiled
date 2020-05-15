package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity;

/* renamed from: aevg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSettingsChimeraActivity f63884a;

    public aevg(LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity) {
        this.f63884a = locationSharingSettingsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/families/answer/7103413?p=location_troubleshoot"));
        this.f63884a.startActivity(intent);
    }
}
