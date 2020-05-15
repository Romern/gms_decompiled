package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;

/* renamed from: vfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Query[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        LogicalFilter logicalFilter = null;
        String str = null;
        SortOrder sortOrder = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    logicalFilter = (LogicalFilter) sed.m34998a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 2:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    sortOrder = (SortOrder) sed.m34998a(parcel, readInt, SortOrder.CREATOR);
                    break;
                case 5:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = sed.m35005c(parcel, readInt, DriveSpace.CREATOR);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Query(logicalFilter, str, sortOrder, arrayList, z, arrayList2, z2);
    }
}
