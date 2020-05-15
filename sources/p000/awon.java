package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.selector.GenericSelectorResult;

/* renamed from: awon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awon implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        bxtx bxtx;
        UserAddress userAddress = (UserAddress) parcel.readParcelable(UserAddress.class.getClassLoader());
        long readLong = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            bxtx = bxtx.m123261a(createByteArray);
        } else {
            bxtx = null;
        }
        return new GenericSelectorResult(userAddress, readLong, z, bxtx, parcel.createByteArray());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GenericSelectorResult[i];
    }
}
