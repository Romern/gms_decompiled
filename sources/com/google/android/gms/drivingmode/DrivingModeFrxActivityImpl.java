package com.google.android.gms.drivingmode;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemProperties;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeFrxActivityImpl extends Activity implements vul {

    /* renamed from: a */
    vum f31227a;

    /* renamed from: a */
    public final vum mo18365a() {
        return this.f31227a;
    }

    /* renamed from: b */
    public final Bundle mo18366b() {
        Bundle bundle = new Bundle();
        boolean booleanExtra = getIntent().getBooleanExtra("frx_immediate_start", false);
        bundle.putBoolean("DrivingMode.ImmediateStart", booleanExtra);
        int intExtra = getIntent().getIntExtra("client_trigger_reason", 0);
        bundle.putInt("DrivingMode.ClientTriggerReason", intExtra);
        Log.i("CAR.DRIVINGMODE", String.format("DrivingModeFrxActivityImpl started with session arguments: immediateStart = %s; clientTriggerReason = %s", Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra)));
        return bundle;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        char c;
        int i = Build.VERSION.SDK_INT;
        setTheme(bnc.m3376a(SystemProperties.get("setupwizard.theme", "")));
        super.onCreate(bundle);
        this.f31227a = new vum(this, null);
        if (getIntent().hasExtra("FRX_START_FRAGMENT")) {
            String stringExtra = getIntent().getStringExtra("FRX_START_FRAGMENT");
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1135185847) {
                if (hashCode == 1733800235 && stringExtra.equals("GEARHEAD_INSTALL")) {
                    c = 1;
                    if (c == 0) {
                        fragment = new vtc();
                    } else if (c != 1) {
                        fragment = new vtl();
                    } else {
                        fragment = new vtf();
                    }
                }
            } else if (stringExtra.equals("DND_ACCESS")) {
                c = 0;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        } else {
            fragment = new vtl();
        }
        this.f31227a.mo28864a(fragment);
        if (getIntent().getBooleanExtra("com.google.android.location.activity.DRIVING_MODE_NOTIFICATION", true)) {
            vuk.m41322a();
            vuk.m41326e(this).mo28759a(bpeb.DRIVING_MODE_FRX_INTRO, bpea.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION);
        }
        setRequestedOrientation(1);
        new vui(getApplicationContext()).mo28846b();
    }
}
