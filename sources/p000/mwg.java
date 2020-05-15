package p000;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwg */
public final /* synthetic */ class mwg implements anz {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34843a;

    public mwg(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34843a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34843a;
        DriveBackupSettingsFragment.f29137f.mo25409a("Use wifi only: %b", obj);
        boolean z = !((Boolean) obj).booleanValue();
        mvd mvd = driveBackupSettingsFragment.f34882B;
        bxvd da = mqy.f34367f.mo74144da();
        if (!z) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqy mqy = (mqy) da.f164949b;
            mqy.f34372d = 9;
            mqy.f34369a |= 4;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqy mqy2 = (mqy) da.f164949b;
            mqy2.f34372d = 8;
            mqy2.f34369a |= 4;
        }
        mvd.mo20268a((mqy) da.mo74062i());
        Context applicationContext = driveBackupSettingsFragment.getContext().getApplicationContext();
        driveBackupSettingsFragment.f29138A.execute(new mwn(new rtj(applicationContext, "backup_settings", true), z, applicationContext));
        return true;
    }
}
