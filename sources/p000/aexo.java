package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aexo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexo {
    /* renamed from: a */
    public static LocationSharingSettings m52652a(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String valueOf = String.valueOf(str);
        String string = defaultSharedPreferences.getString(valueOf.length() == 0 ? new String("location_sharing_settings:") : "location_sharing_settings:".concat(valueOf), null);
        if (string == null) {
            return null;
        }
        try {
            LocationSharingSettings locationSharingSettings = (LocationSharingSettings) sef.m35068a(string, LocationSharingSettings.CREATOR);
            m52654a(locationSharingSettings.f79632b);
            m52654a(locationSharingSettings.f79633c);
            return locationSharingSettings;
        } catch (Exception e) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            String valueOf2 = String.valueOf(str);
            edit.remove(valueOf2.length() == 0 ? new String("location_sharing_settings:") : "location_sharing_settings:".concat(valueOf2));
            edit.apply();
            return null;
        }
    }

    /* renamed from: a */
    public static void m52653a(Context context, String str, LocationSharingSettings locationSharingSettings) {
        if (locationSharingSettings != null && !locationSharingSettings.mo43767b()) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            String valueOf = String.valueOf(str);
            edit.putString(valueOf.length() == 0 ? new String("location_sharing_settings:") : "location_sharing_settings:".concat(valueOf), sef.m35075b(locationSharingSettings));
            edit.apply();
        }
    }

    /* renamed from: a */
    private static void m52654a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LocationShare locationShare = (LocationShare) list.get(i);
            SharingCondition sharingCondition = locationShare.f79628b;
            if (sharingCondition.mo43781c() != 2 || sharingCondition.mo43780b() >= 0) {
                locationShare.mo43754a(2);
            } else {
                arrayList.add(locationShare);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            list.remove((LocationShare) arrayList.get(i2));
        }
    }
}
