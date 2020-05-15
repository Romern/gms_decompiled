package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: ajdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Update[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Message message = null;
        DistanceImpl distanceImpl = null;
        BleSignalImpl bleSignalImpl = null;
        NearbyDevice nearbyDevice = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    message = (Message) sed.m34998a(parcel, readInt, Message.CREATOR);
                    break;
                case 4:
                    distanceImpl = (DistanceImpl) sed.m34998a(parcel, readInt, DistanceImpl.CREATOR);
                    break;
                case 5:
                    bleSignalImpl = (BleSignalImpl) sed.m34998a(parcel, readInt, BleSignalImpl.CREATOR);
                    break;
                case 6:
                    nearbyDevice = (NearbyDevice) sed.m34998a(parcel, readInt, NearbyDevice.CREATOR);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Update(i, i2, message, distanceImpl, bleSignalImpl, nearbyDevice, bArr);
    }
}
