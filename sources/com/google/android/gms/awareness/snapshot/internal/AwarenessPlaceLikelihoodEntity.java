package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AwarenessPlaceLikelihoodEntity extends AbstractSafeParcelable implements aelp {
    public static final Parcelable.Creator CREATOR = new lrp();

    /* renamed from: a */
    public final AwarenessPlaceEntity f11705a;

    /* renamed from: b */
    public final float f11706b;

    public AwarenessPlaceLikelihoodEntity(AwarenessPlaceEntity awarenessPlaceEntity, float f) {
        this.f11705a = awarenessPlaceEntity;
        this.f11706b = f;
    }

    /* renamed from: bA */
    public final float mo8028bA() {
        return this.f11706b;
    }

    /* renamed from: bB */
    public final aelh mo8029bB() {
        return this.f11705a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AwarenessPlaceLikelihoodEntity) {
            AwarenessPlaceLikelihoodEntity awarenessPlaceLikelihoodEntity = (AwarenessPlaceLikelihoodEntity) obj;
            return this.f11705a.equals(awarenessPlaceLikelihoodEntity.f11705a) && this.f11706b == awarenessPlaceLikelihoodEntity.f11706b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11705a, Float.valueOf(this.f11706b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("place", this.f11705a);
        a.mo25396a("likelihood", Float.valueOf(this.f11706b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f11705a, i, false);
        see.m35034a(parcel, 2, this.f11706b);
        see.m35062b(parcel, a);
    }
}
