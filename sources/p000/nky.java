package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;

/* renamed from: nky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nky implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarCall[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        CarCall carCall = null;
        ArrayList arrayList = null;
        String str = null;
        CarCall.Details details = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    carCall = (CarCall) sed.m34998a(parcel, readInt, CarCall.CREATOR);
                    break;
                case 3:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    details = (CarCall.Details) sed.m34998a(parcel, readInt, CarCall.Details.CREATOR);
                    break;
                case 7:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    arrayList2 = sed.m35005c(parcel, readInt, CarCall.CREATOR);
                    break;
                case 9:
                    arrayList3 = sed.m35005c(parcel, readInt, CarCall.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new CarCall(i, carCall, arrayList, str, i2, details, z, arrayList2, arrayList3);
    }
}
