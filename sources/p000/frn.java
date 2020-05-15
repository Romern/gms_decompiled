package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;

/* renamed from: frn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchQuerySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        CorpusId[] corpusIdArr = null;
        CorpusScoringInfo[] corpusScoringInfoArr = null;
        String str = null;
        byte[] bArr = null;
        int[] iArr = null;
        byte[] bArr2 = null;
        STSortSpec sTSortSpec = null;
        String str2 = null;
        CacheSpec cacheSpec = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        int i5 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    corpusIdArr = (CorpusId[]) sed.m35004b(parcel2, readInt, CorpusId.CREATOR);
                    break;
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    corpusScoringInfoArr = (CorpusScoringInfo[]) sed.m35004b(parcel2, readInt, CorpusScoringInfo.CREATOR);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 10:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 14:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 15:
                    sTSortSpec = (STSortSpec) sed.m34998a(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case 16:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 18:
                    cacheSpec = (CacheSpec) sed.m34998a(parcel2, readInt, CacheSpec.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GlobalSearchQuerySpecification(corpusIdArr, i, corpusScoringInfoArr, i2, i3, i4, str, z, bArr, z2, z3, z4, iArr, bArr2, sTSortSpec, str2, i5, cacheSpec);
    }
}
