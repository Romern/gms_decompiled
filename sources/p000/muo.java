package p000;

import android.net.Uri;
import android.os.Build;
import android.view.MenuItem;
import com.google.android.gms.backup.settings.component.BackupSettingsChimeraActivity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

/* renamed from: muo */
public final /* synthetic */ class muo implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final BackupSettingsChimeraActivity f34778a;

    public muo(BackupSettingsChimeraActivity backupSettingsChimeraActivity) {
        this.f34778a = backupSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        BackupSettingsChimeraActivity backupSettingsChimeraActivity = this.f34778a;
        int i = Build.VERSION.SDK_INT;
        if (ccnr.m130890b()) {
            backupSettingsChimeraActivity.f29071b = "android_backup";
            backupSettingsChimeraActivity.f29072c = "https://support.google.com/mobile/?p=android_backup";
        }
        GoogleHelp a = GoogleHelp.m66336a(backupSettingsChimeraActivity.f29071b);
        a.mo43195a(backupSettingsChimeraActivity.getContainerActivity());
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f31623a = 0;
        themeSettings.f31624b = ThemeSettings.m23410a(backupSettingsChimeraActivity);
        a.f78776s = themeSettings;
        a.f78774q = Uri.parse(backupSettingsChimeraActivity.f29072c);
        if (ccnr.m130890b()) {
            a.f78756G = new aard(sre.m36086f(backupSettingsChimeraActivity));
            backupSettingsChimeraActivity.f29073d.mo31646a(a.mo43194a());
            return true;
        }
        if (!sre.m36086f(backupSettingsChimeraActivity)) {
            a.mo43197a(Collections.singletonMap("genie-eng:app_pkg_name", "com.android.settings"));
        } else {
            a.mo43197a(Collections.singletonMap("genie-eng:app_pkg_name", "com.google.android.settings.gphone"));
        }
        backupSettingsChimeraActivity.startActivity(a.mo43194a());
        return true;
    }
}
