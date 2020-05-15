package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Value;

/* renamed from: ywn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataPoint[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        DataSource dataSource = null;
        Value[] valueArr = null;
        DataSource dataSource2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 5) {
                valueArr = (Value[]) sed.m35004b(parcel, readInt, Value.CREATOR);
            } else if (a == 6) {
                dataSource2 = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                j3 = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataPoint(dataSource, j, j2, valueArr, dataSource2, j3);
    }
}
