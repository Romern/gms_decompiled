package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyLikelihoodEntity extends AbstractSafeParcelable implements aeld {
    public static final Parcelable.Creator CREATOR = new aens();

    /* renamed from: a */
    public final PlaceEntity f79533a;

    /* renamed from: b */
    public final float f79534b;

    public NearbyLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.f79533a = placeEntity;
        this.f79534b = f;
    }

    /* renamed from: a */
    public static NearbyLikelihoodEntity m66937a(PlaceEntity placeEntity, float f) {
        sdo.m34959a(placeEntity);
        return new NearbyLikelihoodEntity(placeEntity, f);
    }

    /* renamed from: bB */
    public final aelh mo34295bB() {
        return this.f79533a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyLikelihoodEntity) {
            NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) obj;
            return this.f79533a.equals(nearbyLikelihoodEntity.f79533a) && this.f79534b == nearbyLikelihoodEntity.f79534b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79533a, Float.valueOf(this.f79534b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("nearby place", this.f79533a);
        a.mo25396a("likelihood", Float.valueOf(this.f79534b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79533a, i, false);
        see.m35034a(parcel, 2, this.f79534b);
        see.m35062b(parcel, a);
    }
}
