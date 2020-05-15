package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: qcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class qcg {

    /* renamed from: a */
    private static qcg f40923a;

    /* renamed from: b */
    public static synchronized qcg m31845b() {
        qcg qcg;
        synchronized (qcg.class) {
            if (f40923a == null) {
                f40923a = new qcg();
            }
            qcg = f40923a;
        }
        return qcg;
    }

    /* renamed from: a */
    public Bundle mo23911a(Bundle bundle) {
        String str;
        sdo.m34959a(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CheckinService_onStart_checkinReason", 8);
        bundle2.putString("checkin_source_package", bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE"));
        bundle2.putString("checkin_source_class", bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_CLASS"));
        int i = Build.VERSION.SDK_INT;
        if (bundle.containsKey("com.google.android.gms.checkin.EXTRA_NETWORK_REQUEST")) {
            bundle2.putParcelable("CheckinService_networkRequest", bundle.getParcelable("com.google.android.gms.checkin.EXTRA_NETWORK_REQUEST"));
        }
        boolean z = bundle.getBoolean("com.google.android.gms.checkin.EXTRA_CHECKIN_NOW", false);
        bundle2.putBoolean("CheckinService_onStart_ignoreMinTriggerInterval", z);
        bundle2.putBoolean("CheckinService_onStart_resetTransientErrorCount", z);
        bundle2.putBoolean("CheckinService_onStart_resetTriggerTime", z);
        bundle2.putBoolean("checkin_source_force", z);
        bundle2.putBoolean("CheckinService_forceCheckin", z);
        int i2 = bundle.getInt("com.google.android.gms.checkin.CHECKIN_LOG_UPLOAD_POLICY", 0);
        if (i2 == 0) {
            str = "UPLOAD_ALL";
        } else {
            str = i2 == 1 ? "UPLOAD_NONE" : null;
        }
        if (str != null) {
            bundle2.putString("CheckinService_logUploadPolicy", str);
        }
        return bundle2;
    }
}
