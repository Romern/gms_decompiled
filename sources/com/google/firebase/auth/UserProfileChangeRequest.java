package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brjo();

    /* renamed from: a */
    public String f152412a;

    /* renamed from: b */
    public String f152413b;

    /* renamed from: c */
    public boolean f152414c;

    /* renamed from: d */
    public boolean f152415d;

    /* renamed from: e */
    public Uri f152416e;

    public UserProfileChangeRequest(String str, String str2, boolean z, boolean z2) {
        this.f152412a = str;
        this.f152413b = str2;
        this.f152414c = z;
        this.f152415d = z2;
        this.f152416e = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
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
        see.m35046a(parcel, 2, this.f152412a, false);
        see.m35046a(parcel, 3, this.f152413b, false);
        see.m35051a(parcel, 4, this.f152414c);
        see.m35051a(parcel, 5, this.f152415d);
        see.m35062b(parcel, a);
    }
}
