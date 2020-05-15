package p000;

import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: aenn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenn extends dck implements aeno {

    /* renamed from: a */
    private final aelg f63537a;

    /* renamed from: b */
    private final aelf f63538b;

    public aenn() {
        super("com.google.android.gms.location.places.internal.IPhotosCallbacks");
    }

    /* renamed from: a */
    public final void mo34377a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.f63537a.mo17716a((rkk) placePhotoMetadataResult);
    }

    public aenn(aelf aelf) {
        this();
        this.f63537a = null;
        this.f63538b = aelf;
    }

    /* renamed from: a */
    public final void mo34378a(PlacePhotoResult placePhotoResult) {
        this.f63538b.mo17716a((rkk) placePhotoResult);
    }

    public aenn(aelg aelg) {
        this();
        this.f63537a = aelg;
        this.f63538b = null;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo34378a((PlacePhotoResult) dcl.m8163a(parcel, PlacePhotoResult.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo34377a((PlacePhotoMetadataResult) dcl.m8163a(parcel, PlacePhotoMetadataResult.CREATOR));
            return true;
        }
    }
}
