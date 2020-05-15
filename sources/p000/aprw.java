package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;

/* renamed from: aprw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String[] strArr = null;
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 2) {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) sed.m35004b(parcel, readInt, PhraseAffinityCorpusSpec.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetPhraseAffinityCall$Request(strArr, phraseAffinityCorpusSpecArr, bundle);
    }
}
