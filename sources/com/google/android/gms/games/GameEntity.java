package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator CREATOR = new aacp();

    /* renamed from: a */
    public final String f32479a;

    /* renamed from: b */
    public final String f32480b;

    /* renamed from: c */
    public final String f32481c;

    /* renamed from: d */
    public final String f32482d;

    /* renamed from: e */
    public final String f32483e;

    /* renamed from: f */
    public final String f32484f;

    /* renamed from: g */
    public final Uri f32485g;

    /* renamed from: h */
    public final Uri f32486h;

    /* renamed from: i */
    public final Uri f32487i;

    /* renamed from: j */
    public final boolean f32488j;

    /* renamed from: k */
    public final boolean f32489k;

    /* renamed from: l */
    public final String f32490l;

    /* renamed from: m */
    public final int f32491m;

    /* renamed from: n */
    public final int f32492n;

    /* renamed from: o */
    public final int f32493o;

    /* renamed from: p */
    public final boolean f32494p;

    /* renamed from: q */
    public final boolean f32495q;

    /* renamed from: r */
    public final String f32496r;

    /* renamed from: s */
    public final String f32497s;

    /* renamed from: t */
    public final String f32498t;

    /* renamed from: u */
    public final boolean f32499u;

    /* renamed from: v */
    public final boolean f32500v;

    /* renamed from: w */
    public final boolean f32501w;

    /* renamed from: x */
    public final String f32502x;

    /* renamed from: y */
    public final boolean f32503y;

    public GameEntity(Game game) {
        GameEntity gameEntity = (GameEntity) game;
        this.f32479a = gameEntity.f32479a;
        this.f32481c = gameEntity.f32481c;
        this.f32482d = gameEntity.f32482d;
        this.f32483e = gameEntity.f32483e;
        this.f32484f = gameEntity.f32484f;
        this.f32480b = gameEntity.f32480b;
        this.f32485g = gameEntity.f32485g;
        this.f32496r = gameEntity.f32496r;
        this.f32486h = gameEntity.f32486h;
        this.f32497s = gameEntity.f32497s;
        this.f32487i = gameEntity.f32487i;
        this.f32498t = gameEntity.f32498t;
        this.f32488j = gameEntity.f32488j;
        this.f32489k = gameEntity.f32489k;
        this.f32490l = gameEntity.f32490l;
        this.f32491m = 1;
        this.f32492n = gameEntity.f32492n;
        this.f32493o = gameEntity.f32493o;
        this.f32494p = gameEntity.f32494p;
        this.f32495q = gameEntity.f32495q;
        this.f32499u = gameEntity.f32499u;
        this.f32500v = gameEntity.f32500v;
        this.f32501w = gameEntity.f32501w;
        this.f32502x = gameEntity.f32502x;
        this.f32503y = gameEntity.f32503y;
    }

    /* renamed from: a */
    public final String mo19218a() {
        return this.f32479a;
    }

    /* renamed from: b */
    public final String mo19219b() {
        return this.f32480b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19220c() {
        return this.f32481c;
    }

    /* renamed from: d */
    public final String mo19221d() {
        return this.f32482d;
    }

    /* renamed from: f */
    public final String mo19222f() {
        return this.f32483e;
    }

    /* renamed from: g */
    public final String mo19223g() {
        return this.f32484f;
    }

    /* renamed from: h */
    public final Uri mo19224h() {
        return this.f32485g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32479a, this.f32480b, this.f32481c, this.f32482d, this.f32483e, this.f32484f, this.f32485g, this.f32486h, this.f32487i, Boolean.valueOf(this.f32488j), Boolean.valueOf(this.f32489k), this.f32490l, Integer.valueOf(this.f32492n), Integer.valueOf(this.f32493o), Boolean.valueOf(this.f32494p), Boolean.valueOf(this.f32495q), Boolean.valueOf(this.f32499u), Boolean.valueOf(this.f32500v), Boolean.valueOf(this.f32501w), this.f32502x, Boolean.valueOf(this.f32503y)});
    }

    /* renamed from: i */
    public final Uri mo19225i() {
        return this.f32486h;
    }

    /* renamed from: j */
    public final Uri mo19226j() {
        return this.f32487i;
    }

    /* renamed from: k */
    public final boolean mo19227k() {
        return this.f32488j;
    }

    /* renamed from: l */
    public final boolean mo19228l() {
        return this.f32499u;
    }

    /* renamed from: m */
    public final boolean mo19229m() {
        return this.f32500v;
    }

    /* renamed from: n */
    public final boolean mo19230n() {
        return this.f32489k;
    }

    /* renamed from: o */
    public final String mo19231o() {
        return this.f32490l;
    }

    /* renamed from: p */
    public final int mo19232p() {
        return this.f32492n;
    }

    /* renamed from: q */
    public final int mo19233q() {
        return this.f32493o;
    }

    /* renamed from: r */
    public final boolean mo19234r() {
        return this.f32494p;
    }

    /* renamed from: s */
    public final boolean mo19235s() {
        return this.f32495q;
    }

    /* renamed from: t */
    public final boolean mo19236t() {
        return this.f32501w;
    }

    /* renamed from: u */
    public final String mo19237u() {
        return this.f32502x;
    }

    /* renamed from: v */
    public final boolean mo19238v() {
        return this.f32503y;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i, int i2, int i3, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.f32479a = str;
        this.f32480b = str2;
        this.f32481c = str3;
        this.f32482d = str4;
        this.f32483e = str5;
        this.f32484f = str6;
        this.f32485g = uri;
        this.f32496r = str8;
        this.f32486h = uri2;
        this.f32497s = str9;
        this.f32487i = uri3;
        this.f32498t = str10;
        this.f32488j = z;
        this.f32489k = z2;
        this.f32490l = str7;
        this.f32491m = i;
        this.f32492n = i2;
        this.f32493o = i3;
        this.f32494p = z3;
        this.f32495q = z4;
        this.f32499u = z5;
        this.f32500v = z6;
        this.f32501w = z7;
        this.f32502x = str11;
        this.f32503y = z8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Game) {
            if (this == obj) {
                return true;
            }
            Game game = (Game) obj;
            if (!sdg.m34949a(game.mo19218a(), this.f32479a) || !sdg.m34949a(game.mo19219b(), this.f32480b) || !sdg.m34949a(game.mo19220c(), this.f32481c) || !sdg.m34949a(game.mo19221d(), this.f32482d) || !sdg.m34949a(game.mo19222f(), this.f32483e) || !sdg.m34949a(game.mo19223g(), this.f32484f) || !sdg.m34949a(game.mo19224h(), this.f32485g) || !sdg.m34949a(game.mo19225i(), this.f32486h) || !sdg.m34949a(game.mo19226j(), this.f32487i) || !sdg.m34949a(Boolean.valueOf(game.mo19227k()), Boolean.valueOf(this.f32488j)) || !sdg.m34949a(Boolean.valueOf(game.mo19230n()), Boolean.valueOf(this.f32489k)) || !sdg.m34949a(game.mo19231o(), this.f32490l) || !sdg.m34949a(Integer.valueOf(game.mo19232p()), Integer.valueOf(this.f32492n)) || !sdg.m34949a(Integer.valueOf(game.mo19233q()), Integer.valueOf(this.f32493o)) || !sdg.m34949a(Boolean.valueOf(game.mo19234r()), Boolean.valueOf(this.f32494p)) || !sdg.m34949a(Boolean.valueOf(game.mo19235s()), Boolean.valueOf(this.f32495q)) || !sdg.m34949a(Boolean.valueOf(game.mo19228l()), Boolean.valueOf(this.f32499u)) || !sdg.m34949a(Boolean.valueOf(game.mo19229m()), Boolean.valueOf(this.f32500v)) || !sdg.m34949a(Boolean.valueOf(game.mo19236t()), Boolean.valueOf(this.f32501w)) || !sdg.m34949a(game.mo19237u(), this.f32502x) || !sdg.m34949a(Boolean.valueOf(game.mo19238v()), Boolean.valueOf(this.f32503y))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ApplicationId", this.f32479a);
        a.mo25396a("DisplayName", this.f32480b);
        a.mo25396a("PrimaryCategory", this.f32481c);
        a.mo25396a("SecondaryCategory", this.f32482d);
        a.mo25396a("Description", this.f32483e);
        a.mo25396a("DeveloperName", this.f32484f);
        a.mo25396a("IconImageUri", this.f32485g);
        a.mo25396a("IconImageUrl", this.f32496r);
        a.mo25396a("HiResImageUri", this.f32486h);
        a.mo25396a("HiResImageUrl", this.f32497s);
        a.mo25396a("FeaturedImageUri", this.f32487i);
        a.mo25396a("FeaturedImageUrl", this.f32498t);
        a.mo25396a("PlayEnabledGame", Boolean.valueOf(this.f32488j));
        a.mo25396a("InstanceInstalled", Boolean.valueOf(this.f32489k));
        a.mo25396a("InstancePackageName", this.f32490l);
        a.mo25396a("AchievementTotalCount", Integer.valueOf(this.f32492n));
        a.mo25396a("LeaderboardCount", Integer.valueOf(this.f32493o));
        a.mo25396a("RealTimeMultiplayerEnabled", Boolean.valueOf(this.f32494p));
        a.mo25396a("TurnBasedMultiplayerEnabled", Boolean.valueOf(this.f32495q));
        a.mo25396a("AreSnapshotsEnabled", Boolean.valueOf(this.f32501w));
        a.mo25396a("ThemeColor", this.f32502x);
        a.mo25396a("HasGamepadSupport", Boolean.valueOf(this.f32503y));
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
        see.m35046a(parcel, 1, this.f32479a, false);
        see.m35046a(parcel, 2, this.f32480b, false);
        see.m35046a(parcel, 3, this.f32481c, false);
        see.m35046a(parcel, 4, this.f32482d, false);
        see.m35046a(parcel, 5, this.f32483e, false);
        see.m35046a(parcel, 6, this.f32484f, false);
        see.m35040a(parcel, 7, this.f32485g, i, false);
        see.m35040a(parcel, 8, this.f32486h, i, false);
        see.m35040a(parcel, 9, this.f32487i, i, false);
        see.m35051a(parcel, 10, this.f32488j);
        see.m35051a(parcel, 11, this.f32489k);
        see.m35046a(parcel, 12, this.f32490l, false);
        see.m35063b(parcel, 13, this.f32491m);
        see.m35063b(parcel, 14, this.f32492n);
        see.m35063b(parcel, 15, this.f32493o);
        see.m35051a(parcel, 16, this.f32494p);
        see.m35051a(parcel, 17, this.f32495q);
        see.m35046a(parcel, 18, this.f32496r, false);
        see.m35046a(parcel, 19, this.f32497s, false);
        see.m35046a(parcel, 20, this.f32498t, false);
        see.m35051a(parcel, 21, this.f32499u);
        see.m35051a(parcel, 22, this.f32500v);
        see.m35051a(parcel, 23, this.f32501w);
        see.m35046a(parcel, 24, this.f32502x, false);
        see.m35051a(parcel, 25, this.f32503y);
        see.m35062b(parcel, a);
    }
}
