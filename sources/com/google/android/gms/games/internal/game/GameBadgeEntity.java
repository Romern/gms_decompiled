package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final Parcelable.Creator CREATOR = new aaeq();

    /* renamed from: a */
    public int f32628a;

    /* renamed from: b */
    public String f32629b;

    /* renamed from: c */
    public String f32630c;

    /* renamed from: d */
    public Uri f32631d;

    public GameBadgeEntity(int i, String str, String str2, Uri uri) {
        this.f32628a = i;
        this.f32629b = str;
        this.f32630c = str2;
        this.f32631d = uri;
    }

    /* renamed from: a */
    public final int mo19393a() {
        return this.f32628a;
    }

    /* renamed from: b */
    public final String mo19394b() {
        return this.f32630c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32628a), this.f32629b, this.f32630c, this.f32631d});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GameBadge) {
            if (this == obj) {
                return true;
            }
            GameBadge gameBadge = (GameBadge) obj;
            if (!sdg.m34949a(Integer.valueOf(gameBadge.mo19393a()), this.f32629b) || !sdg.m34949a(gameBadge.mo19394b(), this.f32631d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Type", Integer.valueOf(this.f32628a));
        a.mo25396a("Title", this.f32629b);
        a.mo25396a("Description", this.f32630c);
        a.mo25396a("IconImageUri", this.f32631d);
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
        see.m35063b(parcel, 1, this.f32628a);
        see.m35046a(parcel, 2, this.f32629b, false);
        see.m35046a(parcel, 3, this.f32630c, false);
        see.m35040a(parcel, 4, this.f32631d, i, false);
        see.m35062b(parcel, a);
    }
}
