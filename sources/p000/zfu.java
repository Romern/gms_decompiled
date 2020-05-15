package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.result.DataSourceStatsResult;
import com.google.android.gms.fitness.result.DataStatsResult;
import java.util.ArrayList;

/* renamed from: zfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataStatsResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        Status status = null;
        ArrayList arrayList = null;
        String str = null;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    arrayList = sed.m35005c(parcel, readInt, DataSourceStatsResult.CREATOR);
                    break;
                case 3:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel, readInt);
                    break;
                case 6:
                    dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DataStatsResult(status, arrayList, j, str, j2, dataHolder);
    }
}
