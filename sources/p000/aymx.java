package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;

/* renamed from: aymx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymx {

    /* renamed from: a */
    private static final String[] f97997a = {"http://www.google.com", "http://www.google.co.uk"};

    @Deprecated
    /* renamed from: a */
    public static void m84287a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, "allowed_geolocation_origins");
            HashSet<String> hashSet = new HashSet();
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split("\\s+");
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
            }
            for (String str2 : f97997a) {
                hashSet.add(str2);
            }
            StringBuilder sb = new StringBuilder();
            for (String str3 : hashSet) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(str3);
            }
            Settings.Secure.putString(contentResolver, "allowed_geolocation_origins", sb.toString());
        } catch (RuntimeException e) {
            Log.e("UseLocationForServices", "Failed to set browser geolocation permissions: " + e);
        }
        aymk.m84259b(context.getContentResolver(), "use_location_for_services", 1);
        context.sendBroadcast(new Intent("com.google.android.gsf.settings.GoogleLocationSettings.UPDATE_LOCATION_SETTINGS"));
    }
}
