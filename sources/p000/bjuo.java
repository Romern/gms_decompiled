package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderResponse;

/* renamed from: bjuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PaySePerformSdkOperationAsyncTaskLoaderResponse(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (bmit) bjvp.m104731a(parcel, (bxxk) bmit.f129635e.mo74142c(7)));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaySePerformSdkOperationAsyncTaskLoaderResponse[i];
    }
}
