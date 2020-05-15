package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: uez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uez implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CallingAppInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CallingAppInfo(parcel.readString(), parcel.readString(), parcel.readInt());
    }
}
