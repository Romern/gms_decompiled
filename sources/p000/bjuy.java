package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;

/* renamed from: bjuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TapAndPayConsumerVerificationRequest(parcel.readString(), parcel.readByte() != 0, parcel.readByte() != 0, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.createByteArray(), parcel.readByte() != 0);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TapAndPayConsumerVerificationRequest[i];
    }
}
