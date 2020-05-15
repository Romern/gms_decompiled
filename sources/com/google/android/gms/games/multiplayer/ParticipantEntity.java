package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Parcelable.Creator CREATOR = new aaey();

    /* renamed from: a */
    public final String f32664a;

    /* renamed from: b */
    public final int f32665b;

    /* renamed from: c */
    public final String f32666c;

    /* renamed from: d */
    public final boolean f32667d;

    /* renamed from: e */
    public final PlayerEntity f32668e;

    /* renamed from: f */
    public final int f32669f;

    /* renamed from: g */
    public final ParticipantResult f32670g;

    /* renamed from: h */
    private final String f32671h;

    /* renamed from: i */
    private final Uri f32672i;

    /* renamed from: j */
    private final Uri f32673j;

    /* renamed from: k */
    private final String f32674k;

    /* renamed from: l */
    private final String f32675l;

    public ParticipantEntity(String str, String str2, Uri uri, Uri uri2, int i, String str3, boolean z, PlayerEntity playerEntity, int i2, ParticipantResult participantResult, String str4, String str5) {
        this.f32664a = str;
        this.f32671h = str2;
        this.f32672i = uri;
        this.f32673j = uri2;
        this.f32665b = i;
        this.f32666c = str3;
        this.f32667d = z;
        this.f32668e = playerEntity;
        this.f32669f = i2;
        this.f32670g = participantResult;
        this.f32674k = str4;
        this.f32675l = str5;
    }

    /* renamed from: a */
    public final int mo19443a() {
        return this.f32665b;
    }

    /* renamed from: b */
    public final String mo19444b() {
        return this.f32666c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final int mo19445c() {
        return this.f32669f;
    }

    /* renamed from: d */
    public final boolean mo19446d() {
        return this.f32667d;
    }

    /* renamed from: f */
    public final String mo19447f() {
        PlayerEntity playerEntity = this.f32668e;
        return playerEntity == null ? this.f32671h : playerEntity.f32507b;
    }

    /* renamed from: g */
    public final Uri mo19448g() {
        PlayerEntity playerEntity = this.f32668e;
        return playerEntity == null ? this.f32672i : playerEntity.f32508c;
    }

    public final String getHiResImageUrl() {
        PlayerEntity playerEntity = this.f32668e;
        return playerEntity == null ? this.f32675l : playerEntity.f32514i;
    }

    public final String getIconImageUrl() {
        PlayerEntity playerEntity = this.f32668e;
        return playerEntity == null ? this.f32674k : playerEntity.f32513h;
    }

    /* renamed from: h */
    public final Uri mo19451h() {
        PlayerEntity playerEntity = this.f32668e;
        return playerEntity == null ? this.f32673j : playerEntity.f32509d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32668e, Integer.valueOf(this.f32665b), this.f32666c, Boolean.valueOf(this.f32667d), mo19447f(), mo19448g(), mo19451h(), Integer.valueOf(this.f32669f), this.f32670g, this.f32664a});
    }

    /* renamed from: i */
    public final String mo19452i() {
        return this.f32664a;
    }

    /* renamed from: j */
    public final Player mo19453j() {
        return this.f32668e;
    }

    /* renamed from: k */
    public final ParticipantResult mo19454k() {
        return this.f32670g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Participant) {
            if (this == obj) {
                return true;
            }
            Participant participant = (Participant) obj;
            if (!sdg.m34949a(participant.mo19453j(), this.f32668e) || !sdg.m34949a(Integer.valueOf(participant.mo19443a()), Integer.valueOf(this.f32665b)) || !sdg.m34949a(participant.mo19444b(), this.f32666c) || !sdg.m34949a(Boolean.valueOf(participant.mo19446d()), Boolean.valueOf(this.f32667d)) || !sdg.m34949a(participant.mo19447f(), mo19447f()) || !sdg.m34949a(participant.mo19448g(), mo19448g()) || !sdg.m34949a(participant.mo19451h(), mo19451h()) || !sdg.m34949a(Integer.valueOf(participant.mo19445c()), Integer.valueOf(this.f32669f)) || !sdg.m34949a(participant.mo19454k(), this.f32670g) || !sdg.m34949a(participant.mo19452i(), this.f32664a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ParticipantId", this.f32664a);
        a.mo25396a("Player", this.f32668e);
        a.mo25396a("Status", Integer.valueOf(this.f32665b));
        a.mo25396a("ClientAddress", this.f32666c);
        a.mo25396a("ConnectedToRoom", Boolean.valueOf(this.f32667d));
        a.mo25396a("DisplayName", mo19447f());
        a.mo25396a("IconImage", mo19448g());
        a.mo25396a("IconImageUrl", getIconImageUrl());
        a.mo25396a("HiResImage", mo19451h());
        a.mo25396a("HiResImageUrl", getHiResImageUrl());
        a.mo25396a("Capabilities", Integer.valueOf(this.f32669f));
        a.mo25396a("Result", this.f32670g);
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
        see.m35046a(parcel, 1, this.f32664a, false);
        see.m35046a(parcel, 2, mo19447f(), false);
        see.m35040a(parcel, 3, mo19448g(), i, false);
        see.m35040a(parcel, 4, mo19451h(), i, false);
        see.m35063b(parcel, 5, this.f32665b);
        see.m35046a(parcel, 6, this.f32666c, false);
        see.m35051a(parcel, 7, this.f32667d);
        see.m35040a(parcel, 8, this.f32668e, i, false);
        see.m35063b(parcel, 9, this.f32669f);
        see.m35040a(parcel, 10, this.f32670g, i, false);
        see.m35046a(parcel, 11, getIconImageUrl(), false);
        see.m35046a(parcel, 12, getHiResImageUrl(), false);
        see.m35062b(parcel, a);
    }
}
