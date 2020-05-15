package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarSensorEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        float[] fArr = null;
        byte[] bArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                fArr = sed.m35028y(parcel, readInt);
            } else if (a == 4) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CarSensorEvent(i, i2, j, fArr, bArr);
    }
}
