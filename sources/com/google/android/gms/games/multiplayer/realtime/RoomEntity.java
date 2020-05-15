package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Parcelable.Creator CREATOR = new aafd();

    /* renamed from: a */
    public final String f32682a;

    /* renamed from: b */
    public final String f32683b;

    /* renamed from: c */
    public final long f32684c;

    /* renamed from: d */
    public final int f32685d;

    /* renamed from: e */
    public final String f32686e;

    /* renamed from: f */
    public final int f32687f;

    /* renamed from: g */
    public final Bundle f32688g;

    /* renamed from: h */
    public final int f32689h;

    /* renamed from: i */
    private final ArrayList f32690i;

    public RoomEntity(String str, String str2, long j, int i, String str3, int i2, Bundle bundle, ArrayList arrayList, int i3) {
        this.f32682a = str;
        this.f32683b = str2;
        this.f32684c = j;
        this.f32685d = i;
        this.f32686e = str3;
        this.f32687f = i2;
        this.f32688g = bundle;
        this.f32690i = arrayList;
        this.f32689h = i3;
    }

    /* renamed from: a */
    public final String mo19464a() {
        return this.f32682a;
    }

    /* renamed from: b */
    public final String mo19465b() {
        return this.f32683b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final long mo19466c() {
        return this.f32684c;
    }

    /* renamed from: d */
    public final int mo19467d() {
        return this.f32685d;
    }

    /* renamed from: f */
    public final String mo19468f() {
        return this.f32686e;
    }

    /* renamed from: g */
    public final int mo19469g() {
        return this.f32687f;
    }

    /* renamed from: h */
    public final Bundle mo19470h() {
        return this.f32688g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32682a, this.f32683b, Long.valueOf(this.f32684c), Integer.valueOf(this.f32685d), this.f32686e, Integer.valueOf(this.f32687f), Integer.valueOf(aaeb.m21131a(this.f32688g)), mo16817i(), Integer.valueOf(this.f32689h)});
    }

    /* renamed from: i */
    public final ArrayList mo16817i() {
        return new ArrayList(this.f32690i);
    }

    /* renamed from: j */
    public final int mo19471j() {
        return this.f32689h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Room) {
            if (this == obj) {
                return true;
            }
            Room room = (Room) obj;
            if (!sdg.m34949a(room.mo19464a(), this.f32682a) || !sdg.m34949a(room.mo19465b(), this.f32683b) || !sdg.m34949a(Long.valueOf(room.mo19466c()), Long.valueOf(this.f32684c)) || !sdg.m34949a(Integer.valueOf(room.mo19467d()), Integer.valueOf(this.f32685d)) || !sdg.m34949a(room.mo19468f(), this.f32686e) || !sdg.m34949a(Integer.valueOf(room.mo19469g()), Integer.valueOf(this.f32687f)) || !aaeb.m21132a(room.mo19470h(), this.f32688g) || !sdg.m34949a(room.mo16817i(), mo16817i()) || !sdg.m34949a(Integer.valueOf(room.mo19471j()), Integer.valueOf(this.f32689h))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("RoomId", this.f32682a);
        a.mo25396a("CreatorId", this.f32683b);
        a.mo25396a("CreationTimestamp", Long.valueOf(this.f32684c));
        a.mo25396a("RoomStatus", Integer.valueOf(this.f32685d));
        a.mo25396a("Description", this.f32686e);
        a.mo25396a("Variant", Integer.valueOf(this.f32687f));
        a.mo25396a("AutoMatchCriteria", this.f32688g);
        a.mo25396a("Participants", mo16817i());
        a.mo25396a("AutoMatchWaitEstimateSeconds", Integer.valueOf(this.f32689h));
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
        see.m35046a(parcel, 1, this.f32682a, false);
        see.m35046a(parcel, 2, this.f32683b, false);
        see.m35036a(parcel, 3, this.f32684c);
        see.m35063b(parcel, 4, this.f32685d);
        see.m35046a(parcel, 5, this.f32686e, false);
        see.m35063b(parcel, 6, this.f32687f);
        see.m35037a(parcel, 7, this.f32688g, false);
        see.m35066c(parcel, 8, mo16817i(), false);
        see.m35063b(parcel, 9, this.f32689h);
        see.m35062b(parcel, a);
    }
}
