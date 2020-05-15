package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.ArrayList;

/* renamed from: zfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataReadResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Status status = null;
        ArrayList arrayList3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
            } else if (a == 2) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 3) {
                sed.m35000a(parcel, readInt, arrayList2, getClass().getClassLoader());
            } else if (a == 5) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList3 = sed.m35005c(parcel, readInt, DataSource.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DataReadResult(arrayList, status, arrayList2, i, arrayList3);
    }
}
