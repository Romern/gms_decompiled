package p000;

import android.content.Intent;
import android.view.MenuItem;
import com.google.android.gms.backup.settings.component.BackupSettingsChimeraActivity;

/* renamed from: mun */
public final /* synthetic */ class mun implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final BackupSettingsChimeraActivity f34777a;

    public mun(BackupSettingsChimeraActivity backupSettingsChimeraActivity) {
        this.f34777a = backupSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f34777a.startActivity(new Intent("com.android.settings.action.SETTINGS_SEARCH"));
        return true;
    }
}
