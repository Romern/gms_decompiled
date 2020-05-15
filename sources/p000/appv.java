package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* renamed from: appv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$GlobalSearchSource[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    getGlobalSearchSourcesCall$CorpusInfoArr = (GetGlobalSearchSourcesCall$CorpusInfo[]) sed.m35004b(parcel, readInt, GetGlobalSearchSourcesCall$CorpusInfo.CREATOR);
                    break;
                case 9:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new GetGlobalSearchSourcesCall$GlobalSearchSource(str, str2, i, i2, i3, str3, str4, str5, getGlobalSearchSourcesCall$CorpusInfoArr, z);
    }
}
