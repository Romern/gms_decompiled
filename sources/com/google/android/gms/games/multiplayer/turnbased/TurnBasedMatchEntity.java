package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TurnBasedMatchEntity extends GamesAbstractSafeParcelable implements TurnBasedMatch {
    public static final Parcelable.Creator CREATOR = new aaff();

    /* renamed from: a */
    public final GameEntity f32691a;

    /* renamed from: b */
    public final String f32692b;

    /* renamed from: c */
    public final String f32693c;

    /* renamed from: d */
    public final long f32694d;

    /* renamed from: e */
    public final String f32695e;

    /* renamed from: f */
    public final long f32696f;

    /* renamed from: g */
    public final String f32697g;

    /* renamed from: h */
    public final int f32698h;

    /* renamed from: i */
    public final int f32699i;

    /* renamed from: j */
    public final int f32700j;

    /* renamed from: k */
    public final byte[] f32701k;

    /* renamed from: l */
    public final String f32702l;

    /* renamed from: m */
    public final byte[] f32703m;

    /* renamed from: n */
    public final int f32704n;

    /* renamed from: o */
    public final Bundle f32705o;

    /* renamed from: p */
    public final int f32706p;

    /* renamed from: q */
    public final boolean f32707q;

    /* renamed from: r */
    public final String f32708r;

    /* renamed from: s */
    public final String f32709s;

    /* renamed from: t */
    private final ArrayList f32710t;

    public TurnBasedMatchEntity(GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i, int i2, int i3, byte[] bArr, ArrayList arrayList, String str5, byte[] bArr2, int i4, Bundle bundle, int i5, boolean z, String str6, String str7) {
        this.f32691a = gameEntity;
        this.f32692b = str;
        this.f32693c = str2;
        this.f32694d = j;
        this.f32695e = str3;
        this.f32696f = j2;
        this.f32697g = str4;
        this.f32698h = i;
        this.f32706p = i5;
        this.f32699i = i2;
        this.f32700j = i3;
        this.f32701k = bArr;
        this.f32710t = arrayList;
        this.f32702l = str5;
        this.f32703m = bArr2;
        this.f32704n = i4;
        this.f32705o = bundle;
        this.f32707q = z;
        this.f32708r = str6;
        this.f32709s = str7;
    }

    /* renamed from: a */
    public final Game mo19476a() {
        return this.f32691a;
    }

    /* renamed from: b */
    public final String mo19477b() {
        return this.f32692b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19478c() {
        return this.f32693c;
    }

    /* renamed from: d */
    public final long mo19479d() {
        return this.f32694d;
    }

    /* renamed from: f */
    public final int mo19480f() {
        return this.f32698h;
    }

    /* renamed from: g */
    public final int mo19481g() {
        return this.f32706p;
    }

    /* renamed from: h */
    public final String mo19482h() {
        return this.f32708r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32691a, this.f32692b, this.f32693c, Long.valueOf(this.f32694d), this.f32695e, Long.valueOf(this.f32696f), this.f32697g, Integer.valueOf(this.f32698h), Integer.valueOf(this.f32706p), this.f32708r, Integer.valueOf(this.f32699i), Integer.valueOf(this.f32700j), mo16817i(), this.f32702l, Integer.valueOf(this.f32704n), Integer.valueOf(aaeb.m21131a(this.f32705o)), Integer.valueOf(mo19491r()), Boolean.valueOf(this.f32707q)});
    }

    /* renamed from: i */
    public final ArrayList mo16817i() {
        return new ArrayList(this.f32710t);
    }

    /* renamed from: j */
    public final int mo19483j() {
        return this.f32699i;
    }

    /* renamed from: k */
    public final String mo19484k() {
        return this.f32695e;
    }

    /* renamed from: l */
    public final long mo19485l() {
        return this.f32696f;
    }

    /* renamed from: m */
    public final String mo19486m() {
        return this.f32697g;
    }

    /* renamed from: n */
    public final int mo19487n() {
        return this.f32700j;
    }

    /* renamed from: o */
    public final String mo19488o() {
        return this.f32702l;
    }

    /* renamed from: p */
    public final int mo19489p() {
        return this.f32704n;
    }

    /* renamed from: q */
    public final Bundle mo19490q() {
        return this.f32705o;
    }

    /* renamed from: r */
    public final int mo19491r() {
        Bundle bundle = this.f32705o;
        if (bundle != null) {
            return bundle.getInt("max_automatch_players");
        }
        return 0;
    }

    /* renamed from: s */
    public final boolean mo19492s() {
        return this.f32707q;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TurnBasedMatch) {
            if (this == obj) {
                return true;
            }
            TurnBasedMatch turnBasedMatch = (TurnBasedMatch) obj;
            if (!sdg.m34949a(turnBasedMatch.mo19476a(), this.f32691a) || !sdg.m34949a(turnBasedMatch.mo19477b(), this.f32692b) || !sdg.m34949a(turnBasedMatch.mo19478c(), this.f32693c) || !sdg.m34949a(Long.valueOf(turnBasedMatch.mo19479d()), Long.valueOf(this.f32694d)) || !sdg.m34949a(turnBasedMatch.mo19484k(), this.f32695e) || !sdg.m34949a(Long.valueOf(turnBasedMatch.mo19485l()), Long.valueOf(this.f32696f)) || !sdg.m34949a(turnBasedMatch.mo19486m(), this.f32697g) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19480f()), Integer.valueOf(this.f32698h)) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19481g()), Integer.valueOf(this.f32706p)) || !sdg.m34949a(turnBasedMatch.mo19482h(), this.f32708r) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19483j()), Integer.valueOf(this.f32699i)) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19487n()), Integer.valueOf(this.f32700j)) || !sdg.m34949a(turnBasedMatch.mo16817i(), mo16817i()) || !sdg.m34949a(turnBasedMatch.mo19488o(), this.f32702l) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19489p()), Integer.valueOf(this.f32704n)) || !aaeb.m21132a(turnBasedMatch.mo19490q(), this.f32705o) || !sdg.m34949a(Integer.valueOf(turnBasedMatch.mo19491r()), Integer.valueOf(mo19491r())) || !sdg.m34949a(Boolean.valueOf(turnBasedMatch.mo19492s()), Boolean.valueOf(this.f32707q))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Game", this.f32691a);
        a.mo25396a("MatchId", this.f32692b);
        a.mo25396a("CreatorId", this.f32693c);
        a.mo25396a("CreationTimestamp", Long.valueOf(this.f32694d));
        a.mo25396a("LastUpdaterId", this.f32695e);
        a.mo25396a("LastUpdatedTimestamp", Long.valueOf(this.f32696f));
        a.mo25396a("PendingParticipantId", this.f32697g);
        a.mo25396a("MatchStatus", Integer.valueOf(this.f32698h));
        a.mo25396a("TurnStatus", Integer.valueOf(this.f32706p));
        a.mo25396a("Description", this.f32708r);
        a.mo25396a("Variant", Integer.valueOf(this.f32699i));
        a.mo25396a("Data", this.f32701k);
        a.mo25396a("Version", Integer.valueOf(this.f32700j));
        a.mo25396a("Participants", mo16817i());
        a.mo25396a("RematchId", this.f32702l);
        a.mo25396a("PreviousData", this.f32703m);
        a.mo25396a("MatchNumber", Integer.valueOf(this.f32704n));
        a.mo25396a("AutoMatchCriteria", this.f32705o);
        a.mo25396a("AvailableAutoMatchSlots", Integer.valueOf(mo19491r()));
        a.mo25396a("LocallyModified", Boolean.valueOf(this.f32707q));
        a.mo25396a("DescriptionParticipantId", this.f32709s);
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
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
        see.m35040a(parcel, 1, this.f32691a, i, false);
        see.m35046a(parcel, 2, this.f32692b, false);
        see.m35046a(parcel, 3, this.f32693c, false);
        see.m35036a(parcel, 4, this.f32694d);
        see.m35046a(parcel, 5, this.f32695e, false);
        see.m35036a(parcel, 6, this.f32696f);
        see.m35046a(parcel, 7, this.f32697g, false);
        see.m35063b(parcel, 8, this.f32698h);
        see.m35063b(parcel, 10, this.f32699i);
        see.m35063b(parcel, 11, this.f32700j);
        see.m35052a(parcel, 12, this.f32701k, false);
        see.m35066c(parcel, 13, mo16817i(), false);
        see.m35046a(parcel, 14, this.f32702l, false);
        see.m35052a(parcel, 15, this.f32703m, false);
        see.m35063b(parcel, 16, this.f32704n);
        see.m35037a(parcel, 17, this.f32705o, false);
        see.m35063b(parcel, 18, this.f32706p);
        see.m35051a(parcel, 19, this.f32707q);
        see.m35046a(parcel, 20, this.f32708r, false);
        see.m35046a(parcel, 21, this.f32709s, false);
        see.m35062b(parcel, a);
    }
}
