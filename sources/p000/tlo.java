package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;

/* renamed from: tlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tlo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        QueryFilterParameters queryFilterParameters = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, ContextDataFilterImpl.Inclusion.CREATOR);
            } else if (a == 3) {
                arrayList2 = sed.m34992D(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                queryFilterParameters = (QueryFilterParameters) sed.m34998a(parcel, readInt, QueryFilterParameters.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ContextDataFilterImpl(arrayList, arrayList2, queryFilterParameters);
    }
}
