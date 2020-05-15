package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentSectionEntity extends GamesAbstractSafeParcelable implements AppContentSection {
    public static final Parcelable.Creator CREATOR = new aadn();

    /* renamed from: a */
    public final String f32592a;

    /* renamed from: b */
    public final Bundle f32593b;

    /* renamed from: c */
    public final String f32594c;

    /* renamed from: d */
    public final String f32595d;

    /* renamed from: e */
    public final String f32596e;

    /* renamed from: f */
    public final String f32597f;

    /* renamed from: g */
    public final String f32598g;

    /* renamed from: h */
    private final ArrayList f32599h;

    /* renamed from: i */
    private final ArrayList f32600i;

    /* renamed from: j */
    private final ArrayList f32601j;

    public AppContentSectionEntity(ArrayList arrayList, ArrayList arrayList2, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList3) {
        this.f32599h = arrayList;
        this.f32601j = arrayList3;
        this.f32600i = arrayList2;
        this.f32598g = str6;
        this.f32592a = str;
        this.f32593b = bundle;
        this.f32597f = str5;
        this.f32594c = str2;
        this.f32595d = str3;
        this.f32596e = str4;
    }

    /* renamed from: a */
    public final List mo19343a() {
        return new ArrayList(this.f32599h);
    }

    /* renamed from: b */
    public final List mo19344b() {
        return new ArrayList(this.f32601j);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo19345c() {
        return new ArrayList(this.f32600i);
    }

    /* renamed from: d */
    public final String mo19346d() {
        return this.f32598g;
    }

    /* renamed from: f */
    public final String mo19347f() {
        return this.f32592a;
    }

    /* renamed from: g */
    public final Bundle mo19348g() {
        return this.f32593b;
    }

    /* renamed from: h */
    public final String mo19349h() {
        return this.f32597f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo19343a(), mo19344b(), mo19345c(), this.f32598g, this.f32592a, Integer.valueOf(aaeb.m21131a(this.f32593b)), this.f32597f, this.f32594c, this.f32595d, this.f32596e});
    }

    /* renamed from: i */
    public final String mo19350i() {
        return this.f32594c;
    }

    /* renamed from: j */
    public final String mo19351j() {
        return this.f32595d;
    }

    /* renamed from: k */
    public final String mo19352k() {
        return this.f32596e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentSection) {
            if (this == obj) {
                return true;
            }
            AppContentSection appContentSection = (AppContentSection) obj;
            if (!sdg.m34949a(appContentSection.mo19343a(), mo19343a()) || !sdg.m34949a(appContentSection.mo19344b(), mo19344b()) || !sdg.m34949a(appContentSection.mo19345c(), mo19345c()) || !sdg.m34949a(appContentSection.mo19346d(), this.f32598g) || !sdg.m34949a(appContentSection.mo19347f(), this.f32592a) || !aaeb.m21132a(appContentSection.mo19348g(), this.f32593b) || !sdg.m34949a(appContentSection.mo19349h(), this.f32597f) || !sdg.m34949a(appContentSection.mo19350i(), this.f32594c) || !sdg.m34949a(appContentSection.mo19351j(), this.f32595d) || !sdg.m34949a(appContentSection.mo19352k(), this.f32596e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Actions", mo19343a());
        a.mo25396a("Annotations", mo19344b());
        a.mo25396a("Cards", mo19345c());
        a.mo25396a("CardType", this.f32598g);
        a.mo25396a("ContentDescription", this.f32592a);
        a.mo25396a("Extras", this.f32593b);
        a.mo25396a("Id", this.f32597f);
        a.mo25396a("Subtitle", this.f32594c);
        a.mo25396a("Title", this.f32595d);
        a.mo25396a("Type", this.f32596e);
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
        see.m35066c(parcel, 1, mo19343a(), false);
        see.m35066c(parcel, 3, mo19345c(), false);
        see.m35046a(parcel, 4, this.f32592a, false);
        see.m35037a(parcel, 5, this.f32593b, false);
        see.m35046a(parcel, 6, this.f32594c, false);
        see.m35046a(parcel, 7, this.f32595d, false);
        see.m35046a(parcel, 8, this.f32596e, false);
        see.m35046a(parcel, 9, this.f32597f, false);
        see.m35046a(parcel, 10, this.f32598g, false);
        see.m35066c(parcel, 14, mo19344b(), false);
        see.m35062b(parcel, a);
    }
}
