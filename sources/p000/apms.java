package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;

/* renamed from: apms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apms implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackageDetailsCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        CorpusConfigParcelable[] corpusConfigParcelableArr = null;
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = null;
        AppIndexingUserActionInfo[] appIndexingUserActionInfoArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    corpusConfigParcelableArr = (CorpusConfigParcelable[]) sed.m35004b(parcel, readInt, CorpusConfigParcelable.CREATOR);
                    break;
                case 3:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 4:
                    appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) sed.m35004b(parcel, readInt, AppIndexingErrorInfo.CREATOR);
                    break;
                case 5:
                    appIndexingUserActionInfoArr = (AppIndexingUserActionInfo[]) sed.m35004b(parcel, readInt, AppIndexingUserActionInfo.CREATOR);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, j, appIndexingErrorInfoArr, appIndexingUserActionInfoArr, z, z2);
    }
}
