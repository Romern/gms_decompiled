package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.locationsharing.updateshares.people.LocationSharingSelectionChimeraActivity;
import java.util.ArrayList;

/* renamed from: aexe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexe implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ LocationSharingSelectionChimeraActivity f63974a;

    public aexe(LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity) {
        this.f63974a = locationSharingSelectionChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity = this.f63974a;
        return new aexg(locationSharingSelectionChimeraActivity, locationSharingSelectionChimeraActivity.f79780e, locationSharingSelectionChimeraActivity.f79783h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeya.a(android.content.Context, boolean, long):java.lang.String
     arg types: [com.google.android.gms.locationsharing.updateshares.people.LocationSharingSelectionChimeraActivity, int, long]
     candidates:
      aeya.a(android.content.Context, long, long):java.lang.String
      aeya.a(android.content.Context, boolean, long):java.lang.String */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ContactPerson contactPerson = (ContactPerson) obj;
        aexw.m52662a(this.f63974a);
        if (contactPerson == null) {
            LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity = this.f63974a;
            locationSharingSelectionChimeraActivity.f79779d.mo11452a(locationSharingSelectionChimeraActivity.f79783h);
            Toast.makeText(this.f63974a, (int) C0126R.string.location_sharing_resolve_contact_failed, 0).show();
            this.f63974a.f79783h = null;
            return;
        }
        LocationSharingSelectionChimeraActivity.m67108a(contactPerson);
        try {
            this.f63974a.f79779d.f17494a.mo7288b(contactPerson);
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
        ArrayList arrayList = contactPerson.f9753e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ContactPerson.ContactMethod) arrayList.get(i)).f9755a != 0) {
                i = i2;
            } else {
                this.f63974a.f79783h = null;
                return;
            }
        }
        LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity2 = this.f63974a;
        String str = locationSharingSelectionChimeraActivity2.f79780e;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(locationSharingSelectionChimeraActivity2);
        String valueOf = String.valueOf(str);
        if (!defaultSharedPreferences.getBoolean(valueOf.length() == 0 ? new String("link_sharing_pref:") : "link_sharing_pref:".concat(valueOf), false)) {
            LocationSharingSelectionChimeraActivity locationSharingSelectionChimeraActivity3 = this.f63974a;
            String str2 = locationSharingSelectionChimeraActivity3.f79780e;
            int i3 = locationSharingSelectionChimeraActivity3.f79781f;
            aexj aexj = new aexj();
            String string = locationSharingSelectionChimeraActivity3.getString(C0126R.string.location_sharing_share_via_link_message);
            if (((SharingCondition) sef.m35067a(this.f63974a.getIntent(), "sharing_condition", SharingCondition.CREATOR)).mo43781c() == 1) {
                string = locationSharingSelectionChimeraActivity3.getString(C0126R.string.location_sharing_share_via_link_message_persistent, aeya.m52675a((Context) locationSharingSelectionChimeraActivity3, true, aexj.f63980a));
            }
            aexj.mo34529b(locationSharingSelectionChimeraActivity3.getString(C0126R.string.location_sharing_share_via_link_title), string, locationSharingSelectionChimeraActivity3.getString(17039370), locationSharingSelectionChimeraActivity3.getString(17039360));
            aexj.getArguments().putString("account_name", str2);
            aexj.getArguments().putInt("accent_color", i3);
            FragmentTransaction beginTransaction = this.f63974a.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(aexj, "dialog_tag_link");
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
