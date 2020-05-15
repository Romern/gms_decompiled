package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StockProfileImageEntity extends GamesAbstractSafeParcelable implements StockProfileImage {
    public static final Parcelable.Creator CREATOR = new aaev();

    /* renamed from: a */
    public final String f32654a;

    /* renamed from: b */
    public final Uri f32655b;

    public StockProfileImageEntity(String str, Uri uri) {
        this.f32654a = str;
        this.f32655b = uri;
    }

    /* renamed from: a */
    public final String mo19417a() {
        return this.f32654a;
    }

    /* renamed from: b */
    public final Uri mo19418b() {
        return this.f32655b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return sdg.m34949a(this.f32654a, stockProfileImage.mo19417a()) && sdg.m34949a(this.f32655b, stockProfileImage.mo19418b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32654a, this.f32655b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ImageId", this.f32654a);
        a.mo25396a("ImageUri", this.f32655b);
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
        see.m35046a(parcel, 1, this.f32654a, false);
        see.m35040a(parcel, 2, this.f32655b, i, false);
        see.m35062b(parcel, a);
    }
}
