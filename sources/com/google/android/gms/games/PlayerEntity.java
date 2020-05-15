package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator CREATOR = new aada();

    /* renamed from: a */
    public String f32506a;

    /* renamed from: b */
    public String f32507b;

    /* renamed from: c */
    public final Uri f32508c;

    /* renamed from: d */
    public final Uri f32509d;

    /* renamed from: e */
    public final long f32510e;

    /* renamed from: f */
    public final int f32511f;

    /* renamed from: g */
    public final long f32512g;

    /* renamed from: h */
    public final String f32513h;

    /* renamed from: i */
    public final String f32514i;

    /* renamed from: j */
    public final String f32515j;

    /* renamed from: k */
    public final MostRecentGameInfoEntity f32516k;

    /* renamed from: l */
    public final PlayerLevelInfo f32517l;

    /* renamed from: m */
    public final boolean f32518m;

    /* renamed from: n */
    public final boolean f32519n;

    /* renamed from: o */
    public final String f32520o;

    /* renamed from: p */
    public final String f32521p;

    /* renamed from: q */
    public final Uri f32522q;

    /* renamed from: r */
    public final String f32523r;

    /* renamed from: s */
    public final Uri f32524s;

    /* renamed from: t */
    public final String f32525t;

    /* renamed from: u */
    public final int f32526u;

    /* renamed from: v */
    public final long f32527v;

    /* renamed from: w */
    public final boolean f32528w;

    /* renamed from: x */
    public long f32529x;

    /* renamed from: y */
    public final PlayerRelationshipInfoEntity f32530y;

    public PlayerEntity(Player player) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity;
        PlayerEntity playerEntity = (PlayerEntity) player;
        this.f32506a = playerEntity.f32506a;
        this.f32507b = playerEntity.f32507b;
        this.f32508c = playerEntity.f32508c;
        this.f32513h = playerEntity.f32513h;
        this.f32509d = playerEntity.f32509d;
        this.f32514i = playerEntity.f32514i;
        this.f32510e = playerEntity.f32510e;
        this.f32511f = playerEntity.f32511f;
        this.f32512g = playerEntity.f32512g;
        this.f32515j = playerEntity.f32515j;
        this.f32518m = playerEntity.f32518m;
        MostRecentGameInfoEntity mostRecentGameInfoEntity2 = playerEntity.f32516k;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = null;
        if (mostRecentGameInfoEntity2 != null) {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(mostRecentGameInfoEntity2);
        } else {
            mostRecentGameInfoEntity = null;
        }
        this.f32516k = mostRecentGameInfoEntity;
        this.f32517l = playerEntity.f32517l;
        this.f32519n = playerEntity.f32519n;
        this.f32520o = playerEntity.f32520o;
        this.f32521p = playerEntity.f32521p;
        this.f32522q = playerEntity.f32522q;
        this.f32523r = playerEntity.f32523r;
        this.f32524s = playerEntity.f32524s;
        this.f32525t = playerEntity.f32525t;
        this.f32526u = playerEntity.f32526u;
        this.f32527v = playerEntity.f32527v;
        this.f32528w = playerEntity.f32528w;
        this.f32529x = playerEntity.f32529x;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity2 = playerEntity.f32530y;
        this.f32530y = playerRelationshipInfoEntity2 != null ? playerRelationshipInfoEntity2 : playerRelationshipInfoEntity;
        rzz.m34731b(this.f32506a);
        rzz.m34731b(this.f32507b);
        rzz.m34729a(this.f32510e > 0);
    }

    /* renamed from: a */
    public final String mo19243a() {
        return this.f32506a;
    }

    /* renamed from: b */
    public final String mo19244b() {
        return this.f32507b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19245c() {
        return this.f32520o;
    }

    /* renamed from: d */
    public final String mo19246d() {
        return this.f32521p;
    }

    /* renamed from: f */
    public final boolean mo19247f() {
        return this.f32519n;
    }

    /* renamed from: g */
    public final Uri mo19248g() {
        return this.f32508c;
    }

    /* renamed from: h */
    public final Uri mo19249h() {
        return this.f32509d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32506a, this.f32507b, Boolean.valueOf(this.f32519n), this.f32508c, this.f32509d, Long.valueOf(this.f32510e), this.f32515j, this.f32517l, this.f32520o, this.f32521p, this.f32522q, this.f32524s, Integer.valueOf(this.f32526u), Long.valueOf(this.f32527v), Boolean.valueOf(this.f32528w), Long.valueOf(this.f32529x), this.f32530y});
    }

    /* renamed from: i */
    public final long mo19250i() {
        return this.f32510e;
    }

    /* renamed from: j */
    public final String mo19251j() {
        return this.f32515j;
    }

    /* renamed from: k */
    public final PlayerLevelInfo mo19252k() {
        return this.f32517l;
    }

    /* renamed from: l */
    public final Uri mo19253l() {
        return this.f32522q;
    }

    /* renamed from: m */
    public final Uri mo19254m() {
        return this.f32524s;
    }

    /* renamed from: n */
    public final int mo19255n() {
        return this.f32526u;
    }

    /* renamed from: o */
    public final long mo19256o() {
        return this.f32527v;
    }

    /* renamed from: p */
    public final boolean mo19257p() {
        return this.f32528w;
    }

    /* renamed from: q */
    public final long mo19258q() {
        return this.f32529x;
    }

    /* renamed from: r */
    public final PlayerRelationshipInfo mo19259r() {
        return this.f32530y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Player) {
            if (this == obj) {
                return true;
            }
            Player player = (Player) obj;
            if (!sdg.m34949a(player.mo19243a(), this.f32506a) || !sdg.m34949a(player.mo19244b(), this.f32507b) || !sdg.m34949a(Boolean.valueOf(player.mo19247f()), Boolean.valueOf(this.f32519n)) || !sdg.m34949a(player.mo19248g(), this.f32508c) || !sdg.m34949a(player.mo19249h(), this.f32509d) || !sdg.m34949a(Long.valueOf(player.mo19250i()), Long.valueOf(this.f32510e)) || !sdg.m34949a(player.mo19251j(), this.f32515j) || !sdg.m34949a(player.mo19252k(), this.f32517l) || !sdg.m34949a(player.mo19245c(), this.f32520o) || !sdg.m34949a(player.mo19246d(), this.f32521p) || !sdg.m34949a(player.mo19253l(), this.f32522q) || !sdg.m34949a(player.mo19254m(), this.f32524s) || !sdg.m34949a(Integer.valueOf(player.mo19255n()), Integer.valueOf(this.f32526u)) || !sdg.m34949a(Long.valueOf(player.mo19256o()), Long.valueOf(this.f32527v)) || !sdg.m34949a(Boolean.valueOf(player.mo19257p()), Boolean.valueOf(this.f32528w)) || !sdg.m34949a(Long.valueOf(player.mo19258q()), Long.valueOf(this.f32529x)) || !sdg.m34949a(player.mo19259r(), this.f32530y)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("PlayerId", this.f32506a);
        a.mo25396a("DisplayName", this.f32507b);
        a.mo25396a("HasDebugAccess", Boolean.valueOf(this.f32519n));
        a.mo25396a("IconImageUri", this.f32508c);
        a.mo25396a("IconImageUrl", this.f32513h);
        a.mo25396a("HiResImageUri", this.f32509d);
        a.mo25396a("HiResImageUrl", this.f32514i);
        a.mo25396a("RetrievedTimestamp", Long.valueOf(this.f32510e));
        a.mo25396a("Title", this.f32515j);
        a.mo25396a("LevelInfo", this.f32517l);
        a.mo25396a("GamerTag", this.f32520o);
        a.mo25396a("Name", this.f32521p);
        a.mo25396a("BannerImageLandscapeUri", this.f32522q);
        a.mo25396a("BannerImageLandscapeUrl", this.f32523r);
        a.mo25396a("BannerImagePortraitUri", this.f32524s);
        a.mo25396a("BannerImagePortraitUrl", this.f32525t);
        a.mo25396a("GamerFriendStatus", Integer.valueOf(this.f32526u));
        a.mo25396a("GamerFriendUpdateTimestamp", Long.valueOf(this.f32527v));
        a.mo25396a("IsMuted", Boolean.valueOf(this.f32528w));
        a.mo25396a("totalUnlockedAchievement", Long.valueOf(this.f32529x));
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = this.f32530y;
        if (playerRelationshipInfoEntity != null) {
            a.mo25396a("RelationshipInfo", playerRelationshipInfoEntity);
        }
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
        see.m35046a(parcel, 1, this.f32506a, false);
        see.m35046a(parcel, 2, this.f32507b, false);
        see.m35040a(parcel, 3, this.f32508c, i, false);
        see.m35040a(parcel, 4, this.f32509d, i, false);
        see.m35036a(parcel, 5, this.f32510e);
        see.m35063b(parcel, 6, this.f32511f);
        see.m35036a(parcel, 7, this.f32512g);
        see.m35046a(parcel, 8, this.f32513h, false);
        see.m35046a(parcel, 9, this.f32514i, false);
        see.m35046a(parcel, 14, this.f32515j, false);
        see.m35040a(parcel, 15, this.f32516k, i, false);
        see.m35040a(parcel, 16, this.f32517l, i, false);
        see.m35051a(parcel, 18, this.f32518m);
        see.m35051a(parcel, 19, this.f32519n);
        see.m35046a(parcel, 20, this.f32520o, false);
        see.m35046a(parcel, 21, this.f32521p, false);
        see.m35040a(parcel, 22, this.f32522q, i, false);
        see.m35046a(parcel, 23, this.f32523r, false);
        see.m35040a(parcel, 24, this.f32524s, i, false);
        see.m35046a(parcel, 25, this.f32525t, false);
        see.m35063b(parcel, 26, this.f32526u);
        see.m35036a(parcel, 27, this.f32527v);
        see.m35051a(parcel, 28, this.f32528w);
        see.m35036a(parcel, 29, this.f32529x);
        see.m35040a(parcel, 33, this.f32530y, i, false);
        see.m35062b(parcel, a);
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j, int i, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i2, long j3, boolean z3, long j4, PlayerRelationshipInfoEntity playerRelationshipInfoEntity) {
        this.f32506a = str;
        this.f32507b = str2;
        this.f32508c = uri;
        this.f32513h = str3;
        this.f32509d = uri2;
        this.f32514i = str4;
        this.f32510e = j;
        this.f32511f = i;
        this.f32512g = j2;
        this.f32515j = str5;
        this.f32518m = z;
        this.f32516k = mostRecentGameInfoEntity;
        this.f32517l = playerLevelInfo;
        this.f32519n = z2;
        this.f32520o = str6;
        this.f32521p = str7;
        this.f32522q = uri3;
        this.f32523r = str8;
        this.f32524s = uri4;
        this.f32525t = str9;
        this.f32526u = i2;
        this.f32527v = j3;
        this.f32528w = z3;
        this.f32529x = j4;
        this.f32530y = playerRelationshipInfoEntity;
    }
}
