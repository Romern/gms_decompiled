package p000;

import androidx.preference.TwoStatePreference;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mww implements mvt {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34864a;

    public mww(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34864a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        return Boolean.valueOf(!new rtj(this.f34864a.getContext().getApplicationContext(), "backup_settings", true).getBoolean("use_mobile_data", !((TwoStatePreference) this.f34864a.f29180w).f1642a));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        this.f34864a.f29180w.mo2035i(((Boolean) obj).booleanValue());
    }
}
