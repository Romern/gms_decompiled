package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;
import java.util.ArrayList;

/* renamed from: nvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RadioStationInfo.RdsData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    arrayList = sed.m34990B(parcel, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new RadioStationInfo.RdsData(arrayList, i, i2, str, i3, str2, str3, z, z2);
    }
}
