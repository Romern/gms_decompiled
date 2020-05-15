package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderRequest;

/* renamed from: bjun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjun implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PaySePerformSdkOperationAsyncTaskLoaderRequest(parcel.readInt(), (Account) Account.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaySePerformSdkOperationAsyncTaskLoaderRequest[i];
    }
}
