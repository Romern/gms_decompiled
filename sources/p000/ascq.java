package p000;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;

/* renamed from: ascq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascq {
    /* renamed from: a */
    public static void m73788a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.setNdefPushMessage(null, activity, new Activity[0]);
        }
    }

    /* renamed from: a */
    public static boolean m73789a(Context context) {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
