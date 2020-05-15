package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ExperienceEventEntity extends GamesAbstractSafeParcelable implements ExperienceEvent {
    public static final Parcelable.Creator CREATOR = new aaep();

    /* renamed from: a */
    public final String f32617a;

    /* renamed from: b */
    public final GameEntity f32618b;

    /* renamed from: c */
    public final String f32619c;

    /* renamed from: d */
    public final String f32620d;

    /* renamed from: e */
    public final String f32621e;

    /* renamed from: f */
    public final Uri f32622f;

    /* renamed from: g */
    public final long f32623g;

    /* renamed from: h */
    public final long f32624h;

    /* renamed from: i */
    public final long f32625i;

    /* renamed from: j */
    public final int f32626j;

    /* renamed from: k */
    public final int f32627k;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i, int i2) {
        this.f32617a = str;
        this.f32618b = gameEntity;
        this.f32619c = str2;
        this.f32620d = str3;
        this.f32621e = str4;
        this.f32622f = uri;
        this.f32623g = j;
        this.f32624h = j2;
        this.f32625i = j3;
        this.f32626j = i;
        this.f32627k = i2;
    }

    /* renamed from: a */
    public final String mo19378a() {
        return this.f32617a;
    }

    /* renamed from: b */
    public final Game mo19379b() {
        return this.f32618b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19380c() {
        return this.f32619c;
    }

    /* renamed from: d */
    public final String mo19381d() {
        return this.f32620d;
    }

    /* renamed from: f */
    public final Uri mo19382f() {
        return this.f32622f;
    }

    /* renamed from: g */
    public final long mo19383g() {
        return this.f32623g;
    }

    public final String getIconImageUrl() {
        return this.f32621e;
    }

    /* renamed from: h */
    public final long mo19385h() {
        return this.f32624h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32617a, this.f32618b, this.f32619c, this.f32620d, this.f32621e, this.f32622f, Long.valueOf(this.f32623g), Long.valueOf(this.f32624h), Long.valueOf(this.f32625i), Integer.valueOf(this.f32626j), Integer.valueOf(this.f32627k)});
    }

    /* renamed from: i */
    public final long mo19386i() {
        return this.f32625i;
    }

    /* renamed from: j */
    public final int mo19387j() {
        return this.f32626j;
    }

    /* renamed from: k */
    public final int mo19388k() {
        return this.f32627k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperienceEvent) {
            if (this == obj) {
                return true;
            }
            ExperienceEvent experienceEvent = (ExperienceEvent) obj;
            if (!sdg.m34949a(experienceEvent.mo19378a(), this.f32617a) || !sdg.m34949a(experienceEvent.mo19379b(), this.f32618b) || !sdg.m34949a(experienceEvent.mo19380c(), this.f32619c) || !sdg.m34949a(experienceEvent.mo19381d(), this.f32620d) || !sdg.m34949a(experienceEvent.getIconImageUrl(), this.f32621e) || !sdg.m34949a(experienceEvent.mo19382f(), this.f32622f) || !sdg.m34949a(Long.valueOf(experienceEvent.mo19383g()), Long.valueOf(this.f32623g)) || !sdg.m34949a(Long.valueOf(experienceEvent.mo19385h()), Long.valueOf(this.f32624h)) || !sdg.m34949a(Long.valueOf(experienceEvent.mo19386i()), Long.valueOf(this.f32625i)) || !sdg.m34949a(Integer.valueOf(experienceEvent.mo19387j()), Integer.valueOf(this.f32626j)) || !sdg.m34949a(Integer.valueOf(experienceEvent.mo19388k()), Integer.valueOf(this.f32627k))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ExperienceId", this.f32617a);
        a.mo25396a("Game", this.f32618b);
        a.mo25396a("DisplayTitle", this.f32619c);
        a.mo25396a("DisplayDescription", this.f32620d);
        a.mo25396a("IconImageUrl", this.f32621e);
        a.mo25396a("IconImageUri", this.f32622f);
        a.mo25396a("CreatedTimestamp", Long.valueOf(this.f32623g));
        a.mo25396a("XpEarned", Long.valueOf(this.f32624h));
        a.mo25396a("CurrentXp", Long.valueOf(this.f32625i));
        a.mo25396a("Type", Integer.valueOf(this.f32626j));
        a.mo25396a("NewLevel", Integer.valueOf(this.f32627k));
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
        see.m35046a(parcel, 1, this.f32617a, false);
        see.m35040a(parcel, 2, this.f32618b, i, false);
        see.m35046a(parcel, 3, this.f32619c, false);
        see.m35046a(parcel, 4, this.f32620d, false);
        see.m35046a(parcel, 5, this.f32621e, false);
        see.m35040a(parcel, 6, this.f32622f, i, false);
        see.m35036a(parcel, 7, this.f32623g);
        see.m35036a(parcel, 8, this.f32624h);
        see.m35036a(parcel, 9, this.f32625i);
        see.m35063b(parcel, 10, this.f32626j);
        see.m35063b(parcel, 11, this.f32627k);
        see.m35062b(parcel, a);
    }
}
