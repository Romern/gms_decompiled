package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;

/* renamed from: fsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 11) {
                str4 = sed.m35020q(parcel, readInt);
            } else if (a != 12) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 2:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 3:
                        z = sed.m35006c(parcel, readInt);
                        continue;
                    case 4:
                        i = sed.m35010g(parcel, readInt);
                        continue;
                    case 5:
                        z2 = sed.m35006c(parcel, readInt);
                        continue;
                    case 6:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        featureArr = (Feature[]) sed.m35004b(parcel, readInt, Feature.CREATOR);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                scoringConfig = (ScoringConfig) sed.m34998a(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }
}
