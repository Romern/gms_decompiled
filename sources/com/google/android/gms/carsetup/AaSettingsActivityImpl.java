package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AaSettingsActivityImpl extends deu {

    /* renamed from: b */
    static final ComponentName f29533b = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.DiscoverAaSettingsActivity");

    /* renamed from: c */
    public nvu f29534c;

    /* renamed from: a */
    static boolean m22105a(PackageManager packageManager, String str) {
        return new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage(str).resolveActivity(packageManager) != null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nvu nvu = new nvu(this);
        this.f29534c = nvu;
        nvu.mo21727a(bpea.SETTINGS_AA_GOOGLE_SETTINGS_OPEN);
        if (getIntent().hasExtra("gearhead_package")) {
            startActivity(new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage(getIntent().getStringExtra("gearhead_package")));
            finish();
        } else if (m22105a(getPackageManager(), "com.google.android.projection.gearhead")) {
            startActivity(new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage("com.google.android.projection.gearhead"));
            finish();
        } else {
            this.f29534c.mo21727a(bpea.SETTINGS_AA_GOOGLE_SETTINGS_CALL_TO_ACTION);
            setContentView((int) C0126R.C0128layout.discover_aa_settings);
            C1341rz aW = mo8628aW();
            bmxy.m108581a(aW);
            aW.mo15841a(4, 4);
            aW.mo15853b(true);
            ((TextView) findViewById(C0126R.C0129id.discover_aa_title)).setText(getString(C0126R.string.car_setup_discover_aa, new Object[]{getString(C0126R.string.car_app_name)}));
            int b = C1133kh.m17843b(this, C0126R.color.material_grey_700);
            int[] iArr = {C0126R.C0129id.car_setup_discover_nav, C0126R.C0129id.car_setup_discover_media, C0126R.C0129id.car_setup_discover_messaging, C0126R.C0129id.car_setup_discover_voice_control};
            for (int i = 0; i < 4; i++) {
                ((TextView) findViewById(iArr[i])).getCompoundDrawablesRelative()[0].setTint(b);
            }
            Button button = (Button) findViewById(C0126R.C0129id.car_setup_discover_learn_more);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.android.com/auto"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                button.setOnClickListener(new oqu(this, intent));
            } else {
                button.setVisibility(8);
            }
            ((Button) findViewById(C0126R.C0129id.car_setup_discover_get_app)).setOnClickListener(new oqv(this));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onResume() {
        super.onResume();
        if (m22105a(getPackageManager(), "com.google.android.projection.gearhead")) {
            finish();
        }
    }
}
