package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FilterHolder extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vgl();

    /* renamed from: a */
    final ComparisonFilter f31103a;

    /* renamed from: b */
    final FieldOnlyFilter f31104b;

    /* renamed from: c */
    final LogicalFilter f31105c;

    /* renamed from: d */
    final NotFilter f31106d;

    /* renamed from: e */
    final InFilter f31107e;

    /* renamed from: f */
    final MatchAllFilter f31108f;

    /* renamed from: g */
    final HasFilter f31109g;

    /* renamed from: h */
    final FullTextSearchFilter f31110h;

    /* renamed from: i */
    final OwnedByMeFilter f31111i;

    /* renamed from: j */
    public final Filter f31112j;

    public FilterHolder(Filter filter) {
        ComparisonFilter comparisonFilter;
        FieldOnlyFilter fieldOnlyFilter;
        LogicalFilter logicalFilter;
        NotFilter notFilter;
        InFilter inFilter;
        MatchAllFilter matchAllFilter;
        HasFilter hasFilter;
        FullTextSearchFilter fullTextSearchFilter;
        sdo.checkIfNull(filter, "Null filter.");
        OwnedByMeFilter ownedByMeFilter = null;
        if (filter instanceof ComparisonFilter) {
            comparisonFilter = (ComparisonFilter) filter;
        } else {
            comparisonFilter = null;
        }
        this.f31103a = comparisonFilter;
        if (filter instanceof FieldOnlyFilter) {
            fieldOnlyFilter = (FieldOnlyFilter) filter;
        } else {
            fieldOnlyFilter = null;
        }
        this.f31104b = fieldOnlyFilter;
        if (filter instanceof LogicalFilter) {
            logicalFilter = (LogicalFilter) filter;
        } else {
            logicalFilter = null;
        }
        this.f31105c = logicalFilter;
        if (filter instanceof NotFilter) {
            notFilter = (NotFilter) filter;
        } else {
            notFilter = null;
        }
        this.f31106d = notFilter;
        if (filter instanceof InFilter) {
            inFilter = (InFilter) filter;
        } else {
            inFilter = null;
        }
        this.f31107e = inFilter;
        if (filter instanceof MatchAllFilter) {
            matchAllFilter = (MatchAllFilter) filter;
        } else {
            matchAllFilter = null;
        }
        this.f31108f = matchAllFilter;
        if (filter instanceof HasFilter) {
            hasFilter = (HasFilter) filter;
        } else {
            hasFilter = null;
        }
        this.f31109g = hasFilter;
        if (filter instanceof FullTextSearchFilter) {
            fullTextSearchFilter = (FullTextSearchFilter) filter;
        } else {
            fullTextSearchFilter = null;
        }
        this.f31110h = fullTextSearchFilter;
        ownedByMeFilter = filter instanceof OwnedByMeFilter ? (OwnedByMeFilter) filter : ownedByMeFilter;
        this.f31111i = ownedByMeFilter;
        if (this.f31103a == null && this.f31104b == null && this.f31105c == null && this.f31106d == null && this.f31107e == null && this.f31108f == null && this.f31109g == null && this.f31110h == null && ownedByMeFilter == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.f31112j = filter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31103a, i, false);
        see.m35040a(parcel, 2, this.f31104b, i, false);
        see.m35040a(parcel, 3, this.f31105c, i, false);
        see.m35040a(parcel, 4, this.f31106d, i, false);
        see.m35040a(parcel, 5, this.f31107e, i, false);
        see.m35040a(parcel, 6, this.f31108f, i, false);
        see.m35040a(parcel, 7, this.f31109g, i, false);
        see.m35040a(parcel, 8, this.f31110h, i, false);
        see.m35040a(parcel, 9, this.f31111i, i, false);
        see.m35062b(parcel, a);
    }

    public FilterHolder(ComparisonFilter comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter inFilter, MatchAllFilter matchAllFilter, HasFilter hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.f31103a = comparisonFilter;
        this.f31104b = fieldOnlyFilter;
        this.f31105c = logicalFilter;
        this.f31106d = notFilter;
        this.f31107e = inFilter;
        this.f31108f = matchAllFilter;
        this.f31109g = hasFilter;
        this.f31110h = fullTextSearchFilter;
        this.f31111i = ownedByMeFilter;
        if (comparisonFilter != null) {
            this.f31112j = comparisonFilter;
        } else if (fieldOnlyFilter != null) {
            this.f31112j = fieldOnlyFilter;
        } else if (logicalFilter != null) {
            this.f31112j = logicalFilter;
        } else if (notFilter != null) {
            this.f31112j = notFilter;
        } else if (inFilter != null) {
            this.f31112j = inFilter;
        } else if (matchAllFilter != null) {
            this.f31112j = matchAllFilter;
        } else if (hasFilter != null) {
            this.f31112j = hasFilter;
        } else if (fullTextSearchFilter != null) {
            this.f31112j = fullTextSearchFilter;
        } else if (ownedByMeFilter != null) {
            this.f31112j = ownedByMeFilter;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }
}
