package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;

/* renamed from: aprt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetDocumentsCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 4) {
                querySpecification = (QuerySpecification) sed.m34998a(parcel, readInt, QuerySpecification.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetDocumentsCall$Request(str, str2, strArr, querySpecification, bundle);
    }
}
