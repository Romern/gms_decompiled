package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: aenm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenm extends dcj implements aeno {
    public aenm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IPhotosCallbacks");
    }

    /* renamed from: a */
    public final void mo34377a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placePhotoMetadataResult);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo34378a(PlacePhotoResult placePhotoResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placePhotoResult);
        mo8530c(2, bj);
    }
}
