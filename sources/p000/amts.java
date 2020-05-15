package p000;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: amts */
public final /* synthetic */ class amts implements aubw {

    /* renamed from: a */
    private final ContactsSyncCoreChimeraActivity f75921a;

    public amts(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.f75921a = contactsSyncCoreChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.f75921a;
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
        contactsSyncCoreChimeraActivity.mo46473a(amuh.m63297a(backupAndSyncOptInState));
        if (amup.m63317a(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.f82047b.mo41348g();
        } else if (amup.m63319b(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.f82047b.mo41347e();
        } else if (cfus.m143109g()) {
            contactsSyncCoreChimeraActivity.f82047b.mo41348g();
        } else {
            contactsSyncCoreChimeraActivity.f82047b.mo41347e();
        }
    }
}
