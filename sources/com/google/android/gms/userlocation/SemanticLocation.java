package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SemanticLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwe();

    /* renamed from: a */
    public static final List f109572a = new ArrayList(0);

    /* renamed from: b */
    public final int f109573b;

    /* renamed from: c */
    public final long f109574c;

    /* renamed from: d */
    public final TransitEstimate f109575d;

    /* renamed from: e */
    public final List f109576e;

    /* renamed from: f */
    public final List f109577f;

    /* renamed from: g */
    public final Position f109578g;

    public SemanticLocation(int i, long j, TransitEstimate transitEstimate, List list, List list2, Position position) {
        this.f109573b = i;
        this.f109574c = j;
        this.f109575d = transitEstimate;
        this.f109576e = list;
        this.f109577f = list2;
        this.f109578g = position;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109573b);
        see.m35036a(parcel, 2, this.f109574c);
        see.m35040a(parcel, 3, this.f109575d, i, false);
        see.m35066c(parcel, 4, this.f109576e, false);
        see.m35066c(parcel, 5, this.f109577f, false);
        see.m35040a(parcel, 6, this.f109578g, i, false);
        see.m35062b(parcel, a);
    }
}
