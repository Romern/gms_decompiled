package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

/* renamed from: mux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mux extends aeaa {

    /* renamed from: a */
    final /* synthetic */ Account f34788a;

    /* renamed from: b */
    final /* synthetic */ SetBackupAccountFlowChimeraActivity f34789b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mux(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity, String str, Account account) {
        super(str);
        this.f34789b = setBackupAccountFlowChimeraActivity;
        this.f34788a = account;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        SetBackupAccountFlowChimeraActivity.f29080a.mo25418e("BackupAccountManagerService disconnected.", new Object[0]);
        this.f34789b.finishAndRemoveTask();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        lug lug;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                lug = !(queryLocalInterface instanceof lug) ? new lue(iBinder) : (lug) queryLocalInterface;
            } catch (RemoteException e) {
                SetBackupAccountFlowChimeraActivity.f29080a.mo25415d("Failed to set backup account!", e, new Object[0]);
                try {
                    skh.m35531a().mo25689a(this.f34789b, this);
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    SetBackupAccountFlowChimeraActivity.f29080a.mo25415d("Exception when unbinding: ", e2, new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    skh.m35531a().mo25689a(this.f34789b, this);
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    SetBackupAccountFlowChimeraActivity.f29080a.mo25415d("Exception when unbinding: ", e3, new Object[0]);
                }
                this.f34789b.mo17244a(this.f34788a.name);
                throw th;
            }
        } else {
            lug = null;
        }
        lug.mo19605a(this.f34788a);
        try {
            skh.m35531a().mo25689a(this.f34789b, this);
        } catch (IllegalArgumentException | IllegalStateException e4) {
            SetBackupAccountFlowChimeraActivity.f29080a.mo25415d("Exception when unbinding: ", e4, new Object[0]);
        }
        this.f34789b.mo17244a(this.f34788a.name);
    }
}
