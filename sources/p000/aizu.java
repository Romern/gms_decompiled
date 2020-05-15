package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.ble.BleFilter;

/* renamed from: aizu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1) {
                switch (a) {
                    case 4:
                        parcelUuid = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                        continue;
                    case 5:
                        parcelUuid2 = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                        continue;
                    case 6:
                        parcelUuid3 = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                        continue;
                    case 7:
                        bArr = sed.m35023t(parcel, readInt);
                        continue;
                    case 8:
                        bArr2 = sed.m35023t(parcel, readInt);
                        continue;
                    case 9:
                        i2 = sed.m35010g(parcel, readInt);
                        continue;
                    case 10:
                        bArr3 = sed.m35023t(parcel, readInt);
                        continue;
                    case 11:
                        bArr4 = sed.m35023t(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new BleFilter(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }
}
