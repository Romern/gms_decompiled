package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EventEntity extends GamesAbstractSafeParcelable implements Event {
    public static final Parcelable.Creator CREATOR = new aady();

    /* renamed from: a */
    public final String f32606a;

    /* renamed from: b */
    public final String f32607b;

    /* renamed from: c */
    public final String f32608c;

    /* renamed from: d */
    public final Uri f32609d;

    /* renamed from: e */
    public final String f32610e;

    /* renamed from: f */
    public final PlayerEntity f32611f;

    /* renamed from: g */
    public final long f32612g;

    /* renamed from: h */
    public final String f32613h;

    /* renamed from: i */
    public final boolean f32614i;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.f32606a = str;
        this.f32607b = str2;
        this.f32608c = str3;
        this.f32609d = uri;
        this.f32610e = str4;
        this.f32611f = new PlayerEntity(player);
        this.f32612g = j;
        this.f32613h = str5;
        this.f32614i = z;
    }

    /* renamed from: a */
    public final String mo19364a() {
        return this.f32606a;
    }

    /* renamed from: b */
    public final String mo19365b() {
        return this.f32607b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19366c() {
        return this.f32608c;
    }

    /* renamed from: d */
    public final Uri mo19367d() {
        return this.f32609d;
    }

    /* renamed from: f */
    public final Player mo19368f() {
        return this.f32611f;
    }

    /* renamed from: g */
    public final long mo19369g() {
        return this.f32612g;
    }

    public final String getIconImageUrl() {
        return this.f32610e;
    }

    /* renamed from: h */
    public final String mo19371h() {
        return this.f32613h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32606a, this.f32607b, this.f32608c, this.f32609d, this.f32610e, this.f32611f, Long.valueOf(this.f32612g), this.f32613h, Boolean.valueOf(this.f32614i)});
    }

    /* renamed from: i */
    public final boolean mo19372i() {
        return this.f32614i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Event) {
            if (this == obj) {
                return true;
            }
            Event event = (Event) obj;
            if (!sdg.m34949a(event.mo19364a(), this.f32606a) || !sdg.m34949a(event.mo19365b(), this.f32607b) || !sdg.m34949a(event.mo19366c(), this.f32608c) || !sdg.m34949a(event.mo19367d(), this.f32609d) || !sdg.m34949a(event.getIconImageUrl(), this.f32610e) || !sdg.m34949a(event.mo19368f(), this.f32611f) || !sdg.m34949a(Long.valueOf(event.mo19369g()), Long.valueOf(this.f32612g)) || !sdg.m34949a(event.mo19371h(), this.f32613h) || !sdg.m34949a(Boolean.valueOf(event.mo19372i()), Boolean.valueOf(this.f32614i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Id", this.f32606a);
        a.mo25396a("Name", this.f32607b);
        a.mo25396a("Description", this.f32608c);
        a.mo25396a("IconImageUri", this.f32609d);
        a.mo25396a("IconImageUrl", this.f32610e);
        a.mo25396a("Player", this.f32611f);
        a.mo25396a("Value", Long.valueOf(this.f32612g));
        a.mo25396a("FormattedValue", this.f32613h);
        a.mo25396a("isVisible", Boolean.valueOf(this.f32614i));
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
        see.m35046a(parcel, 1, this.f32606a, false);
        see.m35046a(parcel, 2, this.f32607b, false);
        see.m35046a(parcel, 3, this.f32608c, false);
        see.m35040a(parcel, 4, this.f32609d, i, false);
        see.m35046a(parcel, 5, this.f32610e, false);
        see.m35040a(parcel, 6, this.f32611f, i, false);
        see.m35036a(parcel, 7, this.f32612g);
        see.m35046a(parcel, 8, this.f32613h, false);
        see.m35051a(parcel, 9, this.f32614i);
        see.m35062b(parcel, a);
    }
}
