package p000;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.beacon.BleFilter;

/* renamed from: nei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nei implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    parcelUuid = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 5:
                    parcelUuid2 = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 6:
                    parcelUuid3 = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 9:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 10:
                    bArr3 = sed.m35023t(parcel, readInt);
                    break;
                case 11:
                    bArr4 = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new BleFilter(str, str2, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i, bArr3, bArr4);
    }
}
