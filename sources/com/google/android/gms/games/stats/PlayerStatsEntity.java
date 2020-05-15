package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlayerStatsEntity extends GamesAbstractSafeParcelable implements PlayerStats {
    public static final Parcelable.Creator CREATOR = new aafv();

    /* renamed from: a */
    public final float f32733a;

    /* renamed from: b */
    public final float f32734b;

    /* renamed from: c */
    public final int f32735c;

    /* renamed from: d */
    public final int f32736d;

    /* renamed from: e */
    public final int f32737e;

    /* renamed from: f */
    public final float f32738f;

    /* renamed from: g */
    public final float f32739g;

    /* renamed from: h */
    public final Bundle f32740h;

    /* renamed from: i */
    public final float f32741i;

    /* renamed from: j */
    public final float f32742j;

    /* renamed from: k */
    public final float f32743k;

    public PlayerStatsEntity(float f, float f2, int i, int i2, int i3, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.f32733a = f;
        this.f32734b = f2;
        this.f32735c = i;
        this.f32736d = i2;
        this.f32737e = i3;
        this.f32738f = f3;
        this.f32739g = f4;
        this.f32740h = bundle;
        this.f32741i = f5;
        this.f32742j = f6;
        this.f32743k = f7;
    }

    /* renamed from: a */
    public final float mo19528a() {
        return this.f32733a;
    }

    /* renamed from: b */
    public final float mo19529b() {
        return this.f32734b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final int mo19530c() {
        return this.f32735c;
    }

    /* renamed from: d */
    public final int mo19531d() {
        return this.f32736d;
    }

    /* renamed from: f */
    public final int mo19532f() {
        return this.f32737e;
    }

    /* renamed from: g */
    public final float mo19533g() {
        return this.f32738f;
    }

    /* renamed from: h */
    public final float mo19534h() {
        return this.f32739g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(mo19528a()), Float.valueOf(mo19529b()), Integer.valueOf(mo19530c()), Integer.valueOf(mo19531d()), Integer.valueOf(mo19532f()), Float.valueOf(mo19533g()), Float.valueOf(mo19534h()), Float.valueOf(mo19535i()), Float.valueOf(mo19536j()), Float.valueOf(mo19537k())});
    }

    /* renamed from: i */
    public final float mo19535i() {
        return this.f32741i;
    }

    /* renamed from: j */
    public final float mo19536j() {
        return this.f32742j;
    }

    /* renamed from: k */
    public final float mo19537k() {
        return this.f32743k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlayerStats) {
            if (this == obj) {
                return true;
            }
            PlayerStats playerStats = (PlayerStats) obj;
            if (!sdg.m34949a(Float.valueOf(playerStats.mo19528a()), Float.valueOf(mo19528a())) || !sdg.m34949a(Float.valueOf(playerStats.mo19529b()), Float.valueOf(mo19529b())) || !sdg.m34949a(Integer.valueOf(playerStats.mo19530c()), Integer.valueOf(mo19530c())) || !sdg.m34949a(Integer.valueOf(playerStats.mo19531d()), Integer.valueOf(mo19531d())) || !sdg.m34949a(Integer.valueOf(playerStats.mo19532f()), Integer.valueOf(mo19532f())) || !sdg.m34949a(Float.valueOf(playerStats.mo19533g()), Float.valueOf(mo19533g())) || !sdg.m34949a(Float.valueOf(playerStats.mo19534h()), Float.valueOf(mo19534h())) || !sdg.m34949a(Float.valueOf(playerStats.mo19535i()), Float.valueOf(mo19535i())) || !sdg.m34949a(Float.valueOf(playerStats.mo19536j()), Float.valueOf(mo19536j())) || !sdg.m34949a(Float.valueOf(playerStats.mo19537k()), Float.valueOf(mo19537k()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("AverageSessionLength", Float.valueOf(mo19528a()));
        a.mo25396a("ChurnProbability", Float.valueOf(mo19529b()));
        a.mo25396a("DaysSinceLastPlayed", Integer.valueOf(mo19530c()));
        a.mo25396a("NumberOfPurchases", Integer.valueOf(mo19531d()));
        a.mo25396a("NumberOfSessions", Integer.valueOf(mo19532f()));
        a.mo25396a("SessionPercentile", Float.valueOf(mo19533g()));
        a.mo25396a("SpendPercentile", Float.valueOf(mo19534h()));
        a.mo25396a("SpendProbability", Float.valueOf(mo19535i()));
        a.mo25396a("HighSpenderProbability", Float.valueOf(mo19536j()));
        a.mo25396a("TotalSpendNext28Days", Float.valueOf(mo19537k()));
        return a.toString();
    }

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
        see.m35034a(parcel, 1, this.f32733a);
        see.m35034a(parcel, 2, this.f32734b);
        see.m35063b(parcel, 3, this.f32735c);
        see.m35063b(parcel, 4, this.f32736d);
        see.m35063b(parcel, 5, this.f32737e);
        see.m35034a(parcel, 6, this.f32738f);
        see.m35034a(parcel, 7, this.f32739g);
        see.m35037a(parcel, 8, this.f32740h, false);
        see.m35034a(parcel, 9, this.f32741i);
        see.m35034a(parcel, 10, this.f32742j);
        see.m35034a(parcel, 11, this.f32743k);
        see.m35062b(parcel, a);
    }
}
