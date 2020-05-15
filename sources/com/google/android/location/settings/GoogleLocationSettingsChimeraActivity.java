package com.google.android.location.settings;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleLocationSettingsChimeraActivity extends deu implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public bgxe f150921b;

    /* renamed from: c */
    private final bhaf f150922c = new bhaf(this);

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GoogleLocationSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            if (!cexw.f183501a.mo6606a().hideSettings()) {
                int i = Build.VERSION.SDK_INT;
                return new GoogleSettingsItem(new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS"), 4, (int) C0126R.string.common_location_settings_title, 35);
            }
            int i2 = Build.VERSION.SDK_INT;
            return null;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bgzo.m100459a(this);
        getIntent();
        int i = Build.VERSION.SDK_INT;
        if (!bhar.m100526a(this)) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) null);
        builder.setMessage(getString(C0126R.string.location_settings_see_global_settings_dialog_message));
        builder.setPositiveButton(17039370, this);
        builder.setNegativeButton(17039360, this);
        return builder.create();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, (int) C0126R.string.common_list_apps_menu_help_and_feedback);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != 1) {
            return false;
        } else {
            Uri a = aymu.m84284a(this, "ulr_googlelocation");
            GoogleHelp a2 = GoogleHelp.m66336a("android_location");
            a2.f78774q = a;
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.f31624b = ThemeSettings.m23410a(this);
            a2.f78776s = themeSettings;
            new aarh(this).mo31646a(a2.mo43194a());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.f150921b != null) {
            skh.m35531a().mo25689a(this, this.f150922c);
            this.f150921b = null;
        }
    }
}
