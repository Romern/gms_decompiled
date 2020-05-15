package p000;

import android.provider.Settings;
import androidx.preference.Preference;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwt implements mvt {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34860a;

    public mwt(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34860a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        return Boolean.valueOf(new mxk(this.f34860a.getActivity()).mo20293a() != null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            PhotosBackupPreference photosBackupPreference = this.f34860a.f29179v;
            lvr lvr = photosBackupPreference.f29193i;
            Settings.Secure.putInt(photosBackupPreference.f1595k.getContentResolver(), "has_enabled_photos_backup_before", 1);
        }
        if (bool.booleanValue() || this.f34860a.f29179v.mo17256g()) {
            DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34860a;
            driveBackupSettingsFragment.f29170m.mo2019a((Preference) driveBackupSettingsFragment.f29179v);
            this.f34860a.mo17248d();
            this.f34860a.mo17265h();
        }
    }
}
