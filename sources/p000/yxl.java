package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.RawDataPoint;
import com.google.android.gms.fitness.data.Value;

/* renamed from: yxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RawDataPoint[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Value[] valueArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    valueArr = (Value[]) sed.m35004b(parcel2, readInt, Value.CREATOR);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new RawDataPoint(j, j2, valueArr, i, i2, j3);
    }
}
