package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentActionEntity extends GamesAbstractSafeParcelable implements AppContentAction {
    public static final Parcelable.Creator CREATOR = new aadj();

    /* renamed from: a */
    public final String f32560a;

    /* renamed from: b */
    public final Bundle f32561b;

    /* renamed from: c */
    public final String f32562c;

    /* renamed from: d */
    public final String f32563d;

    /* renamed from: e */
    public final AppContentAnnotationEntity f32564e;

    /* renamed from: f */
    public final String f32565f;

    /* renamed from: g */
    private final ArrayList f32566g;

    public AppContentActionEntity(ArrayList arrayList, String str, Bundle bundle, String str2, String str3, AppContentAnnotationEntity appContentAnnotationEntity, String str4) {
        this.f32564e = appContentAnnotationEntity;
        this.f32566g = arrayList;
        this.f32560a = str;
        this.f32561b = bundle;
        this.f32563d = str3;
        this.f32565f = str4;
        this.f32562c = str2;
    }

    /* renamed from: a */
    public final AppContentAnnotation mo19295a() {
        return this.f32564e;
    }

    /* renamed from: b */
    public final List mo19296b() {
        return new ArrayList(this.f32566g);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19297c() {
        return this.f32560a;
    }

    /* renamed from: d */
    public final Bundle mo19298d() {
        return this.f32561b;
    }

    /* renamed from: f */
    public final String mo19299f() {
        return this.f32563d;
    }

    /* renamed from: g */
    public final String mo19300g() {
        return this.f32565f;
    }

    /* renamed from: h */
    public final String mo19301h() {
        return this.f32562c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32564e, mo19296b(), this.f32560a, Integer.valueOf(aaeb.m21131a(this.f32561b)), this.f32563d, this.f32565f, this.f32562c});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentAction) {
            if (this == obj) {
                return true;
            }
            AppContentAction appContentAction = (AppContentAction) obj;
            if (!sdg.m34949a(appContentAction.mo19295a(), this.f32564e) || !sdg.m34949a(appContentAction.mo19296b(), mo19296b()) || !sdg.m34949a(appContentAction.mo19297c(), this.f32560a) || !aaeb.m21132a(appContentAction.mo19298d(), this.f32561b) || !sdg.m34949a(appContentAction.mo19299f(), this.f32563d) || !sdg.m34949a(appContentAction.mo19300g(), this.f32565f) || !sdg.m34949a(appContentAction.mo19301h(), this.f32562c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Annotation", this.f32564e);
        a.mo25396a("Conditions", mo19296b());
        a.mo25396a("ContentDescription", this.f32560a);
        a.mo25396a("Extras", this.f32561b);
        a.mo25396a("Id", this.f32563d);
        a.mo25396a("OverflowText", this.f32565f);
        a.mo25396a("Type", this.f32562c);
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
        see.m35066c(parcel, 1, mo19296b(), false);
        see.m35046a(parcel, 2, this.f32560a, false);
        see.m35037a(parcel, 3, this.f32561b, false);
        see.m35046a(parcel, 6, this.f32562c, false);
        see.m35046a(parcel, 7, this.f32563d, false);
        see.m35040a(parcel, 8, this.f32564e, i, false);
        see.m35046a(parcel, 9, this.f32565f, false);
        see.m35062b(parcel, a);
    }
}
