package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: nzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarRegionId[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        CarDisplayId carDisplayId = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                carDisplayId = (CarDisplayId) sed.m34998a(parcel, readInt, CarDisplayId.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CarRegionId(i, carDisplayId);
    }
}
