package com.google.android.gms.backup.p032g1.restore.photos;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.photos.restore.api.RestoreCapability;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.backup.g1.restore.photos.StartPhotosRestoreIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StartPhotosRestoreIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final lvn f29056a = new lvn("StartPhotosRestoreIntentOperation");

    /* renamed from: b */
    private static final long f29057b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a */
    private final void m21909a() {
        Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        rex rex = new rex();
        bebc bebc = null;
        if (skh.m35531a().mo25690a(this, intent, rex, 1)) {
            try {
                IBinder a = rex.mo24568a(f29057b, TimeUnit.MILLISECONDS);
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                bebc = !(queryLocalInterface instanceof bebc) ? new bebc(a) : (bebc) queryLocalInterface;
            } catch (InterruptedException | TimeoutException e) {
                f29056a.mo25410a(e);
            }
        }
        if (bebc != null) {
            try {
                Parcel a2 = bebc.mo8526a(1, bebc.mo8529bj());
                RestoreCapability restoreCapability = (RestoreCapability) dcl.m8163a(a2, RestoreCapability.CREATOR);
                a2.recycle();
                if (restoreCapability != null && restoreCapability.f111408a) {
                    Intent startIntent = IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT");
                    lvt lvt = lvt.f33072a;
                    Account a3 = new lsp(this).mo19591a();
                    if (!(a3 == null || a3.name == null)) {
                        try {
                            if (bebc.mo58521a(a3.name, PendingIntent.getService(this, 0, startIntent, 134217728))) {
                                lvt.mo19677e(this, true);
                                if (ccls.m130527f()) {
                                    aebi aebi = new aebi();
                                    aebi.f63097i = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
                                    aebi.mo34004a(ccls.m130529h(), ccls.m130528g());
                                    aebi.f63099k = "com.google.android.gms.backup.g1.restore.REVIVE_SERVICE";
                                    aebi.f63102n = true;
                                    aeat.m51532a(this).mo33984a(aebi.mo33974b());
                                }
                                skh.m35531a().mo25689a(this, rex);
                            }
                        } catch (RemoteException e2) {
                            f29056a.mo25415d("requestRestore failed", e2, new Object[0]);
                        }
                    }
                }
            } catch (RemoteException e3) {
                f29056a.mo25415d("getRestoreCapability failed", e3, new Object[0]);
            }
        }
        new adzt(Looper.getMainLooper()).post(new moa(this));
        try {
            skh.m35531a().mo25689a(this, rex);
        } catch (IllegalArgumentException | IllegalStateException e4) {
            f29056a.mo25410a(e4);
        }
    }

    public final void onHandleIntent(Intent intent) {
        lvt lvt = lvt.f33072a;
        if (ccls.m130525d() && !lvt.mo19678e(this) && lvt.mo19675d(this) == 1) {
            m21909a();
        }
    }
}
