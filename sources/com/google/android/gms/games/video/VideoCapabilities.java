package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VideoCapabilities extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aafx();

    /* renamed from: a */
    public final boolean f32744a;

    /* renamed from: b */
    public final boolean f32745b;

    /* renamed from: c */
    public final boolean f32746c;

    /* renamed from: d */
    public final boolean[] f32747d;

    /* renamed from: e */
    public final boolean[] f32748e;

    public VideoCapabilities(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.f32744a = z;
        this.f32745b = z2;
        this.f32746c = z3;
        this.f32747d = zArr;
        this.f32748e = zArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return sdg.m34949a(videoCapabilities.f32747d, this.f32747d) && sdg.m34949a(videoCapabilities.f32748e, this.f32748e) && sdg.m34949a(Boolean.valueOf(videoCapabilities.f32744a), Boolean.valueOf(this.f32744a)) && sdg.m34949a(Boolean.valueOf(videoCapabilities.f32745b), Boolean.valueOf(this.f32745b)) && sdg.m34949a(Boolean.valueOf(videoCapabilities.f32746c), Boolean.valueOf(this.f32746c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32747d, this.f32748e, Boolean.valueOf(this.f32744a), Boolean.valueOf(this.f32745b), Boolean.valueOf(this.f32746c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("SupportedCaptureModes", this.f32747d);
        a.mo25396a("SupportedQualityLevels", this.f32748e);
        a.mo25396a("CameraSupported", Boolean.valueOf(this.f32744a));
        a.mo25396a("MicSupported", Boolean.valueOf(this.f32745b));
        a.mo25396a("StorageWriteSupported", Boolean.valueOf(this.f32746c));
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, boolean[], boolean):void
     arg types: [android.os.Parcel, int, boolean[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f32744a);
        see.m35051a(parcel, 2, this.f32745b);
        see.m35051a(parcel, 3, this.f32746c);
        see.m35059a(parcel, 4, this.f32747d, false);
        see.m35059a(parcel, 5, this.f32748e, false);
        see.m35062b(parcel, a);
    }
}
