package com.google.firebase.auth.api.aidlresponses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnFailedMfaSignInAidlResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkx();

    /* renamed from: a */
    String f152491a;

    /* renamed from: b */
    List f152492b;

    /* renamed from: c */
    DefaultOAuthCredential f152493c;

    public OnFailedMfaSignInAidlResponse(String str, List list, DefaultOAuthCredential defaultOAuthCredential) {
        this.f152491a = str;
        this.f152492b = list;
        this.f152493c = defaultOAuthCredential;
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
        see.m35046a(parcel, 1, this.f152491a, false);
        see.m35066c(parcel, 2, this.f152492b, false);
        see.m35040a(parcel, 3, this.f152493c, i, false);
        see.m35062b(parcel, a);
    }
}
