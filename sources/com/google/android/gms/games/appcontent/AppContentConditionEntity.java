package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentConditionEntity extends GamesAbstractSafeParcelable implements AppContentCondition {
    public static final Parcelable.Creator CREATOR = new aadm();

    /* renamed from: a */
    public final String f32588a;

    /* renamed from: b */
    public final String f32589b;

    /* renamed from: c */
    public final String f32590c;

    /* renamed from: d */
    public final Bundle f32591d;

    public AppContentConditionEntity(String str, String str2, String str3, Bundle bundle) {
        this.f32588a = str;
        this.f32589b = str2;
        this.f32590c = str3;
        this.f32591d = bundle;
    }

    /* renamed from: a */
    public final String mo19335a() {
        return this.f32588a;
    }

    /* renamed from: b */
    public final String mo19336b() {
        return this.f32589b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19337c() {
        return this.f32590c;
    }

    /* renamed from: d */
    public final Bundle mo19338d() {
        return this.f32591d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32588a, this.f32589b, this.f32590c, this.f32591d});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentCondition) {
            if (this == obj) {
                return true;
            }
            AppContentCondition appContentCondition = (AppContentCondition) obj;
            if (!sdg.m34949a(appContentCondition.mo19335a(), this.f32588a) || !sdg.m34949a(appContentCondition.mo19336b(), this.f32589b) || !sdg.m34949a(appContentCondition.mo19337c(), this.f32590c) || !sdg.m34949a(appContentCondition.mo19338d(), this.f32591d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("DefaultValue", this.f32588a);
        a.mo25396a("ExpectedValue", this.f32589b);
        a.mo25396a("Predicate", this.f32590c);
        a.mo25396a("PredicateParameters", this.f32591d);
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
        see.m35046a(parcel, 1, this.f32588a, false);
        see.m35046a(parcel, 2, this.f32589b, false);
        see.m35046a(parcel, 3, this.f32590c, false);
        see.m35037a(parcel, 4, this.f32591d, false);
        see.m35062b(parcel, a);
    }
}
