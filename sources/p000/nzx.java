package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;

/* renamed from: nzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarDisplay[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        CarDisplayId carDisplayId = null;
        Point point = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                carDisplayId = (CarDisplayId) sed.m34998a(parcel, readInt, CarDisplayId.CREATOR);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                point = (Point) sed.m34998a(parcel, readInt, Point.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CarDisplay(carDisplayId, i, i2, point);
    }
}
