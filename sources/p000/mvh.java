package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: mvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvh {

    /* renamed from: a */
    public static final /* synthetic */ int f34801a = 0;

    /* renamed from: b */
    private static final lvn f34802b = new lvn("PhotosBackupApiClient");

    /* renamed from: c */
    private static final Intent f34803c = new Intent().setPackage("com.google.android.apps.photos").setAction("com.google.android.apps.photos.backup.apiservice.PHOTOS_BACKUP_SERVICE");

    /* renamed from: d */
    private final Context f34804d;

    public mvh(Context context) {
        this.f34804d = context;
    }

    /* renamed from: a */
    public final Boolean mo20270a(mvg mvg) {
        beaz beaz;
        rex rex = new rex();
        if (!skh.m35531a().mo25690a(this.f34804d, f34803c, rex, 1)) {
            return false;
        }
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.libraries.photos.backup.api.IPhotosBackup");
                beaz = !(queryLocalInterface instanceof beaz) ? new beaz(a) : (beaz) queryLocalInterface;
            } else {
                beaz = null;
            }
            Boolean valueOf = Boolean.valueOf(mvg.mo20269a(beaz));
            try {
                skh.m35531a().mo25689a(this.f34804d, rex);
            } catch (IllegalArgumentException | IllegalStateException e) {
                f34802b.mo25415d("Exception when unbinding: ", e, new Object[0]);
            }
            return valueOf;
        } catch (RemoteException | InterruptedException e2) {
            f34802b.mo25410a(e2);
            try {
                skh.m35531a().mo25689a(this.f34804d, rex);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                f34802b.mo25415d("Exception when unbinding: ", e3, new Object[0]);
            }
            return false;
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(this.f34804d, rex);
            } catch (IllegalArgumentException | IllegalStateException e4) {
                f34802b.mo25415d("Exception when unbinding: ", e4, new Object[0]);
            }
            throw th;
        }
    }
}
