package p000;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity;

/* renamed from: aevb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSettingsChimeraActivity f63879a;

    public aevb(LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity) {
        this.f63879a = locationSharingSettingsChimeraActivity;
    }

    public void onClick(View view) {
        LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity = this.f63879a;
        if (locationSharingSettingsChimeraActivity.f79708b.f63903a.f79631a.booleanValue()) {
            aetk aetk = locationSharingSettingsChimeraActivity.f79710d;
            bxvd da = cajj.f174828c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajj cajj = (cajj) da.f164949b;
            cajj.f174831b = 1;
            cajj.f174830a |= 1;
            cajj cajj2 = (cajj) da.mo74062i();
            bxvd d = aetk.m52539d(5);
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            caix caix = (caix) d.f164949b;
            caix caix2 = caix.f174776l;
            cajj2.getClass();
            caix.f174780c = cajj2;
            caix.f174778a |= 8;
            aetk.mo34552a((caix) d.mo74062i());
            Intent b = locationSharingSettingsChimeraActivity.mo43807b(1);
            if (!locationSharingSettingsChimeraActivity.f79713g) {
                locationSharingSettingsChimeraActivity.f79713g = true;
                locationSharingSettingsChimeraActivity.startActivityForResult(b, 1);
                return;
            }
            return;
        }
        Toast.makeText(locationSharingSettingsChimeraActivity, (int) C0126R.string.location_sharing_off_save_error, 0).show();
    }
}
