package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;

/* renamed from: aprx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        PhraseAffinityResponse phraseAffinityResponse = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                phraseAffinityResponse = (PhraseAffinityResponse) sed.m34998a(parcel, readInt, PhraseAffinityResponse.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetPhraseAffinityCall$Response(status, phraseAffinityResponse, bundle);
    }
}
