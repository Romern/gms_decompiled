package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MostRecentGameInfoEntity extends GamesAbstractSafeParcelable implements MostRecentGameInfo {
    public static final Parcelable.Creator CREATOR = new aaet();

    /* renamed from: a */
    public final String f32635a;

    /* renamed from: b */
    public final String f32636b;

    /* renamed from: c */
    public final long f32637c;

    /* renamed from: d */
    public final Uri f32638d;

    /* renamed from: e */
    public final Uri f32639e;

    /* renamed from: f */
    public final Uri f32640f;

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = (MostRecentGameInfoEntity) mostRecentGameInfo;
        this.f32635a = mostRecentGameInfoEntity.f32635a;
        this.f32636b = mostRecentGameInfoEntity.f32636b;
        this.f32637c = mostRecentGameInfoEntity.f32637c;
        this.f32638d = mostRecentGameInfoEntity.f32638d;
        this.f32639e = mostRecentGameInfoEntity.f32639e;
        this.f32640f = mostRecentGameInfoEntity.f32640f;
    }

    /* renamed from: a */
    public final String mo19403a() {
        return this.f32635a;
    }

    /* renamed from: b */
    public final String mo19404b() {
        return this.f32636b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final long mo19405c() {
        return this.f32637c;
    }

    /* renamed from: d */
    public final Uri mo19406d() {
        return this.f32638d;
    }

    /* renamed from: f */
    public final Uri mo19407f() {
        return this.f32639e;
    }

    /* renamed from: g */
    public final Uri mo19408g() {
        return this.f32640f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32635a, this.f32636b, Long.valueOf(this.f32637c), this.f32638d, this.f32639e, this.f32640f});
    }

    public MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.f32635a = str;
        this.f32636b = str2;
        this.f32637c = j;
        this.f32638d = uri;
        this.f32639e = uri2;
        this.f32640f = uri3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MostRecentGameInfo) {
            if (this == obj) {
                return true;
            }
            MostRecentGameInfo mostRecentGameInfo = (MostRecentGameInfo) obj;
            if (!sdg.m34949a(mostRecentGameInfo.mo19403a(), this.f32635a) || !sdg.m34949a(mostRecentGameInfo.mo19404b(), this.f32636b) || !sdg.m34949a(Long.valueOf(mostRecentGameInfo.mo19405c()), Long.valueOf(this.f32637c)) || !sdg.m34949a(mostRecentGameInfo.mo19406d(), this.f32638d) || !sdg.m34949a(mostRecentGameInfo.mo19407f(), this.f32639e) || !sdg.m34949a(mostRecentGameInfo.mo19408g(), this.f32640f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("GameId", this.f32635a);
        a.mo25396a("GameName", this.f32636b);
        a.mo25396a("ActivityTimestampMillis", Long.valueOf(this.f32637c));
        a.mo25396a("GameIconUri", this.f32638d);
        a.mo25396a("GameHiResUri", this.f32639e);
        a.mo25396a("GameFeaturedUri", this.f32640f);
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
        see.m35046a(parcel, 1, this.f32635a, false);
        see.m35046a(parcel, 2, this.f32636b, false);
        see.m35036a(parcel, 3, this.f32637c);
        see.m35040a(parcel, 4, this.f32638d, i, false);
        see.m35040a(parcel, 5, this.f32639e, i, false);
        see.m35040a(parcel, 6, this.f32640f, i, false);
        see.m35062b(parcel, a);
    }
}
