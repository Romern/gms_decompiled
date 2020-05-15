package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;

/* renamed from: ywp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataSet[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        DataSource dataSource = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a == 1000) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
            } else if (a == 4) {
                arrayList2 = sed.m35005c(parcel, readInt, DataSource.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataSet(i, dataSource, arrayList, arrayList2, z);
    }
}
