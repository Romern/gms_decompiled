package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.p039ui.select.path.ViewPathElement;

/* renamed from: vns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vns implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewPathElement[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return vnr.f49589d[parcel.readInt()];
    }
}
