package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: frf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        ArrayList arrayList = null;
        String[] strArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, UsageInfo.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                strArr = sed.m34989A(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetRecentContextCall$Response(status, arrayList, strArr);
    }
}
