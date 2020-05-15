package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Parcelable.Creator CREATOR = new aaew();

    /* renamed from: a */
    public final GameEntity f32656a;

    /* renamed from: b */
    public final String f32657b;

    /* renamed from: c */
    public final long f32658c;

    /* renamed from: d */
    public final int f32659d;

    /* renamed from: e */
    public final ParticipantEntity f32660e;

    /* renamed from: f */
    public final int f32661f;

    /* renamed from: g */
    public final int f32662g;

    /* renamed from: h */
    private final ArrayList f32663h;

    public InvitationEntity(GameEntity gameEntity, String str, long j, int i, ParticipantEntity participantEntity, ArrayList arrayList, int i2, int i3) {
        this.f32656a = gameEntity;
        this.f32657b = str;
        this.f32658c = j;
        this.f32659d = i;
        this.f32660e = participantEntity;
        this.f32663h = arrayList;
        this.f32661f = i2;
        this.f32662g = i3;
    }

    /* renamed from: a */
    public final Game mo19432a() {
        return this.f32656a;
    }

    /* renamed from: b */
    public final String mo19433b() {
        return this.f32657b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Participant mo19434c() {
        return this.f32660e;
    }

    /* renamed from: d */
    public final long mo19435d() {
        return this.f32658c;
    }

    /* renamed from: f */
    public final int mo19436f() {
        return this.f32659d;
    }

    /* renamed from: g */
    public final int mo19437g() {
        return this.f32661f;
    }

    /* renamed from: h */
    public final int mo19438h() {
        return this.f32662g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32656a, this.f32657b, Long.valueOf(this.f32658c), Integer.valueOf(this.f32659d), this.f32660e, mo16817i(), Integer.valueOf(this.f32661f), Integer.valueOf(this.f32662g)});
    }

    /* renamed from: i */
    public final ArrayList mo16817i() {
        return new ArrayList(this.f32663h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Invitation) {
            if (this == obj) {
                return true;
            }
            Invitation invitation = (Invitation) obj;
            if (!sdg.m34949a(invitation.mo19432a(), this.f32656a) || !sdg.m34949a(invitation.mo19433b(), this.f32657b) || !sdg.m34949a(Long.valueOf(invitation.mo19435d()), Long.valueOf(this.f32658c)) || !sdg.m34949a(Integer.valueOf(invitation.mo19436f()), Integer.valueOf(this.f32659d)) || !sdg.m34949a(invitation.mo19434c(), this.f32660e) || !sdg.m34949a(invitation.mo16817i(), mo16817i()) || !sdg.m34949a(Integer.valueOf(invitation.mo19437g()), Integer.valueOf(this.f32661f)) || !sdg.m34949a(Integer.valueOf(invitation.mo19438h()), Integer.valueOf(this.f32662g))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Game", this.f32656a);
        a.mo25396a("InvitationId", this.f32657b);
        a.mo25396a("CreationTimestamp", Long.valueOf(this.f32658c));
        a.mo25396a("InvitationType", Integer.valueOf(this.f32659d));
        a.mo25396a("Inviter", this.f32660e);
        a.mo25396a("Participants", mo16817i());
        a.mo25396a("Variant", Integer.valueOf(this.f32661f));
        a.mo25396a("AvailableAutoMatchSlots", Integer.valueOf(this.f32662g));
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
        see.m35040a(parcel, 1, this.f32656a, i, false);
        see.m35046a(parcel, 2, this.f32657b, false);
        see.m35036a(parcel, 3, this.f32658c);
        see.m35063b(parcel, 4, this.f32659d);
        see.m35040a(parcel, 5, this.f32660e, i, false);
        see.m35066c(parcel, 6, mo16817i(), false);
        see.m35063b(parcel, 7, this.f32661f);
        see.m35063b(parcel, 8, this.f32662g);
        see.m35062b(parcel, a);
    }
}
