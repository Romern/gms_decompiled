package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.photos.backup.api.AutoBackupState;

/* renamed from: mxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mxk {

    /* renamed from: a */
    public static final /* synthetic */ int f34888a = 0;

    /* renamed from: b */
    private static final lvn f34889b = new lvn("PhotosBackupApiClient");

    /* renamed from: c */
    private static final Intent f34890c = new Intent().setPackage("com.google.android.apps.photos").setAction("com.google.android.apps.photos.backup.apiservice.PHOTOS_BACKUP_SERVICE");

    /* renamed from: d */
    private final Context f34891d;

    public mxk(Context context) {
        this.f34891d = context;
    }

    /* renamed from: a */
    public final AutoBackupState mo20293a() {
        return (AutoBackupState) mo20294a(mxf.f34884a);
    }

    /* renamed from: a */
    public final Object mo20294a(mxj mxj) {
        beaz beaz;
        rex rex = new rex();
        if (!skh.m35531a().mo25690a(this.f34891d, f34890c, rex, 1)) {
            return null;
        }
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.libraries.photos.backup.api.IPhotosBackup");
                beaz = !(queryLocalInterface instanceof beaz) ? new beaz(a) : (beaz) queryLocalInterface;
            } else {
                beaz = null;
            }
            Object a2 = mxj.mo20292a(beaz);
            try {
                skh.m35531a().mo25689a(this.f34891d, rex);
            } catch (IllegalArgumentException | IllegalStateException e) {
                f34889b.mo25415d("Exception when unbinding: ", e, new Object[0]);
            }
            return a2;
        } catch (RemoteException | InterruptedException e2) {
            f34889b.mo25410a(e2);
            try {
                skh.m35531a().mo25689a(this.f34891d, rex);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                f34889b.mo25415d("Exception when unbinding: ", e3, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(this.f34891d, rex);
            } catch (IllegalArgumentException | IllegalStateException e4) {
                f34889b.mo25415d("Exception when unbinding: ", e4, new Object[0]);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo20295a(String str) {
        return Boolean.TRUE.equals(mo20294a(new mxg(str)));
    }
}
