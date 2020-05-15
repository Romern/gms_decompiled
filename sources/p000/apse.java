package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* renamed from: apse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apse implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new QueryCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    querySpecification = (QuerySpecification) sed.m34998a(parcel, readInt, QuerySpecification.CREATOR);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new QueryCall$Request(str, str2, strArr, i, i2, querySpecification, bundle);
    }
}
