package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements aelp {
    public static final Parcelable.Creator CREATOR = new aeoe();

    /* renamed from: a */
    public final PlaceEntity f79558a;

    /* renamed from: b */
    public final float f79559b;

    public PlaceLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.f79558a = placeEntity;
        this.f79559b = f;
    }

    /* renamed from: a */
    public static PlaceLikelihoodEntity m66960a(PlaceEntity placeEntity, float f) {
        sdo.m34959a(placeEntity);
        return new PlaceLikelihoodEntity(placeEntity, f);
    }

    /* renamed from: bA */
    public final float mo8028bA() {
        return this.f79559b;
    }

    /* renamed from: bB */
    public final aelh mo8029bB() {
        return this.f79558a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final ContentValues mo43692c() {
        ContentValues s = this.f79558a.mo43688s();
        s.put("place_likelihood", Float.valueOf(this.f79559b));
        s.put("data", sef.m35074a(this));
        return s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceLikelihoodEntity) {
            PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
            return this.f79558a.equals(placeLikelihoodEntity.f79558a) && this.f79559b == placeLikelihoodEntity.f79559b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79558a, Float.valueOf(this.f79559b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("place", this.f79558a);
        a.mo25396a("likelihood", Float.valueOf(this.f79559b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79558a, i, false);
        see.m35034a(parcel, 2, this.f79559b);
        see.m35062b(parcel, a);
    }
}
