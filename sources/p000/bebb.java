package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.photos.backup.api.StatusResult;

/* renamed from: bebb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new StatusResult(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StatusResult[i];
    }
}
