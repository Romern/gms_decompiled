package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataSourceStatsResult;

/* renamed from: zfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataSourceStatsResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        DataSource dataSource = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    dataSource = (DataSource) sed.m34998a(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DataSourceStatsResult(dataSource, j, z, j2, j3, j4);
    }
}
