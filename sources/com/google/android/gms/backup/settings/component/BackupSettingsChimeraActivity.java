package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.backup.settings.p033ui.AppsBackupFragment;
import com.google.android.gms.backup.settings.p033ui.BackupAndResetFragment;
import com.google.android.gms.backup.settings.p033ui.DeviceBackupDetailFragment;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupSettingsChimeraActivity extends deu implements dnq {

    /* renamed from: e */
    private static final lvn f29070e = new lvn("BackupSettingsChimeraActivity");

    /* renamed from: b */
    public String f29071b;

    /* renamed from: c */
    public String f29072c;

    /* renamed from: d */
    public aarh f29073d;

    /* renamed from: f */
    private boolean f29074f;

    /* renamed from: g */
    private FragmentManager f29075g;

    /* renamed from: a */
    private final void m21917a(MenuItem menuItem, int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
        menuItem.setIcon(i);
        if (ccoa.m130957c()) {
            menuItem.getIcon().setColorFilter(C1133kh.m17843b(this, C0126R.color.settings_action_bar_icon_color), PorterDuff.Mode.SRC_IN);
        }
        menuItem.setShowAsAction(1);
        menuItem.setVisible(true);
    }

    public final void onCreate(Bundle bundle) {
        mxd mxd;
        setTheme(C0126R.style.BackupSettingsTheme);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.backup_settings_activity_main);
        this.f29074f = getIntent().getBooleanExtra("backup_services_available", true);
        String stringExtra = getIntent().getStringExtra("show_fragment");
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        if (this.f29075g == null) {
            this.f29075g = getSupportFragmentManager();
        }
        Fragment findFragmentByTag = this.f29075g.findFragmentByTag(DriveBackupSettingsFragment.class.getName());
        if (findFragmentByTag instanceof DriveBackupSettingsFragment) {
            mxd = (DriveBackupSettingsFragment) findFragmentByTag;
        } else {
            mxd = null;
        }
        if (AppsBackupFragment.class.getName().equals(stringExtra)) {
            mxd = new AppsBackupFragment();
        } else if (!DriveBackupSettingsFragment.class.getName().equals(stringExtra)) {
            if (BackupAndResetFragment.class.getName().equals(stringExtra)) {
                mxd = new BackupAndResetFragment();
            } else if (DeviceBackupDetailFragment.class.getName().equals(stringExtra)) {
                mxd = new DeviceBackupDetailFragment();
            } else if (!getIntent().getBooleanExtra("hide_reset", false)) {
                mxd = new BackupAndResetFragment();
            } else {
                f29070e.mo25409a("Hiding factory reset option.", new Object[0]);
                if (mxd == null) {
                    mxd = new DriveBackupSettingsFragment();
                }
            }
        } else if (mxd == null) {
            mxd = new DriveBackupSettingsFragment();
        }
        String e = mxd.mo17249e();
        if (e == null) {
            e = "android_backup";
        }
        this.f29071b = e;
        String f = mxd.mo17250f();
        if (f == null) {
            f = "https://support.google.com/mobile/?p=settings_backup";
        }
        this.f29072c = f;
        this.f29073d = new aarh(this);
        this.f29075g.beginTransaction().replace(C0126R.C0129id.main_content, mxd, mxd.getClass().getName()).commit();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        int i;
        if (ccnx.f179588a.mo6606a().mo76507h()) {
            m21917a(menu.add(0, 102, 0, (int) C0126R.string.search_label), C0126R.C0127drawable.quantum_ic_search_googblue_24, new mun(this));
        }
        MenuItem add = menu.add(0, 101, 1, (int) C0126R.string.common_list_apps_menu_help_and_feedback);
        if (!ccnx.f179588a.mo6606a().mo76506g()) {
            i = C0126R.C0127drawable.quantum_ic_help_vd_theme_24;
        } else {
            i = C0126R.C0127drawable.quantum_ic_help_outline_googblue_24;
        }
        m21917a(add, i, new muo(this));
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* renamed from: a */
    public final boolean mo9314a(Preference preference) {
        String str = preference.f1605u;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsActivity");
        if (str != null) {
            intent.putExtra("show_fragment", str);
            intent.putExtra("backup_services_available", this.f29074f);
        }
        startActivity(intent);
        return true;
    }
}
