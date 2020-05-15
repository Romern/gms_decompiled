package com.google.android.gms.thunderbird.settings;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.thunderbird.settings.provider.ThunderbirdSettingsChimeraContentProvider;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdSettingsChimeraActivity extends suy {

    /* renamed from: b */
    private Executor f109069b;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo26142e(boolean z) {
        try {
            ThunderbirdSettingsChimeraContentProvider.m93360a(this, "enabled", Boolean.valueOf(z));
        } catch (IOException e) {
            auho.m77069a(this, e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109069b = snp.m35704b(9);
        setContentView((int) C0126R.C0128layout.thunderbird_settings);
        ((TextView) findViewById(C0126R.C0129id.explanation_text)).setMovementMethod(LinkMovementMethod.getInstance());
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
        this.f109069b.execute(new auhd(this));
    }
}
