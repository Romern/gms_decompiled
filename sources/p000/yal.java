package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.BlePairViewOptions;

/* renamed from: yal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yal implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BlePairViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        BleDeviceIdentifier bleDeviceIdentifier = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                bleDeviceIdentifier = (BleDeviceIdentifier) sed.m34998a(parcel, readInt, BleDeviceIdentifier.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BlePairViewOptions(bleDeviceIdentifier);
    }
}
