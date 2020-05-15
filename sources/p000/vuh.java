package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: vuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vuh extends IntentOperation {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    public void onHandleIntent(Intent intent) {
        char c;
        vui vui = new vui(getApplicationContext());
        String valueOf = String.valueOf(intent.getAction());
        if (valueOf.length() == 0) {
            new String("DrivingModeSetupNotificationIntentOperation handling:");
        } else {
            "DrivingModeSetupNotificationIntentOperation handling:".concat(valueOf);
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -268809479) {
            if (hashCode != -185034830) {
                if (hashCode == 1695542314 && action.equals("com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION")) {
                    c = 1;
                    if (c != 0) {
                        vui.mo28845a();
                        return;
                    } else if (c == 1) {
                        Log.i("CAR.DRIVINGMODE", "Setting set up notification to not show again");
                        vui.f49990a.edit().putBoolean("do_not_show_notification_again", true).apply();
                        vui.mo28846b();
                        return;
                    } else if (c != 2) {
                        String valueOf2 = String.valueOf(intent.getAction());
                        Log.i("CAR.DRIVINGMODE", valueOf2.length() == 0 ? new String("Unknown action received in DrivingModeSetupNotificationIntentOperation:") : "Unknown action received in DrivingModeSetupNotificationIntentOperation:".concat(valueOf2));
                        return;
                    } else {
                        vui.mo28846b();
                        return;
                    }
                }
            } else if (action.equals("com.google.android.drivingmode.SETUP_REMIND_ME_LATER")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (action.equals("com.google.android.drivingmode.SEND_SETUP_NOTIFICATION")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
