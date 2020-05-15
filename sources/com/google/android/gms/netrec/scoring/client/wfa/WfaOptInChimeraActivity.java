package com.google.android.gms.netrec.scoring.client.wfa;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WfaOptInChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                int i3 = eoa.f15378a;
                int i4 = Build.VERSION.SDK_INT;
            } else {
                int i5 = eoa.f15378a;
            }
            setResult(i2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            if (aklx.m59989a(this)) {
                aklx.m59987a();
                int i = Build.VERSION.SDK_INT;
            }
            eoa.m10828c("NetRec", "Failed to start this activity as the device is not compatible", new Object[0]);
            finish();
            return;
        }
        new Object[1][0] = action;
        int i2 = eoa.f15378a;
        finish();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }
}
