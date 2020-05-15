package com.google.android.gms.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationAccuracyChimeraActivity extends suy {

    /* renamed from: b */
    private Executor f79620b;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo26142e(boolean z) {
        aeri.m52432a(this, z, aerk.ALLOWED, 4, C0126R.string.location_settings_location_accuracy_activity_title, C0126R.string.location_settings_location_accuracy_activity_summary);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f79620b = snp.m35704b(9);
        setContentView((int) C0126R.C0128layout.location_accuracy_settings);
        mo26141d(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f79620b.execute(new aeqr(this));
    }
}
