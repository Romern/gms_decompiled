package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppContentCardEntity extends GamesAbstractSafeParcelable implements AppContentCard {
    public static final Parcelable.Creator CREATOR = new aadl();

    /* renamed from: a */
    public final String f32576a;

    /* renamed from: b */
    public final int f32577b;

    /* renamed from: c */
    public final String f32578c;

    /* renamed from: d */
    public final Bundle f32579d;

    /* renamed from: e */
    public final String f32580e;

    /* renamed from: f */
    public final String f32581f;

    /* renamed from: g */
    public final int f32582g;

    /* renamed from: h */
    public final String f32583h;

    /* renamed from: i */
    public final String f32584i;

    /* renamed from: j */
    private final ArrayList f32585j;

    /* renamed from: k */
    private final ArrayList f32586k;

    /* renamed from: l */
    private final ArrayList f32587l;

    public AppContentCardEntity(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i, String str2, Bundle bundle, String str3, String str4, int i2, String str5, String str6) {
        this.f32585j = arrayList;
        this.f32586k = arrayList2;
        this.f32587l = arrayList3;
        this.f32576a = str;
        this.f32577b = i;
        this.f32578c = str2;
        this.f32579d = bundle;
        this.f32584i = str6;
        this.f32580e = str3;
        this.f32581f = str4;
        this.f32582g = i2;
        this.f32583h = str5;
    }

    /* renamed from: a */
    public final List mo19319a() {
        return new ArrayList(this.f32585j);
    }

    /* renamed from: b */
    public final List mo19320b() {
        return new ArrayList(this.f32586k);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo19321c() {
        return new ArrayList(this.f32587l);
    }

    /* renamed from: d */
    public final String mo19322d() {
        return this.f32576a;
    }

    /* renamed from: f */
    public final int mo19323f() {
        return this.f32577b;
    }

    /* renamed from: g */
    public final String mo19324g() {
        return this.f32578c;
    }

    /* renamed from: h */
    public final Bundle mo19325h() {
        return this.f32579d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo19319a(), mo19320b(), mo19321c(), this.f32576a, Integer.valueOf(this.f32577b), this.f32578c, Integer.valueOf(aaeb.m21131a(this.f32579d)), this.f32584i, this.f32580e, this.f32581f, Integer.valueOf(this.f32582g), this.f32583h});
    }

    /* renamed from: i */
    public final String mo19326i() {
        return this.f32584i;
    }

    /* renamed from: j */
    public final String mo19327j() {
        return this.f32580e;
    }

    /* renamed from: k */
    public final String mo19328k() {
        return this.f32581f;
    }

    /* renamed from: l */
    public final int mo19329l() {
        return this.f32582g;
    }

    /* renamed from: m */
    public final String mo19330m() {
        return this.f32583h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentCard) {
            if (this == obj) {
                return true;
            }
            AppContentCard appContentCard = (AppContentCard) obj;
            if (!sdg.m34949a(appContentCard.mo19319a(), mo19319a()) || !sdg.m34949a(appContentCard.mo19320b(), mo19320b()) || !sdg.m34949a(appContentCard.mo19321c(), mo19321c()) || !sdg.m34949a(appContentCard.mo19322d(), this.f32576a) || !sdg.m34949a(Integer.valueOf(appContentCard.mo19323f()), Integer.valueOf(this.f32577b)) || !sdg.m34949a(appContentCard.mo19324g(), this.f32578c) || !aaeb.m21132a(appContentCard.mo19325h(), this.f32579d) || !sdg.m34949a(appContentCard.mo19326i(), this.f32584i) || !sdg.m34949a(appContentCard.mo19327j(), this.f32580e) || !sdg.m34949a(appContentCard.mo19328k(), this.f32581f) || !sdg.m34949a(Integer.valueOf(appContentCard.mo19329l()), Integer.valueOf(this.f32582g)) || !sdg.m34949a(appContentCard.mo19330m(), this.f32583h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Actions", mo19319a());
        a.mo25396a("Annotations", mo19320b());
        a.mo25396a("Conditions", mo19321c());
        a.mo25396a("ContentDescription", this.f32576a);
        a.mo25396a("CurrentSteps", Integer.valueOf(this.f32577b));
        a.mo25396a("Description", this.f32578c);
        a.mo25396a("Extras", this.f32579d);
        a.mo25396a("Id", this.f32584i);
        a.mo25396a("Subtitle", this.f32580e);
        a.mo25396a("Title", this.f32581f);
        a.mo25396a("TotalSteps", Integer.valueOf(this.f32582g));
        a.mo25396a("Type", this.f32583h);
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
        see.m35066c(parcel, 1, mo19319a(), false);
        see.m35066c(parcel, 2, mo19320b(), false);
        see.m35066c(parcel, 3, mo19321c(), false);
        see.m35046a(parcel, 4, this.f32576a, false);
        see.m35063b(parcel, 5, this.f32577b);
        see.m35046a(parcel, 6, this.f32578c, false);
        see.m35037a(parcel, 7, this.f32579d, false);
        see.m35046a(parcel, 10, this.f32580e, false);
        see.m35046a(parcel, 11, this.f32581f, false);
        see.m35063b(parcel, 12, this.f32582g);
        see.m35046a(parcel, 13, this.f32583h, false);
        see.m35046a(parcel, 14, this.f32584i, false);
        see.m35062b(parcel, a);
    }
}
