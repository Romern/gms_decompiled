package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;

/* renamed from: frl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchCorpusConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int[] iArr = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iArr = sed.m35026w(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                featureArr = (Feature[]) sed.m35004b(parcel, readInt, Feature.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GlobalSearchCorpusConfig(iArr, featureArr);
    }
}
