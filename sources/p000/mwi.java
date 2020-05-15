package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwi */
public final /* synthetic */ class mwi implements aubq {

    /* renamed from: a */
    public static final aubq f34846a = new mwi();

    private mwi() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        lvn lvn = DriveBackupSettingsFragment.f29137f;
        if (!aucb.mo50384b()) {
            DriveBackupSettingsFragment.f29137f.mo25417e("Exception writing audit record", aucb.mo50387e(), new Object[0]);
        }
    }
}
