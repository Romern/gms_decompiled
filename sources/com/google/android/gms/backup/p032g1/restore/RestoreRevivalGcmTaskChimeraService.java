package com.google.android.gms.backup.p032g1.restore;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.p032g1.restore.photos.PhotosRestoreResultIntentOperation;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RestoreRevivalGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final long f29047a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    private static final lvn f29048b = new lvn("RestoreRevivalGcmTaskChimeraService");

    /* renamed from: b */
    private final boolean m21906b() {
        bebc bebc;
        if (!lvt.f33072a.mo19678e(this)) {
            int i = Settings.Secure.getInt(getContentResolver(), "photos_restore_started", 0);
            lvt.m24492a("photos_restore_started", i, lvt.f33073b);
            if (i == 1) {
                Account a = new lsp(this).mo19591a();
                if (a == null || a.name == null) {
                    f29048b.mo25409a("No backup account", new Object[0]);
                    return false;
                }
                Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
                rex rex = new rex();
                if (skh.m35531a().mo25690a(this, intent, rex, 1)) {
                    try {
                        IBinder a2 = rex.mo24568a(f29047a, TimeUnit.MILLISECONDS);
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                        bebc = !(queryLocalInterface instanceof bebc) ? new bebc(a2) : (bebc) queryLocalInterface;
                    } catch (InterruptedException | TimeoutException e) {
                        try {
                            skh.m35531a().mo25689a(this, rex);
                        } catch (IllegalArgumentException | IllegalStateException e2) {
                            f29048b.mo25410a(e2);
                        }
                        return false;
                    }
                } else {
                    bebc = null;
                }
                try {
                    bebc.mo58521a(a.name, PendingIntent.getService(this, 0, IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT"), 134217728));
                    try {
                        skh.m35531a().mo25689a(this, rex);
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        f29048b.mo25410a(e3);
                    }
                    return true;
                } catch (RemoteException e4) {
                    try {
                        skh.m35531a().mo25689a(this, rex);
                    } catch (IllegalArgumentException | IllegalStateException e5) {
                        f29048b.mo25410a(e5);
                    }
                    return false;
                } catch (Throwable th) {
                    try {
                        skh.m35531a().mo25689a(this, rex);
                    } catch (IllegalArgumentException | IllegalStateException e6) {
                        f29048b.mo25410a(e6);
                    }
                    throw th;
                }
            } else {
                f29048b.mo25409a("Photos restore is not started", new Object[0]);
                return false;
            }
        } else {
            f29048b.mo25409a("Photos restore is complete", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        boolean z;
        rtj rtj = new rtj(this, "com.google.android.gms.backup.g1.restore.REVIVE_SERVICE", true);
        int i = rtj.getInt("numberOfRuns", 0);
        if (((long) i) <= ccls.f179387a.mo6606a().mo76351m()) {
            SharedPreferences.Editor edit = rtj.edit();
            edit.putInt("numberOfRuns", i + 1);
            edit.commit();
            lvt lvt = lvt.f33072a;
            if (lvt.mo19674c(this)) {
                f29048b.mo25409a("MMS restore is complete", new Object[0]);
                z = false;
            } else if (!lvt.mo19672b(this)) {
                f29048b.mo25409a("MMS restore was not started", new Object[0]);
                z = false;
            } else {
                Intent intent = new Intent();
                intent.setClassName(this, "com.google.android.gms.backup.mms.MmsRestoreService");
                startService(intent);
                z = true;
            }
            boolean b = m21906b();
            if (!z && !b) {
                f29048b.mo25409a("Requested restores are complete", new Object[0]);
                return 0;
            }
            f29048b.mo25409a("Requested restores were restarted / still running, checking again soon", new Object[0]);
            return 1;
        }
        SharedPreferences.Editor edit2 = rtj.edit();
        edit2.putInt("numberOfRuns", 0);
        edit2.commit();
        Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.backup.g1.restore.mms.BugleRestoreCompleteIntentOperation", "com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT");
        if (startIntent != null) {
            startService(startIntent);
        }
        f29048b.mo25418e("Requested restores are still complete, but we've hit our max run limit", new Object[0]);
        return 2;
    }
}
