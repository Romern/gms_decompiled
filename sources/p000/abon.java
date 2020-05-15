package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: abon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abon {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* renamed from: b */
    static final Intent m48009b(Context context) {
        Boolean bool;
        Intent intent = new Intent("com.google.android.apps.gcs.GCS_STATE_SERVICE").setPackage("com.google.android.apps.gcs");
        SharedPreferences a = abmm.f57697a.mo10354a();
        if (a.contains("gcsStateServiceAvailabilityLastUpdatedMillis") && a.contains("gcsStateServiceAvailability")) {
            if (System.currentTimeMillis() - a.getLong("gcsStateServiceAvailabilityLastUpdatedMillis", 0) < cekh.f182840a.mo6606a().mo79223b()) {
                bool = Boolean.valueOf(a.getBoolean("gcsStateServiceAvailability", false));
                if (bool == null) {
                    bool = Boolean.valueOf(m48008a(context, intent));
                    abmm.m47921c(bool.booleanValue());
                }
                if (!bool.booleanValue()) {
                    return intent;
                }
                return null;
            }
        }
        bool = null;
        if (bool == null) {
        }
        if (!bool.booleanValue()) {
        }
    }

    /* renamed from: a */
    static final boolean m48007a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.equals(Settings.Global.getString(context.getContentResolver(), "use_open_wifi_package"), "com.google.android.apps.gcs");
    }

    /* renamed from: a */
    public static final boolean m48008a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentServices(intent, 0).isEmpty();
    }
}
