package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new amez();

    /* renamed from: a */
    public final int f81939a;
    @Deprecated

    /* renamed from: b */
    public final String f81940b;

    /* renamed from: c */
    public final String f81941c;

    /* renamed from: d */
    public final String f81942d;

    /* renamed from: e */
    public final String f81943e;

    /* renamed from: f */
    public final String f81944f;

    /* renamed from: g */
    public final Long f81945g;

    /* renamed from: h */
    public final Long f81946h;

    @Deprecated
    public AvatarReference(int i, String str) {
        sdo.m34970a(true);
        this.f81939a = i;
        this.f81940b = str;
        this.f81941c = null;
        this.f81942d = null;
        this.f81943e = null;
        this.f81944f = null;
        this.f81945g = null;
        this.f81946h = null;
    }

    /* renamed from: a */
    public final boolean mo46360a() {
        return this.f81941c == null && this.f81942d == null && this.f81943e == null && this.f81944f == null && this.f81945g == null && this.f81946h == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            return this.f81939a == avatarReference.f81939a && sdg.m34949a(this.f81940b, avatarReference.f81940b) && sdg.m34949a(this.f81941c, avatarReference.f81941c) && sdg.m34949a(this.f81942d, avatarReference.f81942d) && sdg.m34949a(this.f81943e, avatarReference.f81943e) && sdg.m34949a(this.f81944f, avatarReference.f81944f) && sdg.m34949a(this.f81945g, avatarReference.f81945g) && sdg.m34949a(this.f81946h, avatarReference.f81946h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81939a), this.f81940b, this.f81941c, this.f81943e, this.f81944f, this.f81945g, this.f81946h});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("source", Integer.valueOf(this.f81939a));
        a.mo25396a("location", this.f81940b);
        a.mo25396a("url", this.f81941c);
        a.mo25396a("email", this.f81942d);
        a.mo25396a("account", this.f81943e);
        a.mo25396a("focusId", this.f81944f);
        a.mo25396a("contactId", this.f81945g);
        a.mo25396a("rawContactId", this.f81946h);
        return a.toString();
    }

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f81939a = i;
        this.f81940b = TextUtils.isEmpty(str) ? null : str;
        this.f81941c = TextUtils.isEmpty(str2) ? null : str2;
        this.f81942d = TextUtils.isEmpty(str3) ? null : str3;
        this.f81943e = TextUtils.isEmpty(str4) ? null : str4;
        this.f81944f = TextUtils.isEmpty(str5) ? null : str5;
        this.f81945g = l;
        this.f81946h = l2;
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
        see.m35063b(parcel, 1, this.f81939a);
        see.m35046a(parcel, 2, this.f81940b, false);
        see.m35046a(parcel, 3, this.f81941c, false);
        see.m35046a(parcel, 4, this.f81942d, false);
        see.m35046a(parcel, 5, this.f81943e, false);
        see.m35046a(parcel, 6, this.f81944f, false);
        see.m35045a(parcel, 7, this.f81945g);
        see.m35045a(parcel, 8, this.f81946h);
        see.m35062b(parcel, a);
    }
}
