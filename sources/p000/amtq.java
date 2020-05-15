package p000;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: amtq */
public final /* synthetic */ class amtq implements aubw {

    /* renamed from: a */
    private final ContactsSyncCoreChimeraActivity f75919a;

    public amtq(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.f75919a = contactsSyncCoreChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.f75919a;
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
        contactsSyncCoreChimeraActivity.mo46473a(amuh.m63297a(backupAndSyncOptInState));
        if (amup.m63319b(backupAndSyncOptInState)) {
            contactsSyncCoreChimeraActivity.f82047b.mo41347e();
        } else {
            contactsSyncCoreChimeraActivity.f82047b.mo41346d();
        }
    }
}
