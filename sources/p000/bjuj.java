package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderRequest;

/* renamed from: bjuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PaySeFetchCardAsyncTaskLoaderRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaySeFetchCardAsyncTaskLoaderRequest[i];
    }
}
