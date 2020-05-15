package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentAnnotationEntity extends GamesAbstractSafeParcelable implements AppContentAnnotation {
    public static final Parcelable.Creator CREATOR = new aadk();

    /* renamed from: a */
    public final String f32567a;

    /* renamed from: b */
    public final Uri f32568b;

    /* renamed from: c */
    public final String f32569c;

    /* renamed from: d */
    public final String f32570d;

    /* renamed from: e */
    public final String f32571e;

    /* renamed from: f */
    public final String f32572f;

    /* renamed from: g */
    public final int f32573g;

    /* renamed from: h */
    public final int f32574h;

    /* renamed from: i */
    public final Bundle f32575i;

    public AppContentAnnotationEntity(String str, Uri uri, String str2, String str3, String str4, String str5, int i, int i2, Bundle bundle) {
        this.f32567a = str;
        this.f32570d = str3;
        this.f32572f = str5;
        this.f32573g = i;
        this.f32568b = uri;
        this.f32574h = i2;
        this.f32571e = str4;
        this.f32575i = bundle;
        this.f32569c = str2;
    }

    /* renamed from: a */
    public final String mo19306a() {
        return this.f32567a;
    }

    /* renamed from: b */
    public final String mo19307b() {
        return this.f32570d;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19308c() {
        return this.f32572f;
    }

    /* renamed from: d */
    public final int mo19309d() {
        return this.f32573g;
    }

    /* renamed from: f */
    public final Uri mo19310f() {
        return this.f32568b;
    }

    /* renamed from: g */
    public final Bundle mo19311g() {
        return this.f32575i;
    }

    /* renamed from: h */
    public final int mo19312h() {
        return this.f32574h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32567a, this.f32570d, this.f32572f, Integer.valueOf(this.f32573g), this.f32568b, Integer.valueOf(this.f32574h), this.f32571e, Integer.valueOf(aaeb.m21131a(this.f32575i)), this.f32569c});
    }

    /* renamed from: i */
    public final String mo19313i() {
        return this.f32571e;
    }

    /* renamed from: j */
    public final String mo19314j() {
        return this.f32569c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentAnnotation) {
            if (this == obj) {
                return true;
            }
            AppContentAnnotation appContentAnnotation = (AppContentAnnotation) obj;
            if (!sdg.m34949a(appContentAnnotation.mo19306a(), this.f32567a) || !sdg.m34949a(appContentAnnotation.mo19307b(), this.f32570d) || !sdg.m34949a(appContentAnnotation.mo19308c(), this.f32572f) || !sdg.m34949a(Integer.valueOf(appContentAnnotation.mo19309d()), Integer.valueOf(this.f32573g)) || !sdg.m34949a(appContentAnnotation.mo19310f(), this.f32568b) || !sdg.m34949a(Integer.valueOf(appContentAnnotation.mo19312h()), Integer.valueOf(this.f32574h)) || !sdg.m34949a(appContentAnnotation.mo19313i(), this.f32571e) || !aaeb.m21132a(appContentAnnotation.mo19311g(), this.f32575i) || !sdg.m34949a(appContentAnnotation.mo19314j(), this.f32569c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Description", this.f32567a);
        a.mo25396a("Id", this.f32570d);
        a.mo25396a("ImageDefaultId", this.f32572f);
        a.mo25396a("ImageHeight", Integer.valueOf(this.f32573g));
        a.mo25396a("ImageUri", this.f32568b);
        a.mo25396a("ImageWidth", Integer.valueOf(this.f32574h));
        a.mo25396a("LayoutSlot", this.f32571e);
        a.mo25396a("Modifiers", this.f32575i);
        a.mo25396a("Title", this.f32569c);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32567a, false);
        see.m35040a(parcel, 2, this.f32568b, i, false);
        see.m35046a(parcel, 3, this.f32569c, false);
        see.m35046a(parcel, 5, this.f32570d, false);
        see.m35046a(parcel, 6, this.f32571e, false);
        see.m35046a(parcel, 7, this.f32572f, false);
        see.m35063b(parcel, 8, this.f32573g);
        see.m35063b(parcel, 9, this.f32574h);
        see.m35037a(parcel, 10, this.f32575i, false);
        see.m35062b(parcel, a);
    }
}
