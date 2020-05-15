package p000;

import android.util.Log;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: amtt */
public final /* synthetic */ class amtt implements aubt {

    /* renamed from: a */
    private final ContactsSyncCoreChimeraActivity f75922a;

    public amtt(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.f75922a = contactsSyncCoreChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.f75922a;
        contactsSyncCoreChimeraActivity.mo46474e();
        Log.e("SyncCoreActivity", "BackupClient failure", exc);
        contactsSyncCoreChimeraActivity.f82047b.mo41347e();
    }
}
