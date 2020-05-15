package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: vti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vti extends IntentOperation {
    public void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            vuk.m41322a();
            vuk.m41329h(getApplicationContext()).f49955a.edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
