package com.google.firebase.auth.api.aidlresponses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnFailedIdpSignInAidlResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkw();

    /* renamed from: a */
    public final Status f152487a;

    /* renamed from: b */
    public final DefaultOAuthCredential f152488b;

    /* renamed from: c */
    public final String f152489c;

    /* renamed from: d */
    public final String f152490d;

    public OnFailedIdpSignInAidlResponse(Status status, DefaultOAuthCredential defaultOAuthCredential, String str, String str2) {
        this.f152487a = status;
        this.f152488b = defaultOAuthCredential;
        this.f152489c = str;
        this.f152490d = str2;
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
        see.m35040a(parcel, 1, this.f152487a, i, false);
        see.m35040a(parcel, 2, this.f152488b, i, false);
        see.m35046a(parcel, 3, this.f152489c, false);
        see.m35046a(parcel, 4, this.f152490d, false);
        see.m35062b(parcel, a);
    }
}
