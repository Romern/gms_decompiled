package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentTupleEntity extends GamesAbstractSafeParcelable implements AppContentTuple {
    public static final Parcelable.Creator CREATOR = new aado();

    /* renamed from: a */
    public final String f32602a;

    /* renamed from: b */
    public final String f32603b;

    public AppContentTupleEntity(String str, String str2) {
        this.f32602a = str;
        this.f32603b = str2;
    }

    /* renamed from: a */
    public final String mo19357a() {
        return this.f32602a;
    }

    /* renamed from: b */
    public final String mo19358b() {
        return this.f32603b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32602a, this.f32603b});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentTuple) {
            if (this == obj) {
                return true;
            }
            AppContentTuple appContentTuple = (AppContentTuple) obj;
            if (!sdg.m34949a(appContentTuple.mo19357a(), this.f32602a) || !sdg.m34949a(appContentTuple.mo19358b(), this.f32603b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Name", this.f32602a);
        a.mo25396a("Value", this.f32603b);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32602a, false);
        see.m35046a(parcel, 2, this.f32603b, false);
        see.m35062b(parcel, a);
    }
}
