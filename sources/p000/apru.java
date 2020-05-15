package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;

/* renamed from: apru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apru implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetDocumentsCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        DocumentResults documentResults = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                documentResults = (DocumentResults) sed.m34998a(parcel, readInt, DocumentResults.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetDocumentsCall$Response(status, documentResults, bundle);
    }
}
