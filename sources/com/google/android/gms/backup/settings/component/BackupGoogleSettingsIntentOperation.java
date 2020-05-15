package com.google.android.gms.backup.settings.component;

import android.os.Build;
import android.os.UserHandle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupGoogleSettingsIntentOperation extends qld {

    /* renamed from: a */
    private static final lvn f29064a = new lvn("BackupGoogleSettingsIO");

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!ccmz.f179479a.mo6606a().mo76403c() || ((long) Build.VERSION.SDK_INT) < ccli.f179330a.mo6606a().mo76291x()) {
            return null;
        }
        if (!cckt.m130240c() || mcl.m24877a()) {
            int i = Build.VERSION.SDK_INT;
            if (ccog.f179619a.mo6606a().mo76530c()) {
                lvp lvp = new lvp(this);
                UserHandle of = UserHandle.of(UserHandle.myUserId());
                if (!lvp.mo19648f() || !lvp.f33054a.isBackupServiceActive(of)) {
                    return null;
                }
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(mcc.m24851a(), 0, (int) C0126R.string.drive_backup_settings_title, 8);
            googleSettingsItem.f29960f = false;
            return googleSettingsItem;
        }
        f29064a.mo25412b("Not displaying backup menu for user != 0", new Object[0]);
        return null;
    }
}
