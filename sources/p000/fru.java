package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;

/* renamed from: fru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fru implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinitySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) sed.m35004b(parcel, readInt, PhraseAffinityCorpusSpec.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PhraseAffinitySpecification(phraseAffinityCorpusSpecArr);
    }
}
