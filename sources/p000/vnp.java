package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.p039ui.select.path.SearchPathElement;

/* renamed from: vnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchPathElement(parcel.readString());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchPathElement[i];
    }
}
