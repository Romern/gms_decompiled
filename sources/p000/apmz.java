package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;

/* renamed from: apmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apmz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetStorageStatsCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                getStorageStatsCall$PackageStatsArr = (GetStorageStatsCall$PackageStats[]) sed.m35004b(parcel, readInt, GetStorageStatsCall$PackageStats.CREATOR);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                j3 = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetStorageStatsCall$Response(status, getStorageStatsCall$PackageStatsArr, j, j2, j3);
    }
}
