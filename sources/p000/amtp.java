package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

/* renamed from: amtp */
public final /* synthetic */ class amtp implements C0038ax {

    /* renamed from: a */
    private final ContactsSyncCoreChimeraActivity f75918a;

    public amtp(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity) {
        this.f75918a = contactsSyncCoreChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = this.f75918a;
        int intValue = ((Integer) obj).intValue();
        FragmentTransaction beginTransaction = contactsSyncCoreChimeraActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(C0126R.anim.abc_popup_enter, C0126R.anim.abc_popup_exit, C0126R.anim.abc_popup_enter, C0126R.anim.abc_popup_exit);
        if (intValue == 0) {
            beginTransaction.replace(C0126R.C0129id.root, new amub(), "SyncCoreFragment");
        } else if (intValue == 1) {
            beginTransaction.replace(C0126R.C0129id.root, new amsq(), "AccountSyncFragment");
        } else if (intValue == 2) {
            beginTransaction.replace(C0126R.C0129id.root, new amti(), "BackupSyncFragment");
        } else {
            return;
        }
        if (!contactsSyncCoreChimeraActivity.f82048c) {
            beginTransaction.addToBackStack(null);
        }
        contactsSyncCoreChimeraActivity.f82048c = false;
        beginTransaction.commitAllowingStateLoss();
    }
}
