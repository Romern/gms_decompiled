package p000;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mws implements mvt {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34859a;

    public mws(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34859a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        luj luj;
        Activity activity = this.f34859a.getActivity();
        if (activity != null) {
            ltt ltt = new mty(activity).f34730b;
            int i = Build.VERSION.SDK_INT;
            rex rex = new rex();
            if (skh.m35531a().mo25690a(ltt.f32989b, ltt.f32988a, rex, 1)) {
                try {
                    IBinder a = rex.mo24567a();
                    if (a != null) {
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                        luj = !(queryLocalInterface instanceof luj) ? new luh(a) : (luj) queryLocalInterface;
                    } else {
                        luj = null;
                    }
                    luj.mo19607a();
                    try {
                        skh.m35531a().mo25689a(ltt.f32989b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        e = e;
                    }
                } catch (RemoteException | InterruptedException e2) {
                    Log.w("BackupStatsClient", e2);
                    try {
                        skh.m35531a().mo25689a(ltt.f32989b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        e = e3;
                    }
                } catch (Throwable th) {
                    try {
                        skh.m35531a().mo25689a(ltt.f32989b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        Log.w("BackupStatsClient", "Exception when unbinding: ", e4);
                    }
                    throw th;
                }
            }
        }
        return null;
        Log.w("BackupStatsClient", "Exception when unbinding: ", e);
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Void voidR = (Void) obj;
        this.f34859a.mo17262b((mvs) null);
    }
}
