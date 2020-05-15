package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.FullTextSearchFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

/* renamed from: vgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FilterHolder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ComparisonFilter comparisonFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        LogicalFilter logicalFilter = null;
        NotFilter notFilter = null;
        InFilter inFilter = null;
        MatchAllFilter matchAllFilter = null;
        HasFilter hasFilter = null;
        FullTextSearchFilter fullTextSearchFilter = null;
        OwnedByMeFilter ownedByMeFilter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) sed.m34998a(parcel, readInt, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) sed.m34998a(parcel, readInt, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) sed.m34998a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) sed.m34998a(parcel, readInt, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) sed.m34998a(parcel, readInt, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) sed.m34998a(parcel, readInt, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) sed.m34998a(parcel, readInt, HasFilter.CREATOR);
                    break;
                case 8:
                    fullTextSearchFilter = (FullTextSearchFilter) sed.m34998a(parcel, readInt, FullTextSearchFilter.CREATOR);
                    break;
                case 9:
                    ownedByMeFilter = (OwnedByMeFilter) sed.m34998a(parcel, readInt, OwnedByMeFilter.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FilterHolder(comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter, fullTextSearchFilter, ownedByMeFilter);
    }
}
