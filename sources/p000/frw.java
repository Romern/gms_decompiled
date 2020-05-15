package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;

/* renamed from: frw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new QuerySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int[] iArr = null;
        byte[] bArr = null;
        STSortSpec sTSortSpec = null;
        String str = null;
        CacheSpec cacheSpec = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = true;
        int i4 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 2:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 3:
                    arrayList2 = sed.m35005c(parcel2, readInt, Section.CREATOR);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 11:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 12:
                    sTSortSpec = (STSortSpec) sed.m34998a(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case 13:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    cacheSpec = (CacheSpec) sed.m34998a(parcel2, readInt, CacheSpec.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new QuerySpecification(z, arrayList, arrayList2, z2, i, i2, z3, i3, z4, iArr, bArr, sTSortSpec, str, i4, cacheSpec);
    }
}
