package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;

/* renamed from: appu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$CorpusInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Feature[] featureArr = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                featureArr = (Feature[]) sed.m35004b(parcel, readInt, Feature.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetGlobalSearchSourcesCall$CorpusInfo(str, featureArr, z, bundle);
    }
}
