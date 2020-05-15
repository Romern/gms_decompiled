package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

/* renamed from: ltt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltt {

    /* renamed from: a */
    public static final Intent f32988a = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupStatsService").addCategory("android.intent.category.DEFAULT");

    /* renamed from: b */
    public final Context f32989b;

    public ltt(Context context) {
        sdo.m34959a(context);
        this.f32989b = context;
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo19601a(BackupStatsRequestConfig backupStatsRequestConfig) {
        luj luj;
        int i = Build.VERSION.SDK_INT;
        rex rex = new rex();
        if (!skh.m35531a().mo25690a(this.f32989b, f32988a, rex, 1)) {
            return null;
        }
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                luj = !(queryLocalInterface instanceof luj) ? new luh(a) : (luj) queryLocalInterface;
            } else {
                luj = null;
            }
            ApplicationBackupStats[] a2 = luj.mo19610a(backupStatsRequestConfig);
            try {
                skh.m35531a().mo25689a(this.f32989b, rex);
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.w("BackupStatsClient", "Exception when unbinding: ", e);
            }
            return a2;
        } catch (InterruptedException e2) {
            Log.w("BackupStatsClient", e2);
            try {
                skh.m35531a().mo25689a(this.f32989b, rex);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                Log.w("BackupStatsClient", "Exception when unbinding: ", e3);
            }
            return null;
        } catch (RemoteException e4) {
            Log.w("BackupStatsClient", e4);
            try {
                skh.m35531a().mo25689a(this.f32989b, rex);
            } catch (IllegalArgumentException | IllegalStateException e5) {
                Log.w("BackupStatsClient", "Exception when unbinding: ", e5);
            }
            return null;
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(this.f32989b, rex);
            } catch (IllegalArgumentException | IllegalStateException e6) {
                Log.w("BackupStatsClient", "Exception when unbinding: ", e6);
            }
            throw th;
        }
    }
}
