package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;

/* renamed from: aksr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceAccountName[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DeviceAccountName(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
