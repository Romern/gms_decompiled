package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;

/* renamed from: aeof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeof extends rtr implements aelp {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtr.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      rtr.a(java.lang.String, int):int
      rtr.a(java.lang.String, android.os.Parcelable$Creator):com.google.android.gms.common.internal.safeparcel.SafeParcelable
      rtr.a(java.lang.String, java.lang.String):java.lang.String
      rtr.a(java.lang.String, java.util.List):java.util.List
      rtr.a(java.lang.String, float):float */
    /* renamed from: bA */
    public final float mo25148bA() {
        return mo25138a("place_likelihood", -1.0f);
    }

    /* renamed from: bB */
    public final aelh mo25149bB() {
        return new aeoj(this.f43672a, this.f43673b);
    }

    public aeof(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return PlaceLikelihoodEntity.m66960a(((aeoj) mo25149bB()).mo7556bF(), mo25148bA());
    }
}
