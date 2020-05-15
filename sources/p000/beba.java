package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;
import com.google.android.libraries.photos.backup.api.StatusResult;

/* renamed from: beba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beba extends dck implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ PhotosBackupPreference f106857a;

    public beba() {
        super("com.google.android.libraries.photos.backup.api.IStatusCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        PhotosBackupPreference photosBackupPreference = this.f106857a;
        lvn lvn = PhotosBackupPreference.f29184a;
        photosBackupPreference.f29187c.post(new mxt(this, (StatusResult) dcl.m8163a(parcel, StatusResult.CREATOR)));
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public beba(PhotosBackupPreference photosBackupPreference) {
        super("com.google.android.libraries.photos.backup.api.IStatusCallback");
        this.f106857a = photosBackupPreference;
    }
}
