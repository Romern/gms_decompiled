package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.DataUpdateNotification;

/* renamed from: ywu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataUpdateNotification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 2) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                dataType = (DataType) sed.m34998a(parcel, readInt, DataType.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DataUpdateNotification(j, j2, i, dataSource, dataType);
    }
}
