package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HierarchicalPlaceLikelihoodEntity extends AbstractSafeParcelable implements aekz {
    public static final Parcelable.Creator CREATOR = new aenf();

    /* renamed from: a */
    public static final List f79527a = Collections.emptyList();

    /* renamed from: b */
    public final PlaceEntity f79528b;

    /* renamed from: c */
    public final float f79529c;

    /* renamed from: d */
    public final float f79530d;

    /* renamed from: e */
    public final int f79531e;

    /* renamed from: f */
    public final List f79532f;

    public HierarchicalPlaceLikelihoodEntity(PlaceEntity placeEntity, float f, float f2, int i, List list) {
        this.f79528b = placeEntity;
        this.f79529c = f;
        this.f79530d = f2;
        this.f79531e = i;
        this.f79532f = list;
    }

    /* renamed from: a */
    public static HierarchicalPlaceLikelihoodEntity m66931a(PlaceEntity placeEntity, float f, float f2, int i, List list) {
        sdo.m34959a(placeEntity);
        sdo.m34959a(list);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity, f, f2, i, list);
    }

    /* renamed from: bA */
    public final float mo25148bA() {
        return this.f79529c;
    }

    /* renamed from: bB */
    public final aelh mo25149bB() {
        return this.f79528b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HierarchicalPlaceLikelihoodEntity) {
            HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) obj;
            return this.f79528b.equals(hierarchicalPlaceLikelihoodEntity.f79528b) && this.f79529c == hierarchicalPlaceLikelihoodEntity.f79529c && this.f79530d == hierarchicalPlaceLikelihoodEntity.f79530d && this.f79531e == hierarchicalPlaceLikelihoodEntity.f79531e && this.f79532f.equals(hierarchicalPlaceLikelihoodEntity.f79532f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79528b, Float.valueOf(this.f79529c)});
    }

    /* renamed from: s */
    public final int mo25157s() {
        return this.f79531e;
    }

    /* renamed from: t */
    public final List mo25158t() {
        return this.f79532f;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("place", this.f79528b);
        a.mo25396a("likelihood", Float.valueOf(this.f79529c));
        a.mo25396a("hierarchyLikelihood", Float.valueOf(this.f79530d));
        a.mo25396a("hierarchyLevel", Integer.valueOf(this.f79531e));
        a.mo25396a("containedPlaceIds", this.f79532f.toString());
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79528b, i, false);
        see.m35034a(parcel, 2, this.f79529c);
        see.m35034a(parcel, 3, this.f79530d);
        see.m35063b(parcel, 4, this.f79531e);
        see.m35065b(parcel, 5, this.f79532f, false);
        see.m35062b(parcel, a);
    }
}
