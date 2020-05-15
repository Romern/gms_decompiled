package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AchievementEntity extends GamesAbstractSafeParcelable implements Achievement {
    public static final Parcelable.Creator CREATOR = new aadg();

    /* renamed from: a */
    public final String f32542a;

    /* renamed from: b */
    public final int f32543b;

    /* renamed from: c */
    public final String f32544c;

    /* renamed from: d */
    public final String f32545d;

    /* renamed from: e */
    public final Uri f32546e;

    /* renamed from: f */
    public final String f32547f;

    /* renamed from: g */
    public final Uri f32548g;

    /* renamed from: h */
    public final String f32549h;

    /* renamed from: i */
    public final int f32550i;

    /* renamed from: j */
    public final String f32551j;

    /* renamed from: k */
    public final PlayerEntity f32552k;

    /* renamed from: l */
    public final int f32553l;

    /* renamed from: m */
    public final int f32554m;

    /* renamed from: n */
    public final String f32555n;

    /* renamed from: o */
    public final long f32556o;

    /* renamed from: p */
    public final long f32557p;

    /* renamed from: q */
    public final float f32558q;

    /* renamed from: r */
    public final String f32559r;

    public AchievementEntity(String str, int i, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i2, String str6, PlayerEntity playerEntity, int i3, int i4, String str7, long j, long j2, float f, String str8) {
        this.f32542a = str;
        this.f32543b = i;
        this.f32544c = str2;
        this.f32545d = str3;
        this.f32546e = uri;
        this.f32547f = str4;
        this.f32548g = uri2;
        this.f32549h = str5;
        this.f32550i = i2;
        this.f32551j = str6;
        this.f32552k = playerEntity;
        this.f32553l = i3;
        this.f32554m = i4;
        this.f32555n = str7;
        this.f32556o = j;
        this.f32557p = j2;
        this.f32558q = f;
        this.f32559r = str8;
    }

    /* renamed from: a */
    public final String mo19279a() {
        return this.f32542a;
    }

    /* renamed from: b */
    public final String mo19280b() {
        return this.f32559r;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final int mo19281c() {
        return this.f32543b;
    }

    /* renamed from: d */
    public final String mo19282d() {
        return this.f32544c;
    }

    /* renamed from: f */
    public final String mo19283f() {
        return this.f32545d;
    }

    /* renamed from: g */
    public final int mo19284g() {
        boolean z = true;
        if (this.f32543b != 1) {
            z = false;
        }
        rzz.m34729a(z);
        return this.f32550i;
    }

    /* renamed from: h */
    public final Player mo19285h() {
        return this.f32552k;
    }

    public final int hashCode() {
        int i;
        int i2;
        if (this.f32543b == 1) {
            i2 = mo19287j();
            i = mo19284g();
        } else {
            i2 = 0;
            i = 0;
        }
        return Arrays.hashCode(new Object[]{this.f32542a, this.f32559r, this.f32544c, Integer.valueOf(this.f32543b), this.f32545d, Long.valueOf(this.f32557p), Integer.valueOf(this.f32553l), Long.valueOf(this.f32556o), this.f32552k, Integer.valueOf(i2), Integer.valueOf(i)});
    }

    /* renamed from: i */
    public final int mo19286i() {
        return this.f32553l;
    }

    /* renamed from: j */
    public final int mo19287j() {
        boolean z = true;
        if (this.f32543b != 1) {
            z = false;
        }
        rzz.m34729a(z);
        return this.f32554m;
    }

    /* renamed from: k */
    public final long mo19288k() {
        return this.f32556o;
    }

    /* renamed from: l */
    public final long mo19289l() {
        return this.f32557p;
    }

    /* renamed from: m */
    public final float mo19290m() {
        return this.f32558q;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Achievement) {
            if (this == obj) {
                return true;
            }
            Achievement achievement = (Achievement) obj;
            int c = achievement.mo19281c();
            int i = this.f32543b;
            if (c != i) {
                return false;
            }
            if ((i == 1 && (achievement.mo19287j() != mo19287j() || achievement.mo19284g() != mo19284g())) || achievement.mo19289l() != this.f32557p || achievement.mo19286i() != this.f32553l || achievement.mo19288k() != this.f32556o || !sdg.m34949a(achievement.mo19279a(), this.f32542a) || !sdg.m34949a(achievement.mo19280b(), this.f32559r) || !sdg.m34949a(achievement.mo19282d(), this.f32544c) || !sdg.m34949a(achievement.mo19283f(), this.f32545d) || !sdg.m34949a(achievement.mo19285h(), this.f32552k) || achievement.mo19290m() != this.f32558q) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Id", this.f32542a);
        a.mo25396a("Game Id", this.f32559r);
        a.mo25396a("Type", Integer.valueOf(this.f32543b));
        a.mo25396a("Name", this.f32544c);
        a.mo25396a("Description", this.f32545d);
        a.mo25396a("Player", this.f32552k);
        a.mo25396a("State", Integer.valueOf(this.f32553l));
        a.mo25396a("Rarity Percent", Float.valueOf(this.f32558q));
        if (this.f32543b == 1) {
            a.mo25396a("CurrentSteps", Integer.valueOf(mo19287j()));
            a.mo25396a("TotalSteps", Integer.valueOf(mo19284g()));
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
        see.m35046a(parcel, 1, this.f32542a, false);
        see.m35063b(parcel, 2, this.f32543b);
        see.m35046a(parcel, 3, this.f32544c, false);
        see.m35046a(parcel, 4, this.f32545d, false);
        see.m35040a(parcel, 5, this.f32546e, i, false);
        see.m35046a(parcel, 6, this.f32547f, false);
        see.m35040a(parcel, 7, this.f32548g, i, false);
        see.m35046a(parcel, 8, this.f32549h, false);
        see.m35063b(parcel, 9, this.f32550i);
        see.m35046a(parcel, 10, this.f32551j, false);
        see.m35040a(parcel, 11, this.f32552k, i, false);
        see.m35063b(parcel, 12, this.f32553l);
        see.m35063b(parcel, 13, this.f32554m);
        see.m35046a(parcel, 14, this.f32555n, false);
        see.m35036a(parcel, 15, this.f32556o);
        see.m35036a(parcel, 16, this.f32557p);
        see.m35034a(parcel, 17, this.f32558q);
        see.m35046a(parcel, 18, this.f32559r, false);
        see.m35062b(parcel, a);
    }
}
