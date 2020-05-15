package com.google.android.gms.people.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleInternalSettingsChimeraActivity extends deu {

    /* renamed from: b */
    private amrv f82046b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DebugUploaderListSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            amig.m62939a();
            if (!((Boolean) amho.f74917a.mo41191a()).booleanValue()) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            intent.putExtra("settings_mode", 3);
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Debug Data Uploaders", 21);
            googleSettingsItem.f29961g = true;
            amig.m62939a();
            googleSettingsItem.f29962h = ((Boolean) amhm.f74915a.mo41191a()).booleanValue();
            return googleSettingsItem;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MenagerieInternalDebugSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            amig.m62939a();
            boolean booleanValue = ((Boolean) amho.f74917a.mo41191a()).booleanValue();
            amig.m62939a();
            boolean booleanValue2 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83292aV()).booleanValue();
            if (!booleanValue || !booleanValue2) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            intent.putExtra("settings_mode", 4);
            return new GoogleSettingsItem(intent, 2, "Menagerie Debug Settings", 39);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PeopleInternalSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            amig.m62939a();
            if (((Boolean) amho.f74917a.mo41191a()).booleanValue()) {
                intent.putExtra("settings_mode", 1);
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "People debug", 47);
            googleSettingsItem.f29961g = true;
            googleSettingsItem.f29962h = ((Boolean) rsv.f43619h.mo25081c()).booleanValue();
            return googleSettingsItem;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        amig.m62939a();
        if (((Boolean) amho.f74917a.mo41191a()).booleanValue()) {
            setContentView((int) C0126R.C0128layout.people_settings_fragment_container);
            int intExtra = getIntent().getIntExtra("settings_mode", 0);
            if (intExtra == 1) {
                fragment = new amrn();
            } else if (intExtra == 2) {
                fragment = new amqw();
            } else if (intExtra == 3) {
                fragment = new amrd();
            } else if (intExtra != 4) {
                amdk.m62659b("PeopleISA", "PeopleInternalSettings requires a '%s' extra but did not recognize the value %s", "settings_mode", Integer.valueOf(intExtra));
                finish();
                fragment = null;
            } else {
                fragment = new amrm();
            }
            if (fragment != null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.add((int) C0126R.C0129id.people_settings_fragment_container, fragment);
                beginTransaction.commit();
                return;
            }
            return;
        }
        amrv amrv = new amrv();
        this.f82046b = amrv;
        amrv.mo41286a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.addView(this.f82046b.mo41282a(getLayoutInflater(), viewGroup));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        amrv amrv = this.f82046b;
        if (amrv != null) {
            amrv.mo41284a(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amrv amrv = this.f82046b;
        if (amrv != null) {
            amrv.mo41285a(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        amrv amrv = this.f82046b;
        if (amrv != null) {
            amrv.mo41283a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        amrv amrv = this.f82046b;
        if (amrv != null) {
            amrv.mo41288b();
        }
        super.onStop();
    }
}
